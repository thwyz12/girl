package com.wyz;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by wyz on 2018/3/9.
 */
public interface GirlRepository extends JpaRepository<Girl ,Integer>{
    /**
     * 根据年龄查询
     */
    public List<Girl> findByAge(Integer age);

    public Girl findGirlById(Integer id);
}
