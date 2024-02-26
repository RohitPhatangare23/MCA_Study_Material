/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaspringapplication_2;

import in.sp.beans.student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Admin
 */
public class JavaSpringApplication_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String config_loc="\\in\\sp\\resources\\applicationContext.xml";
        ApplicationContext context =new ClassPathXmlApplicationContext(config_loc);
        
        student std = (student) context.getBean("stdId");
        std.display();
    }
    
}
