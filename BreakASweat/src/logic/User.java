package logic;

public class User {
	private String username;
	private String password;

	
	public User(String user, String password){
		this.username = user;
		this.password= password;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	
	
}
