package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.User;
import com.codeup.adlister.util.Password;
import org.mindrot.jbcrypt.BCrypt;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "controllers.LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //checks if any user is already logged in, and if they are it won't render the login page, but bring you to your profile page.
        //acessing the sessions object
        if (request.getSession().getAttribute("user") != null) {
            response.sendRedirect("/profile");
            return;
        }
        //if no user is logged in, it will allow you to visit the login page

        request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
       //gets the users input values from the form
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        //finds the already registered username from the database

        User user = DaoFactory.getUsersDao().findByUsername(username);

        //checks if the user is logged in AFTER pressing enter, and if not...bring you back to the login page
        if (user == null) {
            response.sendRedirect("/login");
            return;
        }
        //checks the hash password to see if it matches the text-password.
        boolean validAttempt = Password.check(password, user.getPassword());

        //if the username and input are valid then it will start your session and direct you to your profile page
        if (validAttempt) {
            //we then set the attribute to the session as the user

            request.getSession().setAttribute("user", user);
            response.sendRedirect("/profile");

        //if the information presented is not valid from the database, it will direct you back to the login page
        } else {
            response.sendRedirect("/login");
        }
    }
}
