

/**
 *
 * @author cacousins
 */
public abstract class Employee {  
    private String name;
    private String address;
    private double salary;
    private static int ID;

    public Employee(String name) {
        this.name = name;
        ID++;
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        ID++;
    }

    public Employee(String name, String address, double salary) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        ID++;
    }
    
    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", address=" + address + ", salary=" + salary + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static int getID() {
        return ID;
    }

    public static void setID(int aID) {
        ID = aID;
    }
        
    public abstract void baseSalary();
    public abstract void baseBonus();

    
    
}
