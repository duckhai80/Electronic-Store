package Controller;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ElectronicDAO;
import DB.ConnectionDB;
import Models.Product;

@WebServlet("/UpdateProductForm")
public class UpdateProductForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UpdateProductForm() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Connection cnn = ConnectionDB.getConnectionDB();
			
			int id = Integer.parseInt(request.getParameter("id"));
			
			Product idProduct = ElectronicDAO.GetIdProduct(cnn, id);
			
			request.setAttribute("PRODUCT", idProduct);
			
			RequestDispatcher rd = request.getRequestDispatcher("Update_product.jsp");
			rd.forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
