
package Model;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class MUpdateSalaryTable {
    public void updateAttendance(int empid,float basicsal,float overtime_rate,float bonus,float other,String managedby,float deduction,String deductionres){
        try{
            String sql="UPDATE salary SET basicsal ='"+basicsal+"', overtime_rate = '"+overtime_rate+"', bonus = '"+bonus+"', other = '"+other+"', managedby = '"+managedby+"', deduction = '"+deduction+"', deduction_reason = '"+deductionres+"' WHERE empid = '"+empid+"'";
            PreparedStatement pst =MyDBConnection.createDBConnection().prepareStatement(sql);
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Salary Table Updated");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Salary update "+e);
        }
    }
}
