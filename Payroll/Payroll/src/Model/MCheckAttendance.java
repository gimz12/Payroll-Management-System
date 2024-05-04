
package Model;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class MCheckAttendance {
    ResultSet rst;
    public ResultSet checkAttendance(int empid){
        try{
      Statement st=MyDBConnection.createDBConnection().createStatement();
      rst=st.executeQuery("select*from empattendance where empid='"+empid+"'");
      }
      catch(Exception e)
      {JOptionPane.showMessageDialog(null, "cehck "+e);
      }
        return rst;
    }
}
