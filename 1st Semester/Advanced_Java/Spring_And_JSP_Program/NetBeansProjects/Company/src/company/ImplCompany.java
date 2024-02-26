
package company;
import java.rmi.*;
import java.rmi.server.*;
import java.sql.*;
public class ImplCompany extends UnicastRemoteObject implements CompanyInterface{
    int count=0;
    String[] str;
    int k=0;
    
    public ImplCompany() throws RemoteException{
        super();
    }
    
    public String[] getEmpInfo() throws RemoteException{
        try{
            Class.forName("com.mysql.jdbc.Driver");
               
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company?zeroDateTimeBehavior=convertToNull","root","");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from employee");
            
            while(rs.next()){
                count++;
            }
            str = new String[count];
            ResultSet rs1 = st.executeQuery("select Emp_name from employee where name=?");
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
