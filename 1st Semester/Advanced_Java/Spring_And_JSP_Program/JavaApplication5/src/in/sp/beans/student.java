/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.sp.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Anotation Based Program
 * @author Admin
 */
@Component
public class student {
    @Value("Rohit")
    private String name;
    @Value("101")
    private int rollno;
    @Value("94.25f")
    private float marks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }
    public void display(){
        System.out.println("Name :"+name);
        System.out.println("Rollno :"+rollno);
        System.out.println("Email : "+marks);
    }
    
}
