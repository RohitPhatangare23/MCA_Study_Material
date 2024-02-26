/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.sp.resources;

import in.sp.beans.student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Admin
 */
@Configuration
public class SpringConfigureFile {
    
    @Bean
    public student stdID1(){
        student std=new student();
        std.setName("Rohit");
        std.setRollno(44);
        std.setEmail("ViratKohli512@gmail.com");
        return std;
    }
}
