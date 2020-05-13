/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author cacousins
 */
public class Main {

    public static void main(String[] args) {
        Parent parent = new Parent();        

        Subclass1 sb1 = new Subclass1();
        sb1.method1();
        sb1.method2();
        sb1.method3();
        sb1.method4();

        subclass2 sb2 = new subclass2();
        sb2.method1();
        sb2.method2();
        sb2.method3();
        sb2.method4();
        sb2.method5();
        sb2.method6();
        
        Object obj = new Object();
        

    }

}
