/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceEmp;

/**
 *
 * @author HP
 */
interface Printable1 {

    void print();
    
}

interface Showable1 {

    void print();
}

class TestInterface3 implements Printable1, Showable1 {

    @Override
    public void print() {
        System.out.println("Hello");
    }

    public static void main(String args[]) {
        TestInterface3 obj = new TestInterface3();
        obj.print();
    }
}
