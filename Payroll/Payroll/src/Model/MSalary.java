package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class MSalary {
    ResultSet rst;
    public ResultSet salary(){
        
      try{
      Statement st=MyDBConnection.createDBConnection().createStatement();
      rst=st.executeQuery("select*from salary");
      }
      catch(Exception e)
      {JOptionPane.showMessageDialog(null, e);
      }
        
    return rst;
    }
    
}
