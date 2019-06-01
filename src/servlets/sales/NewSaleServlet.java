package servlets.sales;

import dao.SalesDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class NewSaleServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nitCliente = req.getParameter("selectClient");
        int idEmpleado = Integer.parseInt(req.getParameter("selectEmployee"));
        int idProducto = Integer.parseInt(req.getParameter("selectProduct"));
        double precio = Double.parseDouble(req.getParameter("price"));
        int cantidad = Integer.parseInt(req.getParameter("quantity"));

        SalesDAO.INSTANCE.newSale(nitCliente, idEmpleado, precio,cantidad,idProducto);

        RequestDispatcher dispatcher = req.getRequestDispatcher("RedirectServlet.do?page=dashboard");

        dispatcher.forward(req, resp);
    }
}
