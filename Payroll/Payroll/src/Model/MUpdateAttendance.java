package Model;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class MUpdateAttendance {
    public void updateAttendance(int empid,int othours,int npdays){
        try{
            String sql="UPDATE empattendance SET othours ='"+othours+"', npdays = '"+npdays+"' WHERE empid = '"+empid+"'";
            PreparedStatement pst =MyDBConnection.createDBConnection().prepareStatement(sql);
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Attendance Updated");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "update "+e);
        }
    }
}
