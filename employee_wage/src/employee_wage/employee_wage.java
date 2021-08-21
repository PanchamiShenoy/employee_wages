package employee_wage;

public class employee_wage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("welcome to employee wage comparision program");
	
final int IS_FULL_TIME =1;
final int is_part_time=2;
 int rate_per_hr =20;
int emp_hrs=0;
int emp_wage=0;
int no_of_working_days=20;
int total_wage=0;
int total_emp_hrs=0;
int max_hrs=100;
int max_days=20;
int total_emp_days=0;
while(total_emp_hrs<max_hrs &&total_emp_days<max_days)
{
	total_emp_days+=1;
int empCheck=(int) (Math.floor(Math.random()*10)%3);
switch (empCheck) {
case  IS_FULL_TIME: emp_hrs=16;break;
case is_part_time: emp_hrs=8;break;
default: emp_hrs=0;
}
total_emp_hrs+=emp_hrs;
emp_wage=emp_hrs*rate_per_hr ;
total_wage+=emp_wage;
}			
System.out.println("Employee wage is "+total_wage);
System.out.println("Total working hours is "+total_emp_hrs);
System.out.println("Total working days is "+total_emp_days);
	
	}

}
