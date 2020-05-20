/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customer;

/**
 *
 * @author cacousins
 */
public class CreateCustomer {

    public static void main(String[] args) {
        Customer customer1 = new Customer("Colin Cousins", "cacousins@gmail.com");
        Customer customer2 = new Customer("James Curtney", "jcurtney@gmail.com");
        Customer customer3 = new Customer("Richards Carissa", "rcarissa@gmail.com");
        Customer customer4 = new Customer("Mike Jordan", "mjordan@gmail.com");

        /*System.out.println(customer1.toString());
        System.out.println(customer2.toString());
        System.out.println(customer3.toString());*/
        
        customer1.setName("Phil The Plumber");
        customer1.setEmail("philplumberinc@gmail.com");        
        System.out.println(customer1.getCustID());
        System.out.println(customer1.toString());
        
       
       

        

    }

}
