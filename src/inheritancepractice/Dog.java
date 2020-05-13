
package inheritancepractice;


public class Dog extends Animal {
    private String name;
    private String breed;
    
    public Dog(String name){
        super("Dog"); //type
        this.name = name; //name
        this.breed = "Unknown"; //breed
    }
    
    public Dog(String name, String breed){
        super("Dog"); //type
        this.name = name; //name
        this.breed = breed; //breed
    }
    
    @Override
    public String toString(){
        return super.toString() + 
                " called " + this.name + 
                " that is of the " + this.breed + " breed";
    }

}
