package com.example.demo.controllers;
import java.util.ArrayList;
import java.util.Optional;
import com.example.demo.models.UserModel;

public interface IUserController {
    public ArrayList<UserModel> TodosUsers();
    public UserModel GuardarUser(UserModel usuario);
    public Optional<UserModel> BuscarXId(Long ID);
    public ArrayList<UserModel> findByNombre(String Nombre);
    public ArrayList<UserModel> findByApellido(String Apellido);
    public ArrayList<UserModel> findByEdad(int Edad);
    public ArrayList<UserModel> findByCi(int Ci);
    public String EliminarXId(Long ID);

}
