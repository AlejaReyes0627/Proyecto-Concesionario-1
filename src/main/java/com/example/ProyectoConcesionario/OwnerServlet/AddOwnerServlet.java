package com.example.ProyectoConcesionario.OwnerServlet;

import Servicios.OwnerService;
import cliente.controller.Controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
@WebServlet(urlPatterns = "/addOwner.do")
public class AddOwnerServlet extends HttpServlet
{
    private static final long serialVersionUID = 1L;

    private OwnerService ownerServices = new OwnerService();



    public AddOwnerServlet() {
        super();
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);

    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            int cedula = Integer.parseInt(request.getParameter("cedula")) ;
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            long telefono = Long.parseLong(request.getParameter("telefono")) ;
            String email = request.getParameter("email");

            boolean res =OwnerService.addOwner(cedula, nombre, apellido, telefono, email);

            if(res)
            {
                request.getSession().setAttribute("cedula",cedula);
                request.getSession().setAttribute("nombre",nombre);
                request.getSession().setAttribute("apellido",apellido);
                request.getSession().setAttribute("telefono",telefono);
                request.getSession().setAttribute("email",email);
                response.sendRedirect("addOwner.do");
            }
            else
            {
                request.setAttribute("errorMessage","Invalid Credentials!");

            }


        } catch (Exception e)
        {
            //Excepción de propietario
            e.printStackTrace();
        }

    }

}
