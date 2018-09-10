package com.example.demo.mapping;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

import com.example.demo.entity.User;

@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);
    
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "ID") // id自动增长
    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}