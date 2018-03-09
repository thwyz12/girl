package com.wyz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

/**
 * Created by wyz on 2018/3/9.
 */
@RestController
public class GirlController {

    @Autowired
    private GirlRepository girlRepository;
    @Autowired
    private GirlService girlService;

    /**
     * 查询女生列表 all
     * @return
     */
    @GetMapping("girls")
    public List<Girl> girlList(){
        return girlRepository.findAll();
    }

    /**
     * 添加bean
     * @param cupSize
     * @param age
     * @return
     */
    @GetMapping("addGirls")
    public Girl addGirls(String cupSize ,Integer age){
        Girl girl = new Girl();
        girl.setCupSize(cupSize);
        girl.setAge(age);
        return girlRepository.save(girl);
    }

    /**
     * 通过age查询bean
     * @param age
     * @return
     */
    @GetMapping("girlsByAge")
    public List<Girl> girlsByAge(Integer age){
        return girlRepository.findByAge(age);
    }

    @GetMapping("findGirlById")
    public Girl findGirlById(Integer id){
        return girlRepository.findGirlById(id);
    }

    @GetMapping("inserTwo")
    public void inserTwo(){
        girlService.insertTwo();
    }
}
