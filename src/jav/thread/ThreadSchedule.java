/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jav.thread;

/**
 *
 * @author HP
 */
class A extends Thread {

    int i = 0;

    public void run() {
        System.out.println("Thread A started");
        while (i < 4) {
            System.out.println("\t value of i in Thread A:" + i);
            i++;
        }
        System.out.println("ThreadA finished");
    }
}

class B extends Thread {

    public void run() {
        int i = 0;
        System.out.println("ThreadB started");
        while (i < 4) {
            System.out.println("\t value of i in Thread B:" + i);
            i++;
        }
        System.out.println("ThreadB finished");
    }
}

class C extends Thread {

    public void run() {
        int i = 0;
        System.out.println("ThreadC started");
        while (i < 4) {
            System.out.println("\t value of i in Thread C" + i);
            i++;
        }
        System.out.println("ThreadC finished");
    }
}

public class ThreadSchedule {

    public static void main(String[] args) {
        System.out.println("Main Thread started");
        A a = new A();
        B b = new B();
        C c = new C();
        Thread th = Thread.currentThread();
        System.out.println(th.getName());
        a.setPriority(Thread.MAX_PRIORITY);
        b.setPriority(Thread.MIN_PRIORITY);
        c.setPriority(Thread.NORM_PRIORITY);
        
        
        b.start();
        c.start();
        a.start();
        
        
    }
}
