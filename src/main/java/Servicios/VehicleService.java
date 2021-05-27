package Servicios;

import cliente.controller.Controller;

public class VehicleService

{

    Controller controlador = new Controller();
    public boolean isVehicleValid(String placa)
    {

        if(controlador.findByPlacaVehicle(placa))
        {
            return true;
        }
        return false;
    }

    public boolean addVehicle(String placa, String marca, int modelo, String color, String tipoVehiculo, double precio, int propietario)
    {
        controlador.insertVehicle(placa,marca,modelo,color,tipoVehiculo,precio,propietario);
        return true;
    }

    public boolean deleteVehicle(String placa)
    {
        controlador.deleteVehicle(placa);
        return true;
    }

    public boolean editVehicle(String placa, String marca, int modelo, String color, String tipoVehiculo, double precio, int propietario)
    {
        controlador.updateVehicle(placa,marca,modelo,color,tipoVehiculo,precio,propietario);
        return true;
    }
}
