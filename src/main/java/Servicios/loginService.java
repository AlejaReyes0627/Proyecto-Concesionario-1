package Servicios;

import cliente.controller.Controller;

public class loginService
{
    public boolean isUserValid( String password)
    {
        Controller usuarioControlador = new Controller();
        if(usuarioControlador.findByPassword(password)){
            return true;
        }
        return false;
    }
}
