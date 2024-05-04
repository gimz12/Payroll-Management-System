package Control;

import Model.MUpdateEmployee;

public class CUpdateEmployee {
    public void updateEmployee(int empid,String fname,String sname,String dob,int cno,String address,String gender,String hireddate,String email,String pass,String dep,String designation,float bsal){
        MUpdateEmployee MUE=new MUpdateEmployee();
        MUE.updateEmployee(empid,fname, sname, dob, cno, address, gender, hireddate, email, pass, dep, designation, bsal);
    }
}
