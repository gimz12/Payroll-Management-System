
package Model;

import java.sql.Statement;
import javax.swing.JOptionPane;

public class MPayrollAdd {
    public void payrollAdd(int empid,String date,float tot_allow,float tot_deduction,float gross_sal,float netsal){
        try{
            Statement st=MyDBConnection.createDBConnection().createStatement();
            int row_count=st.executeUpdate("INSERT INTO pay_roll (empid, datecalculated, tot_allow, tot_deduction, gross_sal, netsal) VALUES ('"+empid+"','"+date+"','"+tot_allow+"','"+tot_deduction+"','"+gross_sal+"','"+netsal+"' )");
            if(row_count>0){
                JOptionPane.showMessageDialog(null,"Payroll Added","Payroll",JOptionPane.INFORMATION_MESSAGE);
            }
     {      
     }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
