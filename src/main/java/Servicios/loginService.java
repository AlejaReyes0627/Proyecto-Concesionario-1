package Servicios;

import cliente.controller.Controller;

public class loginService
{
    public boolean isUserValid(String user, String password)
    {
        Controller usuarioControlador = new Controller();
        if(usuarioControlador.findByPlacaTradeMark (user)){
            return true;
        }
        return false;
    }
}
