/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.encapsulation;

/**
 *
 * @author HP
 */
// Java Program of JavaBean class 
public class Student implements java.io.Serializable {

    private int id;
    private String name;

    public Student() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
