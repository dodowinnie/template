package com.spsm.jianqiao.impl;

import com.spsm.jianqiao.esb.IPersonService;
import com.spsm.jianqiao.mapper.PersonMapper;
import com.spsm.jianqiao.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements IPersonService {

    @Autowired
    private PersonMapper personMapper;

    @Override
    public String sayHello(String username) {
        return "hello " + username;
    }

    @Override
    public int addPerson(Person person) {
        return personMapper.insert(person);
    }

    @Override
    public int updatePerson(Person person) {
        return personMapper.updateByPrimaryKeySelective(person);
//        return personMapper.updateByPrimaryKey(person);
    }

    @Override
    public Person getPersonById(Integer id) {
        return personMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Person> getAll() {
        return personMapper.selectAll();
    }

    @Override
    public int deletePerson(Integer id) {
        return personMapper.deleteByPrimaryKey(id);
    }
}
