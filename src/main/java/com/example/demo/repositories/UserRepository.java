package com.example.demo.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.UserModel;

@Repository
public interface UserRepository extends CrudRepository<UserModel, Long> {
    public abstract ArrayList<UserModel> findByNombre(String nombre);
    public abstract ArrayList<UserModel> findByApellido(String apellido);
    public abstract ArrayList<UserModel> findByEdad(int edad);
    public abstract ArrayList<UserModel> findByCi(int ci);
}
