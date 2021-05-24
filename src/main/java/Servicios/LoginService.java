package Servicios;

import cliente.controller.Controller;

public class LoginService
{
    public boolean isUserValid(String user, String password)
    {
        Controller usuarioControlador = new Controller();
        if(usuarioControlador.findByPassword(user,password)){
            return true;
        }
        return false;
    }
}
