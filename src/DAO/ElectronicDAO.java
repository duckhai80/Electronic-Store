package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Models.Account;

// import com.sun.org.apache.bcel.internal.generic.NEWARRAY;
// import com.sun.org.apache.regexp.internal.recompile;

import Models.Product;

public class ElectronicDAO {
	
	// list product
	public static List<Product> ReadProducts_Specials(Connection cnn) {
		List<Product> products = new  ArrayList<Product>();
		String sql = "select * from Product where type = 'Specials'"; 
		try {
			PreparedStatement pst = cnn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				int id = rs.getInt(1);
				String name_product = rs.getString(2);
				int id_producer = rs.getInt(3);
				int id_production = rs.getInt(4);
				String type = rs.getString(5);
				float price = rs.getFloat(6);
				int price_sale = rs.getInt(7);				
				String image = rs.getString(8);
				String describe = rs.getString(9);
				Product tempProduct = new Product(id, name_product, id_producer, id_production, type, price , price_sale, image, describe);
				products.add(tempProduct);
			}
			rs.close();
			pst.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return products; 
	}
	
	// list product
	public static List<Product> ReadProducts_Latest(Connection cnn){
		List<Product> products = new  ArrayList<Product>();
		String sql = "select * from Product where type = 'Latest'";
		try {
			PreparedStatement pst = cnn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				int id = rs.getInt(1);
				String name_product = rs.getString(2);
				int id_producer = rs.getInt(3);
				int id_production = rs.getInt(4);
				String type = rs.getString(5);
				float price = rs.getFloat(6);
				int price_sale = rs.getInt(7);				
				String image = rs.getString(8);
				String describe = rs.getString(9);
				Product tempProduct = new Product(id, name_product, id_producer, id_production, type, price , price_sale, image, describe);
				products.add(tempProduct);
			}
			rs.close();
			pst.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return products; 		
	}
	
	// list product
	public static List<Product> ReadProducts_Featured(Connection cnn){		
		List<Product> products = new  ArrayList<Product>();
		String sql = "select * from Product where type = 'Featured'";
		try {
			PreparedStatement pst = cnn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				int id = rs.getInt(1);
				String name_product = rs.getString(2);
				int id_producer = rs.getInt(3);
				int id_production = rs.getInt(4);
				String type = rs.getString(5);
				float price = rs.getFloat(6);
				int price_sale = rs.getInt(7);				
				String image = rs.getString(8);
				String describe = rs.getString(9);
				Product tempProduct = new Product(id, name_product, id_producer, id_production, type, price , price_sale, image, describe);
				products.add(tempProduct);
			}
			rs.close();
			pst.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return products;
	}
	
	// list product full
	public static List<Product> ReadProduct(Connection cnn){
		List<Product> products = new  ArrayList<Product>();
		String sql = "select * from Product";
		try {
			PreparedStatement pst = cnn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				int id = rs.getInt(1);
				String name_product = rs.getString(2);
				int id_producer = rs.getInt(3);
				int id_production = rs.getInt(4);
				String type = rs.getString(5);
				float price = rs.getFloat(6);
				int price_sale = rs.getInt(7);				
				String image = rs.getString(8);
				String describe = rs.getString(9);
				Product tempProduct = new Product(id, name_product, id_producer, id_production, type, price , price_sale, image, describe);
				products.add(tempProduct);
			}
			rs.close();
			pst.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return products;
	}
	
	// delete product
	public static boolean DeleteProduct(Connection cnn, Product product) {
		String sql = "delete from Product where id = ?";
		try {
			PreparedStatement pst = cnn.prepareStatement(sql);
			pst.setInt(1, product.getId());
			if(pst.executeUpdate( ) > 0) return true;
			pst.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	// insert product
	public static boolean CreateProduct(Connection cnn, Product product) {
		String sql = "insert into Product(name_product, type, price, id_producer, price_sale, id_production, [image], describe) values (?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement pst = cnn.prepareStatement(sql);
			pst.setString(1, product.getName_product());
			pst.setString(2, product.getType());
			pst.setFloat(3, product.getPrice());
			pst.setInt(4, product.getId_producer());
			pst.setFloat(5, product.getPrice_sale());
			pst.setInt(6, product.getId_production());
			pst.setString(7, product.getImage());
			pst.setString(8, product.getDescribe());
			if(pst.executeUpdate() > 0) return true;
			pst.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	// get id to update product
	public static Product GetIdProduct(Connection cnn, int id) {
		Product product = null;
		String sql = "select * from Product where id = ?";
		try {
			PreparedStatement pst = cnn.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				String name_product = rs.getString("name_product");
				int id_producer = rs.getInt("id_producer");
				int id_production = rs.getInt("id_production");
				String type = rs.getString("type");
				Float price = rs.getFloat("price");
				Float price_sale = rs.getFloat("price_sale");
				String image = rs.getString("image");
				String describe = rs.getString("describe");
				product = new Product(id, name_product, id_producer, id_production, type, price, price_sale, image, describe);
			}
			rs.close();
			pst.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return product;
	}
	
	// update product
	public static boolean UpdateProduct(Connection cnn, Product product) {
		String sql = "update Product set name_product = ?, id_producer = ?, id_production = ?, type = ?, price = ?, price_sale = ?, [image] = ?, describe = ? where id = ?";
		try {
			PreparedStatement pst = cnn.prepareStatement(sql);
			pst.setString(1, product.getName_product());
			pst.setInt(2, product.getId_producer());
			pst.setInt(3, product.getId_production());
			pst.setString(4, product.getType());
			pst.setFloat(5, product.getPrice());
			pst.setFloat(6, product.getPrice_sale());
			pst.setString(7, product.getImage());
			pst.setString(8, product.getDescribe());
			pst.setInt(9, product.getId());
			if(pst.executeUpdate() > 0) return true;
			pst.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	// login manager
	public static String LoginManager(Connection cnn, Account account) {
		String sql = "select username, password from Account where username = ? and [password] = ? and role = 'manager'";
		try {
			PreparedStatement pst = cnn.prepareStatement(sql);
			pst.setString(1, account.getUsername());
			pst.setString(2, account.getPassword());
			ResultSet rs = pst.executeQuery();
			if(rs.isBeforeFirst()) return "true"; 			// rs.isBeforeFirst() == rs.next()
			rs.close();
			pst.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "false";
	}
	
	// login user
	public static String LoginUser(Connection cnn, Account account) {
		String sql = "select username, password from Account where username = ? and [password] = ? and role = 'user'";
		try {
			PreparedStatement pst = cnn.prepareStatement(sql);
			pst.setString(1, account.getUsername());
			pst.setString(2, account.getPassword());
			ResultSet rs = pst.executeQuery();
			if(rs.isBeforeFirst()) return "true";
			rs.close();
			pst.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "false";
	}
	
	// create account 1
	public static boolean CreateAccount_1(Connection cnn, Account account) {
		String sql = "insert into Account(username, [password], role) values (?, ?, 'user')";
		try {
			PreparedStatement pst = cnn.prepareStatement(sql);
			pst.setString(1, account.getUsername());
			pst.setString(2, account.getPassword());
			if(pst.executeUpdate() > 0) return true;
			pst.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	// create account 2
	public static boolean CreateAccount_2(Connection cnn, Account account) {
		String sql = "insert into Customers(name_customer, email, phone_number, username) values (?, ?, ?, ?)";
		try {
			PreparedStatement pst = cnn.prepareStatement(sql);
			pst.setString(1, account.getName_customer());
			pst.setString(2, account.getEmail());
			pst.setInt(3, account.getPhone_number());
			pst.setString(4, account.getUsername());
			if(pst.executeUpdate() > 0) return true;
			pst.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	// list account
	public static List<Account> ReadAccounts(Connection cnn) {
		List<Account> accounts = new ArrayList<>();
		String sql = "select id_customer, name_customer, email, phone_number, discount, m.username, n.[password] from Customers m join Account n on m.username = n.username";
		try {
			PreparedStatement pst = cnn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				int id_customer = rs.getInt(1);
				String name_customer = rs.getString(2);
				String email = rs.getString(3);
				int phone_number = rs.getInt(4);
				String discount = rs.getString(5);
				String username = rs.getString(6);
				String password = rs.getString(7);
				Account tempAccount = new Account(id_customer, username, name_customer, email, phone_number, discount, password);
				accounts.add(tempAccount);
			}
			rs.close();
			pst.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return accounts;
	}
	
	// delete account 2
	public static boolean DeleteAccount_1(Connection cnn, Account account) {
		String sql = "delete from Account where username = ?";
		try {
			PreparedStatement pst = cnn.prepareStatement(sql);
			pst.setString(1, account.getUsername());
			if(pst.executeUpdate( ) > 0) return true;
			pst.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	// delete account 2
	public static boolean DeleteAccount_2(Connection cnn, Account account) {
		String sql = "delete from Customers where username = ?";
		try {
			PreparedStatement pst = cnn.prepareStatement(sql);
			pst.setString(1, account.getUsername());
			if(pst.executeUpdate( ) > 0) return true;
			pst.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	// get username to update account
	public static Account GetUsername(Connection cnn, String username) {
		Account account = null;
		String sql = "select id_customer, name_customer, email, phone_number, discount, [password] from Account m join Customers n on m.username = n.username where m.username = ?";
		try {
			PreparedStatement pst = cnn.prepareStatement(sql);
			pst.setString(1, username);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				int id_customer = rs.getInt("id_customer");
				String name_customer = rs.getString("name_customer");
				String email = rs.getString("email");
				int phone_number = rs.getInt("phone_number");
				String discount = rs.getString("discount");
				String password = rs.getString("password");
				account = new Account(id_customer, username, name_customer, email, phone_number, discount, password);
			}
			rs.close();
			pst.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return account;
	}
	
	// update account 1
	public static boolean UpdateAccount_1(Connection cnn, Account account) {
		String sql = "update Account set [password] = ? where username = ?";
		try {
			PreparedStatement pst = cnn.prepareStatement(sql);
			pst.setString(1, account.getPassword());
			pst.setString(2, account.getUsername());
			if(pst.executeUpdate() > 0) return true;
			pst.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	// update account 2
	public static boolean UpdateAccount_2(Connection cnn, Account account) {
		String sql = "update Customers set name_customer = ?, email = ?, phone_number = ?, discount = ?, [password] = ? where username = ?";
		try {
			PreparedStatement pst = cnn.prepareStatement(sql);
			pst.setString(1, account.getName_customer());
			pst.setString(2, account.getEmail());
			pst.setInt(3, account.getPhone_number());
			pst.setString(4, account.getDiscount());
			pst.setString(5, account.getPassword());
			pst.setString(6, account.getUsername());
			if(pst.executeUpdate() > 0) return true;
			pst.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
}















