package pay.customer;

public class Customer {
	
	private int id;
	private String name;
	private String userName;
	private String password;
	
	
	public Customer(int id, String name, String userName, String password) {

		this.id = id;
		this.name = name;
		this.userName = userName;
		this.password = password;
	}


	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public String getUserName() {
		return userName;
	}


	public String getPassword() {
		return password;
	}



}
