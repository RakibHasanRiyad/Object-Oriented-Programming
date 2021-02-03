/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Super;

/**
 *
 * @author HP
 */
class AnimalSuperConstructor {

    AnimalSuperConstructor() {
        System.out.println("animal is created");
    }
}

class Dog2 extends AnimalSuperConstructor {

    Dog2() {
        
        System.out.println("dog is created");
    }
}

class TestSuper3 {

    public static void main(String args[]) {
        Dog2 d = new Dog2();
    }
}
