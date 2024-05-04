
package Control;

import Model.MUpdateAttendance;

public class CUpdateAttendance {
    public void updateAttendance(int empid,int othours,int npdays){
    MUpdateAttendance MUA=new MUpdateAttendance();
    MUA.updateAttendance(empid, othours,npdays);
}
    
}
