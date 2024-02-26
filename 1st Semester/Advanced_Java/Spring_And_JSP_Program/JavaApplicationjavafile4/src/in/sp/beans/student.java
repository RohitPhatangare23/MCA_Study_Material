/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.sp.beans;

/**
 *
 * @author Admin
 */
public class student {
    private String name;
    private int rollno;
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

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
    
    public void display(){
        System.out.println("Name :"+name);
        System.out.println("Rollno :"+rollno);
        System.out.println("Email : "+email);
    }

    
    
}
