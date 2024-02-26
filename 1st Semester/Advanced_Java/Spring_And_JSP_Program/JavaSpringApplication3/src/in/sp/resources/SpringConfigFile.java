/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.sp.resources;

import in.sp.beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Admin
 */
@Configuration
public class SpringConfigFile {
    @Bean
    public Student stdId1(){
        Student std=new Student();
        std.setName("Rohit");
        std.setRollno(44);
        std.setEmail("Hitman@gmail.com");
        return std;
    }
}
