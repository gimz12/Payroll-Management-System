package Model;

import java.sql.Statement;
import javax.swing.JOptionPane;

public class MAttendanceAdd {
    public void attendanceAdd(int epmid,int othours,int npdays){
        try{
            Statement st=MyDBConnection.createDBConnection().createStatement();
            int row_count=st.executeUpdate("INSERT INTO empattendance (empid, othours, npdays) VALUES ('"+epmid+"', '"+othours+"', '"+npdays+"')");
            if(row_count>0){
                JOptionPane.showMessageDialog(null,"Attendance Added","Attendance",JOptionPane.INFORMATION_MESSAGE);
            }
     {      
     }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "add "+e);
        }
        
    }
}
