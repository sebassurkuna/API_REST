package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.models.UserModel;
import com.example.demo.services.*;

@RestController
@RequestMapping("/usuario")
public class UserController implements IUserController{
    @Autowired
    UserServices userServices;

    @GetMapping()
    public ArrayList<UserModel> TodosUsers(){
        return userServices.TodosUsers();
    }

    @PostMapping
    public UserModel GuardarUser(@RequestBody UserModel usuario){
        return this.userServices.GuardarUser(usuario);
    }

    @GetMapping(path = "/{ID}")
    public Optional<UserModel> BuscarXId(@PathVariable("ID") Long ID){
        return this.userServices.BuscarXId(ID);
    }

    @GetMapping(path ="/Nombre={Nombre}")
    public ArrayList<UserModel> findByNombre(@PathVariable("Nombre") String Nombre){
        return this.userServices.findByNombre(Nombre);
    }

    @GetMapping(path ="/Apellido={Apellido}")
    public ArrayList<UserModel> findByApellido(@PathVariable("Apellido") String Apellido){
        return this.userServices.findByApellido(Apellido);
    }

    @GetMapping(path ="/Edad={Edad}")
    public ArrayList<UserModel> findByEdad(@PathVariable("Edad") int Edad){
        return this.userServices.findByEdad(Edad);
    }

    @GetMapping(path ="/CI={Ci}")
    public ArrayList<UserModel> findByCi(@PathVariable("Ci") int Ci){
        return this.userServices.findByCi(Ci);
    }

    @DeleteMapping(path = "/{ID}")
    public String EliminarXId(@PathVariable("ID") Long ID){
        boolean aux = this.userServices.EliminarXId(ID);
        if (aux==true) {
            return "Se eliminó el usuario: "+ID;

        }else{
            return "No se eliminó el usuario: "+ID;
        }

    }
}
