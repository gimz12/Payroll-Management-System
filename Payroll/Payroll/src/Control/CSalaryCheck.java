
package Control;

import Model.MCheckAttendance;
import Model.MSalaryCheck;
import java.sql.ResultSet;

public class CSalaryCheck {
    public ResultSet salaryCheck(int empid) {
        MSalaryCheck x=new MSalaryCheck();
        ResultSet rst=x.checkSalary(empid);
        return rst;
    }
}
