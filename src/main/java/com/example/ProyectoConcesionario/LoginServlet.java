package com.example.ProyectoConcesionario;
import Servicios.LoginService;
import cliente.controller.Controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet
{
    LoginService loginService = new LoginService();
    private static final long serialVersionUID = 1L;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String act = request.getParameter("act");
        String user = request.getParameter("user");
        String password = request.getParameter("password");


        if( act.equals("buscar"))
        {
            loginService.isUserValid(user,password);
            request.getSession().setAttribute("user",user);
            request.getSession().setAttribute("password",password);
            response.sendRedirect("welcome.do");
        }
        else if(act.equals("agregar"))
        {
            loginService.addLogin(user,password);
            response.sendRedirect("login.do");
        }
    }
}


