
package Model;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class MGetEmpID {
    ResultSet rst;
    public ResultSet getEmpID(String email){
        try{
      Statement st=MyDBConnection.createDBConnection().createStatement();
      rst=st.executeQuery("select*from employee where email='"+email+"'");
      }
      catch(Exception e)
      {JOptionPane.showMessageDialog(null, e);
      }
        return rst;
    }
}
