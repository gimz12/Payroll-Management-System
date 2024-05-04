package Model;

import java.sql.*;
import javax.swing.JOptionPane;

public class MDeleteEmployee {
    public void deleteEmployee(int empid){
        try{
            String sql="DELETE FROM employee WHERE empid='"+empid+"' ";
            PreparedStatement pst =MyDBConnection.createDBConnection().prepareStatement(sql);
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Recoed Deleted");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        
    }
}
