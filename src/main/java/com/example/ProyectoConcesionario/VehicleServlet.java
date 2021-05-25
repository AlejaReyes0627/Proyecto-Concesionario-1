package com.example.ProyectoConcesionario;

import Servicios.VehicleService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/vehicle.do")
public class VehicleServlet extends HttpServlet
{
    VehicleService vehicleService = new VehicleService();
    private static final long serialVersionUID = 1L;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String placa = request.getParameter("placa");

        if(vehicleService.isUserValid("placa"))
        {
            request.getSession().setAttribute("placa",placa);

            response.sendRedirect("vehicle.do");
        }
        else
        {
            request.setAttribute("errorMessage","Invalid Credentials!");
            request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request,response);
        }
    }
}
