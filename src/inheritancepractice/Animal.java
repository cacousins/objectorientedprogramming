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
    
    
}
