package inheritancepractice;

public class Animal {
    private String type;
    
    //one argument constructor
    public Animal(String type){
        this.type = type;
    }
    
    
    
    @Override
    public String toString(){
        return ("This is a " + type);
    }
    
    //setter and getters to your Animal Class
    
    public String getType(){
        return this.type;
    }
    
    public void setType(String type){
        this.type = type;
    }
    
    //two abstract methods
    //makeSound - String
    //movement - String
    
    
}
