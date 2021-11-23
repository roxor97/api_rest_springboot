package com.projetspringboot.springboot_project.repositories;


import java.util.List;

import com.projetspringboot.springboot_project.models.UsuarioModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//creo una interface que hereda de CrudRepository para la utilizacion de los metodos de la clase UsuarioModel
@Repository
public interface UsuarioRespository extends CrudRepository<UsuarioModel, Long> {
    public abstract List<UsuarioModel> findByPrioridad(Integer prioridad);

}
