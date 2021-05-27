package com.example.ProyectoConcesionario;

import Servicios.DefectsService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/defecto.do")
public class DefectServlet extends HttpServlet
{
    DefectsService defectsService = new DefectsService();
    private static final long serialVersionUID = 1L;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        request.getRequestDispatcher("/WEB-INF/defectos.jsp").forward(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String act = request.getParameter("act");
        String placa = request.getParameter("placa");
        String descripcion = request.getParameter("descripcion");
        long l = Long.parseLong(request.getParameter("orden"));


        if(act.equals("buscar"))
        {
            defectsService.isPlacaValid(placa);
            request.getSession().setAttribute("placa",placa);
            response.sendRedirect("defecto.do");
        }
        else if(act.equals("agregar"))
        {
            defectsService.addDefect(placa,descripcion);
            request.getSession().setAttribute("placa",placa);
            request.getSession().setAttribute("descripcion",descripcion);

            response.sendRedirect("defecto.do");
        }
        else if(act.equals("eliminar"))
        {
            defectsService.deleteDefect(placa);
            request.getSession().setAttribute("placa",placa);
            response.sendRedirect("defecto.do");
        }
        else if(act.equals("actualizar"))
        {
            defectsService.updateDefect(placa,l,descripcion);
            request.getSession().setAttribute("placa",placa);
            request.getSession().setAttribute("phone", l);
            request.getSession().setAttribute("descripcion",descripcion);
            response.sendRedirect("defecto.do");

        }
    }



}
