package com.example.ProyectoConcesionario;

import Servicios.DefectsService;
import Servicios.LoginService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/defects.do")
public class DefectServlet  extends HttpServlet
{
    DefectsService defectsService = new DefectsService();

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        request.getRequestDispatcher("/WEB-INF/defectos.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        PrintWriter out = response.getWriter();
        String name = request.getParameter("name");
        String email = request.getParameter("email");


        if(defectsService.isPlacaValid(name))
        {
            request.getSession().setAttribute("name", name);
            request.getSession().setAttribute("email", email);
            response.sendRedirect("welcome.do");
        }
        else
        {
           defectsService.addDefect(name, email);
            response.sendRedirect("login.do");
        }

    }
}