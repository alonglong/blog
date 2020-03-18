package com.along.blog.dao;

import com.along.blog.entity.Person;
import com.along.blog.entity.PersonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PersonMapper {

    long countByExample(PersonExample example);

    int deleteByExample(PersonExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Person record);

    int insertSelective(Person record);

    List<Person> selectByExample(PersonExample example);

    Person selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Person record, @Param("example") PersonExample example);

    int updateByExample(@Param("record") Person record, @Param("example") PersonExample example);

    int updateByPrimaryKeySelective(Person record);

    int updateByPrimaryKey(Person record);

    /**
     * 批量插入
     * @param list
     * @return
     */
    int insertBatchSelective(List list);

    /**
     * 批量更新
     * @param list
     * @return
     */
    int updateBatchByPrimaryKeySelective(List list);
}