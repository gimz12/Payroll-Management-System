
package Model;

import java.sql.Statement;
import java.util.Date;
import javax.swing.JOptionPane;

public class MEmployeeRegistration {
    public void registerEmployee(String fname,String sname,String dob,int cno,String address,String gender,String hireddate,String email,String pass,String dep,String designation,float bsal){
        try{
            Statement st=MyDBConnection.createDBConnection().createStatement();
            int row_count=st.executeUpdate("INSERT INTO employee (firstname, surname, dob, contactno, address, gender, datehired, email, password, department, designation, basicsal) VALUES ('"+fname+"','"+sname+"','"+dob+"','"+cno+"','"+address+"','"+gender+"','"+hireddate+"','"+email+"','"+pass+"','"+dep+"','"+designation+"','"+bsal+"')");
            if(row_count>0){
                JOptionPane.showMessageDialog(null,"Employee Added","Registration",JOptionPane.INFORMATION_MESSAGE);
            }
     {      
     }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
