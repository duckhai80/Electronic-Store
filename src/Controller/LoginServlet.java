package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.ElectronicDAO;
import DB.ConnectionDB;
import Models.Account;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		Connection cnn = ConnectionDB.getConnectionDB();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		Account account = new Account(username, password);
		
		String result_manager = ElectronicDAO.LoginManager(cnn, account);
		
		String result_user = ElectronicDAO.LoginUser(cnn, account);
		
		if(result_manager.equals("true")) {
			out.print("Welcome, " + username);
			
			HttpSession session = request.getSession();
			session.setAttribute("username", username);
			
			request.getRequestDispatcher("Menu.jsp").include(request, response);
		}
		else {
			if(result_user.equals("true")) {
				out.print("Welcome, " + username);
				
				HttpSession session = request.getSession();
				session.setAttribute("username", username);
				
				request.setAttribute("USERNAME", username);
				
				request.getRequestDispatcher("/HomeUserServlet").include(request, response);
			}
			else {			
				request.getRequestDispatcher("Login.jsp").include(request, response);
			}
		}	
		out.close();
	}
}














