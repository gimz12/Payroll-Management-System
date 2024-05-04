package Control;

import Model.MEmployeeSearch;
import java.sql.ResultSet;

public class CEmployeeSearch {
    public ResultSet searchEmployee(int empid) {
        MEmployeeSearch x=new MEmployeeSearch();
        ResultSet rst=x.searchEmployee(empid);
        return rst;
    }
}
