package Model;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class MUpdateSalary {
    public void updateSalary(int empid,float bsal){
        try{
            String sql="UPDATE employee SET empid ='"+empid+"',basicsal='"+bsal+"' WHERE empid ='"+empid+"' ";
            PreparedStatement pst =MyDBConnection.createDBConnection().prepareStatement(sql);
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Recoed Updated");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
