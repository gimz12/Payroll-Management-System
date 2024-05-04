package Control;

import Model.MGetEmpID;
import java.sql.ResultSet;

public class CGetEmpID {
    public ResultSet searchEmployee(String email) {
        MGetEmpID x=new MGetEmpID();
        ResultSet rst=x.getEmpID(email);
        return rst;
    }
}
