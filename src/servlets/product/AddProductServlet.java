package servlets.product;

import dao.ProductDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddProductServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nombre = req.getParameter("productName");
        Double precio = Double.parseDouble(req.getParameter("productPrice"));
        int idProveedor = Integer.parseInt(req.getParameter("selectProvider"));
        int idCategoria = Integer.parseInt(req.getParameter("selectCategory"));
        int cantidad = Integer.parseInt(req.getParameter("quantity"));

        ProductDAO.INSTANCE.insertProduct(nombre, idProveedor, idCategoria, precio, cantidad);

        RequestDispatcher dispatcher = req.getRequestDispatcher("RedirectServlet.do?page=products");

        dispatcher.forward(req, resp);
    }
}
