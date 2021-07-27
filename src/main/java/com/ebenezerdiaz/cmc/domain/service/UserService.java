package com.ebenezerdiaz.cmc.domain.service;

import com.ebenezerdiaz.cmc.domain.repository.UserRepository;
import com.ebenezerdiaz.cmc.persistence.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Usuario insert(Usuario usuario) {
        return userRepository.insert(usuario);
    }

    public List<Usuario> getUsuarios(){
        return userRepository.getUsuarios();
    }

}