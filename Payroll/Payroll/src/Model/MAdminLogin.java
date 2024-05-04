package Model;
import View.MainMenu;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import javax.swing.*;

public class MAdminLogin {
    ResultSet rst;
    PreparedStatement pst;
    
    public ResultSet adminLogin(String username,String password)
  {   
      String sql="select PRA_username,PRA_password from payroll_admin where PRA_username='"+username+"'and PRA_password='"+password+"' ";
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

