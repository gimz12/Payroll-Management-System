
package Model;

import java.sql.Statement;
import javax.swing.JOptionPane;

public class MSalaryAdd {
    public void salaryAdd(int empid,float basicsal,float overtime_rate,float bonus,float other,String managedby,float deduction,String deductionres){
        try{
            Statement st=MyDBConnection.createDBConnection().createStatement();
            int row_count=st.executeUpdate("INSERT INTO salary (empid, basicsal, overtime_rate, bonus, other, managedby,deduction,deduction_reason) VALUES ('"+empid+"','"+basicsal+"','"+overtime_rate+"','"+bonus+"','"+other+"','"+managedby+"','"+deduction+"','"+deductionres+"')");
            if(row_count>0){
                JOptionPane.showMessageDialog(null,"Salary Added","Salary",JOptionPane.INFORMATION_MESSAGE);
            }
     {      
     }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
