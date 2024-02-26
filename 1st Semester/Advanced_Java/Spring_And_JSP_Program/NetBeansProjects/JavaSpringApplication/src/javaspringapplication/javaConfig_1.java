/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaspringapplication;

import org.springframework.context.annotation.Bean;

/**
 *
 * @author Admin
 */
class javaConfig {
    @Bean(name="empobj")
    public employebean getEmployee(){
        employebean emp=new employebean();
        emp.setId(44);
        emp.setName("Rohit");
        return emp;
    }
}
