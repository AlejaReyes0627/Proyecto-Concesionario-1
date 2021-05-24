package com.example.ProyectoConcesionario;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(urlPatterns = "/welcome.do")
public class HelloServlet extends HttpServlet
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException  {
        request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
    }
}