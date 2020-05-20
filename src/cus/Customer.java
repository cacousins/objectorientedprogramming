package cus;

/**
 *
 * @author cacousins
 */
public class Customer {
    private static int id = 1000000; 
	private String custID;
	private String name;
	private String email;
	
	public Customer(String name, String email)
	{
		this.name = name;
		this.email = email;
		custID = generateCustID(name);
		this.id++;
	}
	
	//mutator methods
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	//accessor methods
	public String getCustID()
	{
		return this.custID;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getEmail()
	{
		return this.email;
	}
	
	/*
	  Method Name:  generateCustID
	      Purpose:  to generate a unique value for each customer
	      Accepts:  String
	      Returns:  String
	 */
	
	private String generateCustID(String name)
	{
		String newValue = "";
		newValue += name.charAt(0);		
		return newValue + id;
	}

}
