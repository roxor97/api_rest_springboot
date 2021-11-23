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

    
    public List<UsuarioModel> obtenerUsuarios() {

        return (ArrayList<UsuarioModel>) usuarioRespository.findAll();

    }

    
    public UsuarioModel guardarUsuario(UsuarioModel usuario) {
        return usuarioRespository.save(usuario);
    }

    
    public Optional<UsuarioModel> obtenerUsuario(Long id) {
        return usuarioRespository.findById(id);
    }

    
    public List<UsuarioModel> obtenerUsuarioPorPrioridad(Integer prioridad) {
        return usuarioRespository.findByPrioridad(prioridad);
    }

    public boolean eliminarUsuario(Long id) {
        try {
            usuarioRespository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
