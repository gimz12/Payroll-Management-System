package Control;

import Model.MSalary;
import java.sql.ResultSet;

public class CSalary {
    public ResultSet searchSalary(){
        MSalary MS=new MSalary();
        ResultSet rst=MS.salary();
        return rst;
        
    }
}
