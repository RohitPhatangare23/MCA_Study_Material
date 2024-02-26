/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import in.sp.beans.student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Admin
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String resource_file_path;
        resource_file_path = "\\in\\sp\\resource\\applicationContext.xml";
        ApplicationContext context=new ClassPathXmlApplicationContext(resource_file_path);
        student std=(student)context.getBean("student");
        std.display();
    }
    
}
