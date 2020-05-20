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
public class Daughter extends Family {

    @Override
    public void marry() {
        System.out.println("Daughter marries a real african man - Zulu");
    }

    @Override
    public void reUnite() {
        System.out.println("Daughter reunites with second Cousin");
    }

}
