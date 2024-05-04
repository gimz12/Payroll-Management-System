package Model;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class MEmployeeSearch {
    ResultSet rst;
    public ResultSet searchEmployee(int empid){
        try{
      Statement st=MyDBConnection.createDBConnection().createStatement();
      rst=st.executeQuery("select*from employee where empid='"+empid+"'");
      }
      catch(Exception e)
      {JOptionPane.showMessageDialog(null, e);
      }
        return rst;
    }
}
