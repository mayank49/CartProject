package models;

public class User {
	
	private final String userId;
	private final String userName;
	private final String email;
	private final String contact;
	
	public User(String userId, String userName, String email, String contact) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.email = email;
		this.contact = contact;
	}

	public String getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public String getEmail() {
		return email;
	}

	public String getContact() {
		return contact;
	}
}
