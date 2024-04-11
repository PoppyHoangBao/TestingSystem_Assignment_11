package entities;

public class User {
	private int userId;
	private String email;
	private String username;
	private String password;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(int userId, String email, String username, String password) {
		super();
		this.userId = userId;
		this.email = email;
		this.username = username;
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", email=" + email + ", username=" + username + ", password=" + password
				+ "]";
	}
}
