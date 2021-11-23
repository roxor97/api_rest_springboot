package com.projetspringboot.springboot_project.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.projetspringboot.springboot_project.models.UsuarioModel;
import com.projetspringboot.springboot_project.repositories.UsuarioRespository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UsuarioService {
    @Autowired
    UsuarioRespository usuarioRespository;

    //creo un metodo para obtener todos los usuarios
    public List<UsuarioModel> obtenerUsuarios() {

        return (ArrayList<UsuarioModel>) usuarioRespository.findAll();

    }

    //creo un metodo para obtener un usuario por su id
    public UsuarioModel guardarUsuario(UsuarioModel usuario) {
        return usuarioRespository.save(usuario);
    }

    //creo un metodo para obtener un usuario por su id
    public Optional<UsuarioModel> obtenerUsuario(Long id) {
        return usuarioRespository.findById(id);
    }

    //creo un metodo para buscar usuarios por su prioridad
    public List<UsuarioModel> obtenerUsuarioPorPrioridad(Integer prioridad) {
        return usuarioRespository.findByPrioridad(prioridad);
    }

    //creo un metodo para eliminar un usuario por su id
    public boolean eliminarUsuario(Long id) {
        try {
            usuarioRespository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
