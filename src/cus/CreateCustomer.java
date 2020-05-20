/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cus;

/**
 *
 * @author cacousins
 */
public class CreateCustomer {
    public static void main(String[] args)
	{
		Customer custOne = new Customer("Mike Clarkson", "mclarkson@fanshawec.ca");
		Customer custTwo = new Customer("Dev Sainani", "dSainani@fanshawec.ca");
		Customer custThree = new Customer("Jim Donoghue", "jDonoghue@fanshawec.ca");
		System.out.println(custOne.getCustID());
		System.out.println(custOne.getName());
		System.out.println(custOne.getEmail());
		System.out.println(custTwo.getCustID());
		System.out.println(custTwo.getName());
		System.out.println(custTwo.getEmail());
		System.out.println(custThree.getCustID());
		System.out.println(custThree.getName());
		System.out.println(custThree.getEmail());
		custThree.setName("Trin Han");
		custThree.setEmail("than@fanshawec.ca");
		System.out.println(custThree.getCustID());
		System.out.println(custThree.getName());
		System.out.println(custThree.getEmail());
	}

}
