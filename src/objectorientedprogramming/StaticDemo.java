/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectorientedprogramming;

public class StaticDemo {

    public static int studentID; //static variable
    public String name; //instance variable

    public static void main(String[] args) {
        StaticDemo student1 = new StaticDemo();
     
        

    }

    public void printStudent(String name) {
        this.name = name;
        ++studentID;
        System.out.println("===================================");
        System.out.println("Student name is : " + this.name);
        System.out.println("Student ID is : " + this.studentID++);
        System.out.println("===================================");
    }

}
