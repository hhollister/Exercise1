package edu.matc.controller;

import edu.matc.persistence.UserData;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.*;
import java.io.IOException;


/**
 * A simple servlet to welcome the user.
 * @author pwaite
 */

@WebServlet(
        urlPatterns = {"/searchUser"}
)

public class SearchUser extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        UserData userData = new UserData();
        if (req.getParameter("submit").equals("submit")) {
            req.setAttribute("users", userData.getUserByLastName(req.getParameter("lastName")));
        } else {
            req.setAttribute("users", userData.getAllUsers());
        }

     /*   if (req.getParameter("lastname") == null) {
            req.setAttribute("users", userData.getAllUsers());
        } else {
            req.setAttribute("users", userData.getUserByLastName(req.getParameter("lastName")));
        }*/

        RequestDispatcher dispatcher = req.getRequestDispatcher("/results.jsp");
        dispatcher.forward(req, resp);

}
}