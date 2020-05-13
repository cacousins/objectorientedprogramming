/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancepractice;

public class Cat extends Animal {

    private String name;
    private String breed;

    public Cat(String name) {
        super("Cat"); //type
        this.name = name; //name
        this.breed = "Unknown"; //breed
    }

    public Cat(String name, String breed) {
        super("Cat"); //type
        this.name = name; //name
        this.breed = breed; //breed
    }

    @Override
    public String toString(){
        return super.toString() + 
                " called " + this.name + 
                " that is of the " + this.breed + " breed";
    }

}
