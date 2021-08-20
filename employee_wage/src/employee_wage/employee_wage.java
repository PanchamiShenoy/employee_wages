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
for(int day=0;day<no_of_working_days;day++)
{
int empCheck=(int) (Math.floor(Math.random()*10)%3);
switch (empCheck) {
case  IS_FULL_TIME: emp_hrs=16;break;
case is_part_time: emp_hrs=8;break;
default: emp_hrs=0;
}

emp_wage=emp_hrs*rate_per_hr ;
total_wage+=emp_wage;
}			
	System.out.println("Employee wage is "+total_wage);
	
	}

}
