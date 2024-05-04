package Control;

import Model.MAttendanceAdd;

public class CAttendanceAdd {
    public void attendanceAdd(int epmid,int othours,int npdays){
        MAttendanceAdd MAA=new MAttendanceAdd();
        MAA.attendanceAdd(epmid, othours, npdays);
    }
}
