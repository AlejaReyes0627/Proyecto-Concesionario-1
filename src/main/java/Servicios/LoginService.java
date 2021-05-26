package Servicios;

import cliente.controller.Controller;

public class LoginService
{
    Controller usuarioControlador = new Controller();
    public boolean isUserValid(String user, String password)
    {

        if(usuarioControlador.findByPassword(user,password))
        {
            return true;
        }
        return false;
    }

    public boolean addLogin(String user,String password)
    {
        usuarioControlador.insertLogin(user,password);
        return true;

    }
}