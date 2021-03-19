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
class AnimalSuperMethod {

    void eat() {
        System.out.println("eating...");
    }
}

class Dog extends AnimalSuperMethod {

    
    @Override
    void eat() {
        System.out.println("eating bread...");
    }

    void bark() {
        System.out.println("barking...");
    }

    void work() {
        super.eat();
        eat();
        bark();
    }
}

class TestSuper2 {

    public static void main(String args[]) {
        Dog d = new Dog();
        d.work();
    }
}
