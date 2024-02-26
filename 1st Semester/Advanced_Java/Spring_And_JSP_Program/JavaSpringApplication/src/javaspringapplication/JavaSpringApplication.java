/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaspringapplication;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Vikram Sir Code (Start)
 * @author Admin
 */
public class JavaSpringApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AnnotationConfigApplicationContext context;
        context = new AnnotationConfigApplicationContext();
        context.register(javaConfig.class);
        context.refresh();
        employebean ebobj=(employebean)context.getBean("empobj",employebean.class);
        System.out.println("ID = " + ebobj.getId()+" Name = "+ebobj.getName());
    }
    
}
