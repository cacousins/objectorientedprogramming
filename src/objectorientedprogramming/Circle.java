package objectorientedprogramming;

import java.text.DecimalFormat;

public class Circle {

    private double radius; //data hiding
    private String colour;

    //no argument constructor    
    public Circle() {
        //radius = 2;
        colour = generateColour();
    }

    //single argument constructor
    public Circle(double radius) {
        this.radius = radius;
        this.colour = generateColour();
    }

    //two argument constructor
    public Circle(double radius, String colour) {
        this.radius = radius;
        this.colour = colour;
    }

    /*
        setters and getters
     */
    
    public double getRadius(){
        return radius;
    }
    
    public void setRadius(double radius){
        //validation
        if (radius <=0) {
            System.out.println("The radius must be greater than 0");
        }
        else{
            this.radius = radius;
        }
    }
    
    
    public double findArea() {
        return Math.PI * Math.pow(this.radius, 2);  //pi radius * radius
    }

    public String generateColour() {
        String[] colourArray = {"blue", "black", "indigo", "green",
            "teal", "red", "turquoise", "pink", "orange", "brown"};
        int selection = (int) (Math.random() * colourArray.length);
        return colourArray[selection];

    }

    public double findCircumference() {
        return 2 * Math.PI * this.radius;
    }

    public void describeCircle() {
        DecimalFormat df = new DecimalFormat("###.##");
        System.out.println("My radius is : " + radius);
        System.out.println("My colour is : " + colour);
        System.out.println("The Area of the circle is : " + df.format(findArea()));
        System.out.println("The Circumference of the circle is : " + df.format(findCircumference()));
    }

}
