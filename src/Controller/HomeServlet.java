package Controller;
import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DB.ConnectionDB;
import DAO.ElectronicDAO;
import Models.Product;

@WebServlet("/HomeServlet")
public class HomeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
 
    public HomeServlet() {
        super();
    }
 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Connection cnn = ConnectionDB.getConnectionDB();
			
			List<Product> products_specials = ElectronicDAO.ReadProducts_Specials(cnn);
			List<Product> products_latest = ElectronicDAO.ReadProducts_Latest(cnn);
			List<Product> products_featured = ElectronicDAO.ReadProducts_Featured(cnn);
			
			request.setAttribute("LIST_PRODUCT_SPECIALS", products_specials);
			request.setAttribute("LIST_PRODUCT_LATEST", products_latest);
			request.setAttribute("LIST_PRODUCT_FEATURED", products_featured);
			
			RequestDispatcher rd = request.getRequestDispatcher("Home.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
 
}