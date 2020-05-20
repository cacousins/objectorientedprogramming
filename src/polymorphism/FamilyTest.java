/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package polymorphism;

/**
 *
 * @author cacousins
 */
public class FamilyTest {
    public static void main(String[] args) {
        //Family family = new Family();//abstract class cannot be instantiated
        
        Family son1 = new Son(); //Family reference, but a son object
        Son son2 = new Son(); //Son reference, son object
        //daugher object
        Family daughter = new Daughter();
        //father object
        Family father = new Father();
        //father object
        Father father1 = new Father();       
        
        //run the application - see poly
        
        //son outputt
        son1.marry();
        son1.reUnite();
        System.out.println("");
        //father output
        father1.marry();
        father1.reUnite();
        System.out.println("");
        
        //dauther output
        daughter.marry();
        daughter.reUnite();
        
        
    }

}
