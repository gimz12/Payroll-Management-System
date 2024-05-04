package Control;

import Model.MUpdateSalaryTable;

public class CUpdateSalaryTable {
    public void updateSalaryTable(int empid,float basicsal,float overtime_rate,float bonus,float other,String managedby,float deduction,String deductionres){
        MUpdateSalaryTable MUST= new MUpdateSalaryTable();
        MUST.updateAttendance(empid, basicsal, overtime_rate, bonus, other, managedby, deduction, deductionres);
    }
}
