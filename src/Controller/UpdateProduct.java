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

@WebServlet("/UpdateProduct")
public class UpdateProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UpdateProduct() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Connection cnn = ConnectionDB.getConnectionDB();
			
			int id = Integer.parseInt(request.getParameter("id"));
			String name_product = request.getParameter("name_product");
			int id_producer = Integer.parseInt(request.getParameter("id_producer"));
			int id_production = Integer.parseInt(request.getParameter("id_production"));
			String type = request.getParameter("type");
			float price = Float.parseFloat(request.getParameter("price"));
			float price_sale = Float.parseFloat(request.getParameter("price_sale"));
			String image = request.getParameter("image");
			String describe = request.getParameter("describe");
			
			Product product = new Product(id, name_product, id_producer, id_production, type, price, price_sale, image, describe);		
			
			ElectronicDAO.UpdateProduct(cnn, product);
			
			RequestDispatcher rd = request.getRequestDispatcher("/ListProduct");
			rd.forward(request, response);
		} catch(ServletException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
