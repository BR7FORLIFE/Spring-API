package com.trabajo.ApiUsuarios.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trabajo.ApiUsuarios.classes.Usuarios;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    public List<Usuarios> users = new ArrayList<>(Arrays.asList(
        new Usuarios(1, "bryan", 17, "desarrollador"),
        new Usuarios(2, "Ana", 25, "Diseñadora"),
        new Usuarios(3, "Carlos", 30, "Ingeniero de Software"),
        new Usuarios(4, "Diana", 22, "Analista de Datos"),
        new Usuarios(5, "Eduardo", 28, "Administrador de Sistemas")
    ));

    @GetMapping
    public ResponseEntity<List<Usuarios>> getUsers (){
        return ResponseEntity.ok(users);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getUsersById(@PathVariable int id){
        for(Usuarios c : users){
            if(c.getId() == id){
                return ResponseEntity.ok(c);
            }
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("la id de dicho usuario no se encuentra en nuestros datos!");
    }

    @PostMapping
    public ResponseEntity<?> postUser (@RequestBody Usuarios usuarios){
        return ResponseEntity.status(HttpStatus.CREATED).body("el usuario " + usuarios.getName() + " ha sido creado exitosamente!");
    }

    @PutMapping
    public ResponseEntity<?> putUser(@RequestBody Usuarios usuarios){
        for(Usuarios user : users){
            if(user.getId() == usuarios.getId()){
                user.setName(usuarios.getName());
                user.setAge(usuarios.getAge());
                user.setOccupation(usuarios.getOccupation());
                return ResponseEntity.ok("usuario reescrito exitosamente: " + user.getId());
            }
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se encontro dicha Id!");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable int id){
        for(Usuarios user: users){
            if(user.getId() == id){
                users.remove(user);
                return ResponseEntity.status(HttpStatus.NO_CONTENT).body("usuario eleminado exitosamente: " + id);
            }
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se encontro dicho id");
    }

    @PatchMapping
    public ResponseEntity<?> pathUser(@RequestBody Usuarios usuarios){
        for(Usuarios user: users){
            if(user.getId() == usuarios.getId()){
                if(user.getName() != usuarios.getName()){
                    user.setName(usuarios.getName());
                }
                if(user.getAge() != usuarios.getAge()){
                    user.setAge(usuarios.getAge());
                }
                if(user.getOccupation() != usuarios.getOccupation()){
                    user.setOccupation(usuarios.getOccupation());
                }
                return ResponseEntity.ok("Patch hecho correctamente en la id: "+ usuarios.getId());
            }
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("no se encuentra dicho id");
    }
}
