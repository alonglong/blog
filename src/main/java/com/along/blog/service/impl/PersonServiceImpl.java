package com.along.blog.service.impl;

import com.along.blog.dao.PersonMapper;
import com.along.blog.entity.Person;
import com.along.blog.entity.PersonExample;
import com.along.blog.service.PersonService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: service实现
 * @Author along
 * @Date 2020/3/19 0:48
 */
@Service(value = "personService")
public class PersonServiceImpl implements PersonService {

    private final PersonMapper personMapper;

    @Autowired
    public PersonServiceImpl(PersonMapper personMapper) {
        this.personMapper = personMapper;
    }

    @Override
    public Integer add(Person person) {
        return personMapper.insert(person);
    }

    @Override
    public PageInfo<Person> findAllPerson(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        PersonExample example = new PersonExample();
        List<Person> personList = personMapper.selectByExample(example);
        return new PageInfo<>(personList);
    }

    @Override
    public PageInfo<Person> findByName(String name) {
        PersonExample example = new PersonExample();
        PersonExample.Criteria criteria = example.createCriteria();
        criteria.andNameEqualTo(name);
        List<Person> personList = personMapper.selectByExample(example);
        return new PageInfo<>(personList);
    }

    @Override
    public int insertBatch(List<Person> list) {
        return personMapper.insertBatchSelective(list);
    }

    @Override
    public int updateBatch(List<Person> list) {
        return personMapper.updateBatchByPrimaryKeySelective(list);
    }
}
