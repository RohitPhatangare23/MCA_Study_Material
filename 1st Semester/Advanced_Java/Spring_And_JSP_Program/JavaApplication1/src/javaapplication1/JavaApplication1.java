package javaapplication1;

import in.sp.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaApplication1 {

    public static void main(String[] args) {

        String config_loc = "\\in\\sp\\resources\\applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);

        Student std = (Student) context.getBean("stdId");
        std.display();
    }

}
