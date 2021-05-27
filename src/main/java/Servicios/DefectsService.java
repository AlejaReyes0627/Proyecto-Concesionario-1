package Servicios;

import cliente.controller.Controller;

public class DefectsService
{
    Controller usuarioControlador = new Controller();

    public boolean isPlacaValid(String placa)
    {

        if(usuarioControlador.findByPlacaDefect(placa))
        {
            return true;
        }
        return false;
    }

    public boolean addDefect(String placa, String descripcion)
    {
        usuarioControlador.insertDefect(placa, descripcion);
        return true;
    }
    public boolean deleteDefect(String placa)
    {
        usuarioControlador.deleteDefects(placa);
        return true;
    }
    public boolean updateDefect(String placa, long orden, String descripcion)
    {
        usuarioControlador.updateDefects(placa,orden,descripcion);
        return true;
    }


}
