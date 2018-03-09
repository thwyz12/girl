package com.wyz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by wyz on 2018/3/7.
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

//    @Value("${cupSize}")
//    private String cupSize;
//    @Value("${age}")
//    private Integer age;

    @Autowired
    private GirlProperties girlProperties;

    @RequestMapping(value = "/say",method = RequestMethod.GET)
    public String say(Integer id){
//        girlProperties.getCupSize()+":"+girlProperties.getAge()123
        return "id:"+id;
    }
}
