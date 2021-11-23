package com.projetspringboot.springboot_project.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.projetspringboot.springboot_project.models.UsuarioModel;
import com.projetspringboot.springboot_project.services.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//clase que se encarga de manejar las peticiones de los usuarios
@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    //metodo para obtener todos los usuarios
    @GetMapping()
    public List<UsuarioModel> obtenerUsuarios() {
        return usuarioService.obtenerUsuarios();
    }

    //metodo para guardar y actualizar un usuario por su id
    @PostMapping()
    public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuario) {
        return this.usuarioService.guardarUsuario(usuario);
    }

    //metodo para obtener un usuario por su id
    @GetMapping(path = "/{id}")
    public Optional<UsuarioModel> obtenerUsuario(@PathVariable("id") Long id) {
        return this.usuarioService.obtenerUsuario(id);
    }

    //metodo para optener ususarios por prioridad
    @GetMapping("/query")
    public List<UsuarioModel> obtenerUsuarioPorPrioridad(@RequestParam("prioridad") Integer prioridad) {
        return this.usuarioService.obtenerUsuarioPorPrioridad(prioridad);
    }

    //metodo para eliminar un usuario por su id
    @DeleteMapping(path = "/{id}")
    public String eliminarUsuario(@PathVariable("id") Long id) {
        boolean ok = this.usuarioService.eliminarUsuario(id);
        if (ok) {
            return "Se elimino el usuario "+id;
        } else {
            return "No se pudo eliminar el usuario con " + id;
        }
    }

}
