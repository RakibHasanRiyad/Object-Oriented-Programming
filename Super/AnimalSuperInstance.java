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
class AnimalSuperInstance {

    String color = "white";
}

class Dog1 extends AnimalSuperInstance {

    String color = "black";

    void printColor() {
        System.out.println(color);//prints color of Dog class  
        System.out.println(super.color);//prints color of Animal class  
    }
}

class TestSuper1 {

    public static void main(String args[]) {
        Dog1 d = new Dog1();
        d.printColor();
    }
}
