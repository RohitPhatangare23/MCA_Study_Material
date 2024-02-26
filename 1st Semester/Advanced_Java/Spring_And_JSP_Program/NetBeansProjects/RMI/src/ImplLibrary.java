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
import java.rmi.server.*;
import java.sql.*;

public class ImplLibrary extends UnicastRemoteObject implements LibraryInterface{
    
    int count=0;
    String[] str;
    int k=0;
    
    public ImplLibrary() throws RemoteException{
        super();
    }
    
    public String[] getBookInfo() throws RemoteException{
        try{
            Class.forName("com.mysql.jdbc.Driver");
               
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rmi?zeroDateTimeBehavior=convertToNull","root","");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select bookname from library");
            
            while(rs.next()){
                count++;
            }
            str = new String[count];
            ResultSet rs1 = st.executeQuery("select bookname from library");
            ResultSetMetaData rsmd = rs1.getMetaData();
            int col = rsmd.getColumnCount();
            
            while(rs1.next()){
            str[k]="";
            for(int i=1; i<=col; i++){
                    str[k]=str[k]+rs1.getString(i);
                }
            k++;
            }
            
        }catch(Exception e){
        }  
        return str;
    }
}
