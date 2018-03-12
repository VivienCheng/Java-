package web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username_input = request.getParameter("username");
        String password_input = request.getParameter("password");

        String username1 = getServletContext().getInitParameter("username");
        String password1 = getServletContext().getInitParameter("password");
        String username2 = getServletContext().getInitParameter("username2");
        String password2 = getServletContext().getInitParameter("password2");

        if(username_input.equals(username1)){
            if(password_input.equals(password1)){
                response.sendRedirect("/pass.jsp");
            }
            else{
                response.sendRedirect("/notpass.jsp");
            }
        }
        else if(username_input.equals(username2)){
            if(password_input.equals(password2)){
                response.sendRedirect("/pass.jsp");
            }
            else{
                response.sendRedirect("/notpass.jsp");
            }
        }
        else{
            response.sendRedirect("/notpass.jsp");
        }
    }
}
