package com.example.demo.services;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.UserModel;
import com.example.demo.repositories.*;

@Service
public class UserServices implements IUserServices {
    @Autowired
    UserRepository UserRepository;
    
    public ArrayList<UserModel> TodosUsers(){
        return (ArrayList<UserModel>) UserRepository.findAll();
    }

    public UserModel GuardarUser(UserModel usuario){
        return UserRepository.save(usuario);
    }

    public Optional<UserModel> BuscarXId(Long id){
        return UserRepository.findById(id); 
    }

    public ArrayList<UserModel> findByNombre(String nombre){
        return UserRepository.findByNombre(nombre);
    }

    public ArrayList<UserModel> findByApellido(String Apellido){
        return UserRepository.findByApellido(Apellido);
    }

    public ArrayList<UserModel> findByEdad(int Edad){
        return UserRepository.findByEdad(Edad);
    }

    public ArrayList<UserModel> findByCi(int CI){
        return UserRepository.findByCi(CI);
    }

    public boolean EliminarXId(Long id){
        try {
            UserRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
