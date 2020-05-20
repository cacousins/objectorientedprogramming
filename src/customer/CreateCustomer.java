/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customer;

import java.util.Scanner;

/**
 *
 * @author cacousins
 */
public class CreateCustomer {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name, email;
        System.out.println("Enter name : ");
        name = input.nextLine();
        
        System.out.println("Enter email : ");
        email = input.nextLine();
        
        
        
        Customer customer1 = new Customer(name, email);
        Customer customer2 = new Customer("James Curtney", "jcurtney@gmail.com");
        Customer customer3 = new Customer("Richards Carissa", "rcarissa@gmail.com");
        Customer customer4 = new Customer("Mike Jordan", "mjordan@gmail.com");

        
          Customer[] customer = new Customer[6];
        /*System.out.println(customer1.toString());
        System.out.println(customer2.toString());
        System.out.println(customer3.toString());*/
        
        customer1.setName("Phil The Plumber");
        customer1.setEmail("philplumberinc@gmail.com");        
        System.out.println(customer1.getCustID());
        System.out.println(customer1.toString());
        
       
       

        

    }

}
