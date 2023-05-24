package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.dao.Users;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO: show the registration form
        if (request.getSession().getAttribute("user") != null) {
            response.sendRedirect("/profile");
            return;
        }
        request.getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        if(username !=null && password !=null && email !=null){
            User newUser = new User();
            new User.setUsername(username);
            new User.setEmail(email);
            new User.setPassword(password);

            Users usersDao = DaoFactory.getUsersDao();

            usersDao.insert(newUser);
            response.sendRedirect("/login");


        }else{
            response.sendRedirect("/register");
        }

        }

        // TODO: find a record in your database that matches the submitted password
        // TODO: make sure we find a user with that username
        // TODO: check the submitted password against what you have in your database
        // TODO: store the logged in user object in the session, instead of just the username



}
