package Servicios;

import cliente.controller.Controller;

public class DefectsService
{
    Controller usuarioControlador = new Controller();
    public boolean searchDefect(String placa)
    {

        if(usuarioControlador.findByPlacaDefect(placa))
        {
            return true;
        }
        return false;
    }

    public boolean addLogin(String placa,String descripcion)
    {
        usuarioControlador.insertDefect(placa,descripcion);
        return true;
    }

}
