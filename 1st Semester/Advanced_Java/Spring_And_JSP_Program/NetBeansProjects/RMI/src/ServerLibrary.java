/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServerLibrary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
            Registry reg = LocateRegistry.createRegistry(3099);
            ImplLibrary obj = new ImplLibrary();
            Naming.rebind("rmi://localhost:3099/library", obj);
        }catch(Exception e){
        }
        
    }
    
}
