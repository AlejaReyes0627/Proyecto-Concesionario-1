package Servicios;

import cliente.controller.Controller;

public class OwnerService
{
    static Controller controlador = new Controller();
    public boolean isOwnerValid(int cedula)
    {

        if(controlador.findByPlacaOwner(cedula))
        {
            return true;
        }
        return false;
    }

    public static boolean addOwner(int cedula, String nombre, String apellido, long telefono, String email)
    {
        if (controlador.insertOwner(cedula, nombre, apellido, telefono, email))
        {
            return true;
        }
        return false;

    }

    public void deleteOwner(int cedula)
    {
        controlador.deleteOwner(cedula);

    }

    public void editOwner(int cedula, String nombre,  String apellido, long telefono, String email)
    {
        controlador.updateOwner(cedula, nombre, apellido, telefono, email);
    }
}
