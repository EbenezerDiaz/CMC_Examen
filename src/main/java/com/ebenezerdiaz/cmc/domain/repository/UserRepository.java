package com.ebenezerdiaz.cmc.domain.repository;

import com.ebenezerdiaz.cmc.persistence.entity.Usuario;

import java.util.List;

public interface UserRepository {

    public Usuario insert(Usuario usuario);

    public List<Usuario> getUsuarios();

}
