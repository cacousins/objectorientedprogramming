package inheritancepractice;

/**
 *
 * @author cacousins
 */
public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("g");
        
        //System.out.println(animal);

        Dog dog = new Dog("George", "Rottweiler");
        Dog dog1 = new Dog("Pak", "German Shepherd");
        Cat cat1 = new Cat("Fluffy", "Persian");
        Cat cat2 = new Cat("Mr. Pickles", "Persian");
        Cat cat3 = new Cat("Flurkin", "American Shorthair");
        Cat cat4 = new Cat("Sour Cream", "Sphynx");
        Animal dog2 = new Dog("Bad Dog", "Mongrel");

        Animal[] zoo = new Animal[7];
        zoo[0] = dog;
        zoo[1] = dog1;
        zoo[6] = dog2;
        zoo[2] = cat1;
        zoo[3] = cat2;
        zoo[4] = cat3;
        zoo[5] = cat4;
        
        for (int i = 0; i < zoo.length; i++) {
            System.out.println(zoo[i].toString());
        }

        /*System.out.println(dog.toString());
        System.out.println(dog1.toString());
        System.out.println(cat1.toString());
        System.out.println(cat2.toString());
        System.out.println(cat3.toString());
        System.out.println(cat4.toString());*/
    }

}
