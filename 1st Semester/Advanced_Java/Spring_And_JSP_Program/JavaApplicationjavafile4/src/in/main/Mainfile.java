/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.main;

import in.sp.beans.student;
import in.sp.resources.SpringConfigureFile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Admin
 */
public class Mainfile {

    /** Based on java file
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfigureFile.class);
        student std=(student) context.getBean("stdID1");
        std.display();
    }
    
}
