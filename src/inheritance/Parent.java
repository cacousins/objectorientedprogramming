package inheritance;

public class Parent {

    public void method1() {
        System.out.println("Method 1"); //1000 * 6 = 6000
    }

    public void method2() {
        System.out.println("Method 2");
    }

}

class Subclass1 extends Parent {

    public void method3() {
        System.out.println("Method 3");
    }

    public void method4() {
        System.out.println("Method 4");
    }
}

class subclass2 extends Subclass1 {

    public void method5() {
        System.out.println("Method 5");
    }

    public void method6() {
        System.out.println("Method 6");
    }
}
