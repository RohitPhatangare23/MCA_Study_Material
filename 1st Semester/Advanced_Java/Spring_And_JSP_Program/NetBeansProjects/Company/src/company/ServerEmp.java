/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package company;

import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
public class ServerEmp {

    
    public static void main(String[] args) {
        try{
            Registry reg = LocateRegistry.createRegistry(3089);
            ImplCompany obj = new ImplCompany();
            Naming.rebind("company://localhost:3089/employee", obj);
        }catch(Exception e){
        }
    }
    
}
