public class EmployeeWageComputation                               //Main class
{
	//Constants
	public static final int FULL_TIME=1;
	public static final int PART_TIME=2;

	public static void computeEmpWage(String company,int empRatePerHr,int numOfWorkingDays,int maxWorkingHrs)    //Method 
	{
		//Variables
		int empHrs=0;
                int totalEmpWage=0;
                int empWage=0;
                int totalEmpHrs=0;
                int totalWorkingDays=0;
		/while loop for less than 20 working days and less than 100 working hours
                while(totalEmpHrs<=maxWorkingHrs && totalWorkingDays<=numOfWorkingDays)
                {
                        totalWorkingDays++;
                        int empCheck=(int)Math.floor(Math.random()*10)%3;		//To generate a random valueof 0 to 2

                        switch(empCheck)						//switch case for employee fulltime,parttime and absent
                        {
                                case FULL_TIME:
                                empHrs=8;
                                break;

                                case PART_TIME:
                                empHrs=4;
                                break;

                                default:
                                empHrs=0;
                        }
                        totalEmpHrs+=empHrs;
                }
                totalEmpWage=totalEmpHrs*empRatePerHr;							//Salary of an employee
                System.out.println("Company: "+company+" Total Employee Wage: "+totalEmpWage);

	}

	public static void main(String[] args)                                //Main method
	{
		computeEmpWage("Dmart",12,34,56);			      //Mentioning company,employee rate per hour,no. of working days and max working hours 
		computeEmpWage("Reliance",23,36,46);
		computeEmpWage("Deloitte",24,64,16);
	}
}
