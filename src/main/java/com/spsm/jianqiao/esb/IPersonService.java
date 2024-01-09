package com.spsm.jianqiao.esb;

import com.spsm.jianqiao.pojo.Person;

import java.util.List;

public interface IPersonService {

    /**
     * 打招呼
     * @param username
     * @return
     */
    String sayHello(String username);

    /**
     * 添加人员
     * @param person
     * @return
     */
    int addPerson(Person person);

    /**
     * 修改人员
     * @param person
     * @return
     */
    int updatePerson(Person person);

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    Person getPersonById(Integer id);

    /**
     * 查询所有用户
     * @return
     */
    List<Person> getAll();

    /**
     * 根据id删除用户
     * @param id
     * @return
     */
    int deletePerson(Integer id);
}
