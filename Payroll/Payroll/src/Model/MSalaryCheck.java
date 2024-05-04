package Model;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class MSalaryCheck {
    ResultSet rst;
    public ResultSet checkSalary(int empid){
        try{
      Statement st=MyDBConnection.createDBConnection().createStatement();
      rst=st.executeQuery("select*from salary where empid='"+empid+"'");
      }
      catch(Exception e)
      {JOptionPane.showMessageDialog(null, "cehck "+e);
      }
        return rst;
    }
}
