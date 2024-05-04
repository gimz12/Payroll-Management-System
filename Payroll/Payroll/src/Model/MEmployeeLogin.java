package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class MEmployeeLogin {
    ResultSet rst;
    PreparedStatement pst;
    
    public ResultSet employeeLogin(String email,String password){
        String sql="select email,password from employee where email='"+email+"'and password='"+password+"' ";
        try{
   
      pst=MyDBConnection.createDBConnection().prepareStatement(sql);
      rst=pst.executeQuery();
 
      }
      catch(Exception e)
      {JOptionPane.showMessageDialog(null, "login"+e);
      }
      return rst;
    }
}
