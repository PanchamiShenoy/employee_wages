package employee_wage;

public class employee_wage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("welcome to employee wage comparision program");
	
final int IS_FULL_TIME =1;
int rate_per_hr =20;
int emp_hrs=0;
int emp_wage=0;
double empCheck=Math.floor(Math.random()*10)%2;
if (empCheck==IS_FULL_TIME)
	emp_hrs=8;
	emp_wage=emp_hrs*rate_per_hr ;
			
	System.out.println("Employee wage is "+emp_wage);
	
	}

}
