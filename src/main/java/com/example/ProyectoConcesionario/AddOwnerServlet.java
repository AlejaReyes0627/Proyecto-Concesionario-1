package com.example.ProyectoConcesionario;
import Servicios.OwnerService;
import cliente.controller.Controller;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/addOwner.do")
public class AddOwnerServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private OwnerService ownerServices = new OwnerService();


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String act = request.getParameter("act");
        PrintWriter out = response.getWriter();
        int id = Integer.parseInt(request.getParameter("identification"));
        String name = request.getParameter("name");
        String metronome = request.getParameter("last_name");
        long l = Long.parseLong(request.getParameter("phone"));
        String email = request.getParameter("email");

        if(act.equals("agregar"))
        {
            ownerServices.addOwner(id, name, metronome, l, email);
            request.getSession().setAttribute("identification", id);
            request.getSession().setAttribute("name", name);
            request.getSession().setAttribute("last_name", metronome);
            request.getSession().setAttribute("phone", l);
            request.getSession().setAttribute("email", email);
            response.sendRedirect("addOwner.do");
        }

        else if (act.equals("buscar"))
        {
            ownerServices.isOwnerValid(id);
            request.getSession().setAttribute("identification", id);
            response.sendRedirect("addOwner.do");
        }

        else if(act.equals("eliminar"))
        {
            ownerServices.deleteOwner(id);
            request.getSession().setAttribute("identification", id);
            response.sendRedirect("addOwner.do");
        }
        else if(act.equals("actualizar"))
        {
            ownerServices.editOwner(id, name, metronome, l, email);
            request.getSession().setAttribute("identification", id);
            request.getSession().setAttribute("name", name);
            request.getSession().setAttribute("last_name", metronome);
            request.getSession().setAttribute("phone", l);
            request.getSession().setAttribute("email", email);
            response.sendRedirect("addOwner.do");
        }
    }

}