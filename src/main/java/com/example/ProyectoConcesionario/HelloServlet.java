package com.example.ProyectoConcesionario;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(urlPatterns = "/welcome.do")
public class HelloServlet extends HttpServlet
{
    private static final long serialVersionUID = 1L;
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
    {
        request.getRequestDispatcher("/WEB-INF/views/index.jsp").forward(request, response);
    }
}