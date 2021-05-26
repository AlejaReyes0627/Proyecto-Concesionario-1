package com.example.ProyectoConcesionario.OwnerServlet;
import Servicios.OwnerService;
import cliente.controller.Controller;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/addOwner.do")
public class AddOwnerServlet extends HttpServlet
{
    private static final long serialVersionUID = 1L;
    private Controller ownerServices = new Controller();
    private OwnerService ow = new OwnerService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

        int id = Integer.parseInt(request.getParameter("identification"));
        String name = request.getParameter("name");
        String metronome = request.getParameter("last_name");
        long l = Long.parseLong(request.getParameter("phone"));
        String email = request.getParameter("email");

        if(ow.addOwner(id, name, metronome, l, email))
        {
            request.setAttribute("identification",id);
            request.setAttribute("name",name);
            request.setAttribute("last_name",metronome);
            request.setAttribute("phone",l);
            request.setAttribute("email",email);

            response.sendRedirect("addOwner.do");
        }
        else
        {
            response.sendRedirect("login.do");
        }

    }

}
