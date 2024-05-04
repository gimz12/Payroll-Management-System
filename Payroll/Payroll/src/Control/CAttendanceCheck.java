package Control;

import Model.MCheckAttendance;
import java.sql.ResultSet;

public class CAttendanceCheck {
    public ResultSet attendaceCheck(int empid) {
        MCheckAttendance x=new MCheckAttendance();
        ResultSet rst=x.checkAttendance(empid);
        return rst;
    }
}
