package servlets;

import Utils.Global;
import dao.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RedirectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String page = req.getParameter("page");
        String user = Global.user;
        String state = "";
        String selectedID = req.getParameter("selectedID");

        try{
            state = req.getAttribute("estado").toString();
        }catch (Exception ex){
            state = "";
        }

        RequestDispatcher dispatcher = null;

        switch (page){
            case "index":
                req.setAttribute("estado", state);
                dispatcher = req.getRequestDispatcher("index.jsp");
                break;
            case "dashboard":
                req.setAttribute("user", user);
                req.setAttribute("country", Global.country);
                req.setAttribute("numberOfUsers", GeneralDAO.INSTANCE.getNumberOfUsers());
                req.setAttribute("numberOfSales", GeneralDAO.INSTANCE.getNumberOfSales());
                req.setAttribute("numberOfClients", GeneralDAO.INSTANCE.getNumberOfClients());
                req.setAttribute("totalEarnings", GeneralDAO.INSTANCE.getTotalEarnings());
                req.setAttribute("earningsCountry", GeneralDAO.INSTANCE.getEarningsByCountry());
                req.setAttribute("sales", SalesDAO.INSTANCE.getSales());
                dispatcher = req.getRequestDispatcher("dashboard.jsp");
                break;
            case "sales":
                req.setAttribute("user", user);
                req.setAttribute("country", Global.country);
                req.setAttribute("listaProductos", ProductDAO.INSTANCE.getProductosStorage());
                req.setAttribute("listaClientes", ClientDAO.INSTANCE.getClients());
                req.setAttribute("listaEmpleados", EmpleadoDAO.INSTANCE.getEmployees());
                req.setAttribute("selectedID", selectedID);
                dispatcher = req.getRequestDispatcher("pages/sales.jsp");
                break;
            case "products":
                req.setAttribute("user", user);
                req.setAttribute("country", Global.country);
                req.setAttribute("listaProductos", ProductDAO.INSTANCE.getAllProducts());
                dispatcher = req.getRequestDispatcher("pages/products.jsp");
                break;
            case "add_product":
                req.setAttribute("user", user);
                req.setAttribute("country", Global.country);
                req.setAttribute("listaProviders", ProviderDAO.INSTANCE.getProviders());
                req.setAttribute("listaCategorias", CategoryDAO.INSTANCE.getCategories());
                dispatcher = req.getRequestDispatcher("pages/add_product.jsp");
                break;
            case "stocks":
                req.setAttribute("user", user);
                req.setAttribute("country", Global.country);
                req.setAttribute("stocksList", StockDAO.INSTANCE.getStocks());
                dispatcher = req.getRequestDispatcher("pages/stock.jsp");
                break;
        }

        dispatcher.forward(req, resp);
    }
}
