package Model;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class MUpdateEmployee {
    public void updateEmployee(int empid,String fname,String sname,String dob,int cno,String address,String gender,String hireddate,String email,String pass,String dep,String designation,float bsal){
        try{
            String sql="UPDATE employee SET firstname = '"+fname+"',surname = '"+sname+"',dob = '"+dob+"',contactno = '"+cno+"',address = '"+address+"',gender = '"+gender+"',datehired = '"+hireddate+"',email = '"+email+"',password = '"+pass+"',department = '"+dep+"',designation = '"+designation+"',basicsal = '"+bsal+"'WHERE empid ='"+empid+"'";
            PreparedStatement pst =MyDBConnection.createDBConnection().prepareStatement(sql);
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Recoed Updated");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
