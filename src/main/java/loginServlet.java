import Servicios.loginService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/login.do")
public class loginServlet  extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String user = request.getParameter("user");
        String password = request.getParameter("password");
        loginService loginService = new loginService();
        if(loginService.isUserValid(password))
        {
            request.getSession().setAttribute("user",user);
            response.sendRedirect("welcome.do");

        }
        else
        {
            request.setAttribute("errorMessage","Invalid Credentials!");
            request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request,response);
        }
    }
    }


