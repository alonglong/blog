package com.along.blog.service;

import com.along.blog.entity.Person;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Author along
 * @Date 2020/3/19 0:47
 */
public interface PersonService {

    /**
     * 添加
     * @param person
     * @return
     */
    Integer add(Person person);

    /**
     * 查询全部
     * @param pageNum
     * @param pageSize
     * @return
     */
    PageInfo<Person> findAllPerson(int pageNum, int pageSize);

    /**
     * 根据名字查询
     * @param name
     * @return
     */
    PageInfo<Person> findByName(String name);

    /**
     * 批量插入
     * @param list
     * @return
     */
    int insertBatch(List<Person> list);

    /**
     * 批量更新
     * @param list
     * @return
     */
    int updateBatch(List<Person> list);
}
