
package Control;

import Model.MEmployeeRegistration;
import java.util.Date;

public class CEmployeeRegistration {
    public void registerEmployee(String fname,String sname,String dob,int cno,String address,String gender,String hireddate,String email,String pass,String dep,String designation,float bsal){
        MEmployeeRegistration memp=new MEmployeeRegistration();
        memp.registerEmployee(fname, sname, dob, cno, address, gender, hireddate, email, pass, dep, designation, bsal);
    }
}
