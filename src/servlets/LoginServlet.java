package servlets;

import Utils.Global;
import dao.UserDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user = req.getParameter("txtUser");
        String pass = req.getParameter("txtPass");

        RequestDispatcher dispatcher = null;

        if (UserDAO.INSTANCE.doLogin(user, pass)){
            Global.user = user;
            Global.country = UserDAO.INSTANCE.getUserCountry(Global.user);
            req.setAttribute("estado", "");
            dispatcher = req.getRequestDispatcher("RedirectServlet.do?page=dashboard");
        }else{
            req.setAttribute("estado", "Login incorrecto");
            dispatcher = req.getRequestDispatcher("RedirectServlet.do?page=index");
        }

        dispatcher.forward(req, resp);
    }
}
