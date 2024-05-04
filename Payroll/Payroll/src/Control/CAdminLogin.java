package Control;

import Model.MAdminLogin;
import java.sql.ResultSet;

public class CAdminLogin {
    public ResultSet CadminLogin(String username,String password) 
    {   MAdminLogin mdl=new MAdminLogin();
        ResultSet rst=mdl.adminLogin(username, password);
        return rst;
    }
}
