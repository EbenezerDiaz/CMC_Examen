package com.ebenezerdiaz.cmc.persistence;

import com.ebenezerdiaz.cmc.domain.repository.UserRepository;
import com.ebenezerdiaz.cmc.persistence.crud.UsuarioCrudRepository;
import com.ebenezerdiaz.cmc.persistence.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class UsuarioRepository implements UserRepository {

    @Autowired
    private UsuarioCrudRepository usuarioCrudRepository;

//    @Autowired
//    public UsuarioRepository(UsuarioCrudRepository usuarioCrudRepository) {
//        this.usuarioCrudRepository = usuarioCrudRepository;
//    }

    @Override
    public Usuario insert(Usuario usuario){
        return usuarioCrudRepository.save(usuario);
    }

    @Override
    public List<Usuario> getUsuarios(){
        return usuarioCrudRepository.findAll();
    }

}
