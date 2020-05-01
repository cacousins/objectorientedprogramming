package objectorientedprogramming;

public class Circle {

    public double radius; //instance
    public String colour;
    
    
    //no argument constructor    
     public Circle(){
         radius = 2;
         colour = "green";
    }
    
    //single argument constructor
     public Circle(double radius){
         this.radius = radius; //assign 19.6 to the object
         colour = "yellow";
    }
    
    //two argument constructor
    public Circle(double radius, String colour){
        
    }
   
    /*
        method header
    */
    public double findArea(){
        return 0;
    }
    
    public String generateColour(){
        return "colour";
    }
    
    public double findCircumference(){
        return 0.0;
    }
    
    public void describeCircle(){
        System.out.println("My radius is : " + radius);
        System.out.println("My colour is : " + colour);
    }

}
