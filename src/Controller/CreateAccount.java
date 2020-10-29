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

@WebServlet("/CreateAccount")
public class CreateAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CreateAccount() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	try {
    		Connection cnn = ConnectionDB.getConnectionDB();
        	
        	String username = request.getParameter("username");
        	String password = request.getParameter("password");
        	String name_customer = request.getParameter("name_customer");
        	int phone_number = Integer.parseInt(request.getParameter("phone_number"));
        	String email = request.getParameter("email");
        	
        	Account account = new Account(username, name_customer, email, phone_number, password);
        	
        	ElectronicDAO.CreateAccount_1(cnn, account);
        	ElectronicDAO.CreateAccount_2(cnn, account);
        	
        	RequestDispatcher rd = request.getRequestDispatcher("Menu.jsp");
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
