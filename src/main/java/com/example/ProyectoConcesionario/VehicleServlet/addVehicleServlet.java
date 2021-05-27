package com.example.ProyectoConcesionario.VehicleServlet;

import Servicios.VehicleService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/addVehicle.do")
public class addVehicleServlet extends HttpServlet
{
    private static final long serialVersionUID = 1L;

    VehicleService vehicleService = new VehicleService();


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/vehicle.jsp").forward(request, response);
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        String placa = request.getParameter("placa");
        String marca = request.getParameter("marca");
        int modelo = Integer.parseInt(request.getParameter("modelo"));
        String color = request.getParameter("color");
        String tipoVehiculo = request.getParameter("tipoVehiculo");
        double precio = Double.parseDouble(request.getParameter("precio"));
        int propietario = Integer.parseInt(request.getParameter("propietario"));

        if (vehicleService.isVehicleValid(placa))
        {
            request.getSession().setAttribute("placa", placa);

            response.sendRedirect("login.do");

        }


        else
        {
            vehicleService.addVehicle(placa, marca, modelo, color,tipoVehiculo,precio, propietario);
            request.getSession().setAttribute("placa", placa);
            request.getSession().setAttribute("marca", marca);
            request.getSession().setAttribute("modelo", modelo);
            request.getSession().setAttribute("color", color);
            request.getSession().setAttribute("tipoVehiculo", tipoVehiculo);
            request.getSession().setAttribute("precio", precio);
            request.getSession().setAttribute("propietario", propietario);
            response.sendRedirect("addVehicle.do");
        }
    }
}
