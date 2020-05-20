package customer;

/**
 *
 * @author cacousins
 */
public class Customer {

    private static int id = 100000;
    private String custID;
    private String name;
    private String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        this.id++;
        this.custID = generateCustID(this.name); //M100000;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCustID() {
        return custID;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    /*
       Method Name:    GenerateCustID
        Purpose:       Generate a unique value for each customer
    Accepts:           String
    Returns:           String    
     */
    private String generateCustID(String name) {
        String initial = "";
        initial += this.name.charAt(0);
        //initial = initial + name.charAt(0);
        return (initial + id);

        //Colin Cousins - C+ID
        //String - an array characters - index 0
    }

    @Override
    public String toString() {
        return "Customer{" + "custID=" + this.custID + ", name=" + this.name + ", email=" + this.email + '}';
    }
    
    

}
