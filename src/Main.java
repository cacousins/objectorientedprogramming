/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cacousins
 */
public class Main {

    public static void main(String[] args) {
        Employee emp = new TempEmployee("Colin");
        Employee emp2 = new TempEmployee("Colin", 3000);

        System.out.println(emp2);
        emp2.setSalary(4_000_000);
        System.out.println("Salary is " + emp2.getSalary());
        int n=3 ; n=++n + ++n;
        System.out.println(n);

    }

}
