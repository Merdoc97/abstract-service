package com.example.controller;

import com.example.dao.UserDao;
import com.example.model.UserProperties;
import com.example.model.Users;
import com.example.service.abstracrService.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

/**
 * @author Igor
 */
@RestController
@RequestMapping("/api")
public class UserController {


    @Autowired
    @Qualifier(value = "abstractUserService")
    AbstractService abstractService;

    @Autowired
    @Qualifier(value = "abstractUserServiceProp")
    AbstractService abstractServiceProps;

    @RequestMapping(value = "/props",method = RequestMethod.GET)
    public List<UserProperties>getProps(){
        return abstractServiceProps.getAll();
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public Collection<Users> getUsers() {
        return  abstractService.getAll();
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public Users getUserId(@PathVariable Integer id) {
        return (Users) abstractService.getById(id);
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer id) {
        /*userService.delete(id);*/
    }

}
