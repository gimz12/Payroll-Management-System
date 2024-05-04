package Control;

import Model.MSalaryAdd;

public class CSalaryAdd {
    public void salaryAdd(int empid,float bsal,float overtime_rate,float bonus,float other,String managedby,float deduction,String deductionres){
        MSalaryAdd MSA=new MSalaryAdd();
        MSA.salaryAdd(empid, bsal, overtime_rate, bonus, other, managedby,deduction,deductionres);
    }
}
