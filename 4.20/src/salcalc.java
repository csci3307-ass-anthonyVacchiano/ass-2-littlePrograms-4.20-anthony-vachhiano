import java.util.Scanner;
public class salcalc {
	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		String[] employeenames = {" ", " ", " "}; 
		int[] hoursworked = {0, 0, 0};
		double hourlyrate;
		
		System.out.println("Welcome to the Salary Calculator.\n");
		System.out.println("Please enter:");
		
		for (int i = 0; i < 3; i++)
		{
			System.out.println("Employee" + (i + 1) + " Name: ");
			employeenames[i] = input.nextLine();
		}
		
		for (int i = 0; i < 3; i++)
		{
			System.out.print(employeenames[i] + "'s hours worked: ");
			hoursworked[i] = input.nextInt();
		}
		
		System.out.print("and finally, how much all three made per hour: ");
		hourlyrate = input.nextDouble();
		for (int i = 0; i < 3; i++)
		{
			System.out.printf("The gross pay for " + employeenames[i] + " is: $%.2f",calculationmethod(hoursworked[i], hourlyrate));
			System.out.println();
		}
	}
	
	public static double calculationmethod(int numberOfHours, double hourlyRate)
	{
		double grossPay;
		if (numberOfHours <= 40)
		{
			grossPay = numberOfHours * hourlyRate;
		}
		else 
		{
			System.out.printf("%S", "Overtime Time Notice: ");
			int HalfTime = numberOfHours / 2;
			grossPay = (numberOfHours + HalfTime) * hourlyRate;
		}
		return grossPay;
	}
}
