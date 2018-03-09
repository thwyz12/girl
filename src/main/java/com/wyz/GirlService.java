package com.wyz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by wyz on 2018/3/9.
 */
@Service
public class GirlService {

    @Autowired
    private GirlProperties girlProperties;
    @Autowired
    private GirlRepository girlRepository;

    @Transactional
    public void insertTwo(){
        Girl girl1 = new Girl();
        girl1.setCupSize(girlProperties.getCupSize());
        girl1.setAge(girlProperties.getAge());
        girlRepository.save(girl1);

        Girl girl2 = new Girl();
        girl2.setCupSize("F");
        girl2.setAge(15);
        girlRepository.save(girl2);
    }
}
