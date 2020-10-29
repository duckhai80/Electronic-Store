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
import Models.Account;

@WebServlet("/UpdateAccount")
public class UpdateAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UpdateAccount() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Connection cnn = ConnectionDB.getConnectionDB();
			
			String username = request.getParameter("username");
			String name_customer = request.getParameter("name_customer");
			String email = request.getParameter("email");
			int phone_number = Integer.parseInt(request.getParameter("phone_number"));
			String discount = request.getParameter("discount");
			String password = request.getParameter("password");
			
			Account account = new Account(username, name_customer, email, phone_number, discount, password);
			
			ElectronicDAO.UpdateAccount_1(cnn, account);
			ElectronicDAO.UpdateAccount_2(cnn, account);
			
			RequestDispatcher rd = request.getRequestDispatcher("/ListUser");
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
