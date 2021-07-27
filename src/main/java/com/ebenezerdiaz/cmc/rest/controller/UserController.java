package com.ebenezerdiaz.cmc.rest.controller;

import com.ebenezerdiaz.cmc.domain.service.UserService;
import com.ebenezerdiaz.cmc.persistence.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/insert")
    public Usuario save(@RequestBody Usuario usuario){
        return userService.insert(usuario);
    }
//
//    @GetMapping("/{name}")
//    public User findUser(@PathVariable("name") String name){
//        return userService.getUserByName(name).get();
//    }

    @GetMapping("/getAll")
    public List<Usuario> findUser(){
        return userService.getUsuarios();
    }


}
