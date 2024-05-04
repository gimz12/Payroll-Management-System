package Control;

import Model.MPayrollAdd;



public class CPayrollAdd {
    public void payrollAdd(int empid,String date,float tot_allow,float tot_deduction,float gross_sal,float netsal){
        MPayrollAdd MSA=new MPayrollAdd();
        MSA.payrollAdd(empid,date,tot_allow,tot_deduction,gross_sal,netsal);
    }
}
