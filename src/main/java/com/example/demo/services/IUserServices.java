package com.example.demo.services;
import java.util.ArrayList;
import java.util.Optional;
import com.example.demo.models.UserModel;

public interface IUserServices {
    public ArrayList<UserModel> TodosUsers();
    public UserModel GuardarUser(UserModel usuario);
    public Optional<UserModel> BuscarXId(Long id);
    public ArrayList<UserModel> findByNombre(String nombre);
    public ArrayList<UserModel> findByApellido(String apellido);
    public ArrayList<UserModel> findByEdad(int edad);
    public ArrayList<UserModel> findByCi(int ci);
    public boolean EliminarXId(Long id);

}
