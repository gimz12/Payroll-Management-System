package Control;

import Model.MEmployeeLogin;
import java.sql.ResultSet;

public class CEmployeeLogin {
    public ResultSet EmployeeLogin(String email,String password){
        MEmployeeLogin MEL=new MEmployeeLogin();
        ResultSet rst=MEL.employeeLogin(email,password);
        return rst;
    }
}
