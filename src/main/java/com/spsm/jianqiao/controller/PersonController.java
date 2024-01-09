package com.spsm.jianqiao.controller;

import com.spsm.jianqiao.esb.IPersonService;
import com.spsm.jianqiao.pojo.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private IPersonService personService;

    @GetMapping("/test")
    public Object test(String username){
        Map<String, Object> result = new HashMap<String, Object>();
        String str = personService.sayHello(username);
        result.put("code", "2000");
        result.put("message", str);
        return result;
    }


    @GetMapping("/get")
    public Object get(Integer id){
        Map<String, Object> result = new HashMap<String, Object>();
        Person person = personService.getPersonById(id);
        result.put("code", "2000");
        result.put("message", person);
        return result;
    }

    @GetMapping("/getAll")
    public Object get(){
        Map<String, Object> result = new HashMap<String, Object>();
        List<Person> all = personService.getAll();
        result.put("code", "2000");
        result.put("message", all);
        return result;
    }

    @PostMapping("/add")
    public Object add(Person person){
        Map<String, Object> result = new HashMap<String, Object>();
        personService.addPerson(person);
        result.put("code", "2000");
        result.put("message", "success");
        return result;
    }
    @PostMapping("/update")
    public Object update(Person person){
        Map<String, Object> result = new HashMap<String, Object>();
        personService.updatePerson(person);
        result.put("code", "2000");
        result.put("message", "sucess");
        return result;
    }
    @PostMapping("/delete")
    public Object delete(Integer id){
        Map<String, Object> result = new HashMap<String, Object>();
        personService.deletePerson(id);
        result.put("code", "2000");
        result.put("message", "sucess");
        return result;
    }
}
