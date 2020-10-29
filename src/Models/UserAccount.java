package Models;

import java.util.ArrayList;
import java.util.List;

public class UserAccount {
	public static final String GENDER_MALE = "M";
	public static final String GENDER_FEMALE = "F";
			
	private String userName; 
	private String password;
	private String gender;
	
	private List<String> role;
	
	public UserAccount() {
		
	}

	public UserAccount(String userName, String password, String gender, List<String> role) {
		this.userName = userName;
		this.password = password;
		this.gender = gender;
		this.role = new ArrayList<String>();
		if(role != null) {
			for(String r : role) {
				this.role.add(r);
			}
		}
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<String> getRole() {
		return role;
	}

	public void setRole(List<String> role) {
		this.role = role;
	}
	
}
