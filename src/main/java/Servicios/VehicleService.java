package Servicios;

import cliente.controller.Controller;

public class VehicleService

{

    Controller controlador = new Controller();
    public boolean isUserValid(String placa)
    {

        if(controlador.findByPlacaVehicle(placa))
        {
            return true;
        }
        return false;
    }

    public boolean addVehicle(String placa, String marca, int modelo, String color, String tipoVehiculo, double precio, int propietario)
    {
        if(controlador.insertVehicle(placa,marca,modelo,color,tipoVehiculo,precio,propietario))
        {
            return true;
        }
        return false;
    }

    public void deleteVehicle(String placa)
    {
        controlador.deleteVehicle(placa);

    }

    public void editVehicle(String placa, String marca, int modelo, String color, String tipoVehiculo, double precio, int propietario)
    {
        controlador.updateVehicle(placa,marca,modelo,color,tipoVehiculo,precio,propietario);

    }
}
