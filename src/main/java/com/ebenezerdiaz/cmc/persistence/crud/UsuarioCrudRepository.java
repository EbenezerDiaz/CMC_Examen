package com.ebenezerdiaz.cmc.persistence.crud;

import com.ebenezerdiaz.cmc.persistence.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioCrudRepository extends JpaRepository<Usuario, Integer> {

}
