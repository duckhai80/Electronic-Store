package Models;

public class Account {
	private int id_customer;
	private String username;
	private String password;
	private String name_customer;
	private String discount;
	private int phone_number;
	private String email;
	
	public Account(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public Account(String username, String name_customer, String email, int phone_number, String discount, String password) {
		super();
		this.username = username;
		this.name_customer = name_customer;
		this.email = email;
		this.phone_number = phone_number;
		this.discount = discount;
		this.password = password;
	}
	
	public Account(String username, String name_customer, String email, int phone_number, String password) {
		super();
		this.username = username;
		this.name_customer = name_customer;
		this.email = email;
		this.phone_number = phone_number;
		this.password = password;
	}

	public Account(int id_customer, String username, String name_customer, String email, int phone_number, String discount, String password) {
		super();
		this.id_customer = id_customer;
		this.username = username;
		this.name_customer = name_customer;
		this.email = email;
		this.phone_number = phone_number;
		this.discount = discount;
		this.password = password;
	}

	public Account(String username) {
		super();
		this.username = username;
	}

	public int getId_customer() {
		return id_customer;
	}

	public void setId_customer(int id_customer) {
		this.id_customer = id_customer;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName_customer() {
		return name_customer;
	}

	public void setName_customer(String name_customer) {
		this.name_customer = name_customer;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public int getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
