/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package company;

import java.rmi.*;
public class ClientEmp {

    
    public static void main(String[] args)throws Exception {
        CompanyInterface obj = (CompanyInterface) Naming.lookup("company://localhost:3089/employee");
        String[] str = obj.getEmpInfo();
        
        int size = str.length;
        for(int i=0;i<size;i++){
            System.out.println(str[i]);
        }
    }
    
}
