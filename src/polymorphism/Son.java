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
public class Son extends Family {

    @Override
    public void marry() {
        System.out.println("Son marries a real african woman - Joanna");
    }

    @Override
    public void reUnite() {
        System.out.println("Son reunites with second cousins");
    }

}
