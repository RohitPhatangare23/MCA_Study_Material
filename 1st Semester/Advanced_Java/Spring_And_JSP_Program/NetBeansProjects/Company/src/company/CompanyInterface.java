/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package company;

import java.rmi.*;
public interface CompanyInterface extends Remote{
    public String[] getEmpInfo() throws RemoteException;
}
