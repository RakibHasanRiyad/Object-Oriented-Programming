/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclass;

/**
 *
 * @author HP
 */
//Example of an abstract class that has abstract and non-abstract methods  
abstract class Bike {

    Bike() {
        System.out.println("bike is created");
    }

    abstract void run();

    void changeGear() {
        System.out.println("gear changed");
    }
}
//Creating a Child class which inherits Abstract class  

class Honda extends Bike {

    void run() {
        System.out.println("running safely..");
    }
}
//Creating a Test class which calls abstract and non-abstract methods  

class TestAbstraction2 {

    public static void main(String args[]) {
        Bike obj = new Honda();
        obj.run();
        obj.changeGear();
    }
}
