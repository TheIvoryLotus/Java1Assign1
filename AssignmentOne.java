import java.util.Scanner;
// Christopher H
//This program calculates the future investment amount in a deposit account

public class AssignmentOne{
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Account deposit
        double initialAmount;
        // Interest rate
        double interestRate;
        // Number of years
        int numberOfYears;
        // Final interest amount
        double futureInvestmentAmount;

        //Assign an account deposit
        System.out.print("Enter investment amount: ");
        initialAmount = input.nextDouble();

        //Assign an interest rate
        System.out.print("Enter annual interest rate in percentage: ");
        interestRate = input.nextDouble();

        //Assign a number of years
        System.out.print("Enter number of years: ");
        numberOfYears = input.nextInt();

        //Assign a future investment amount
        futureInvestmentAmount = initialAmount * Math.pow( 1 + (interestRate / 1200),(12 * numberOfYears));


        //Display Results
        System.out.println("Your amount is = " + futureInvestmentAmount);
		//Display the future investment amount as an integer
        System.out.println("Your amount is = " + (int)futureInvestmentAmount);
	
		int fiai = (int)futureInvestmentAmount;
		
		//Solve and print digit 1
		int digit1 = fiai / 10000;
		System.out.println("digit1 = " + digit1);
		
		//Solve and print digit 2
		fiai = fiai % 10000;
		int digit2 = fiai / 1000;
		System.out.println("digit2 = " + digit2);
		
		//Solve and print digit 3
		fiai = fiai % 1000;
		int digit3 = fiai / 100;
		System.out.println("digit3 = " + digit3);
		
		//Solve and Print digit 4
		fiai = fiai % 100;
		int digit4 = fiai / 10;
		System.out.println("digit4 = " + digit4);
		
		//Solve and print digit 5
		fiai = fiai % 10;
		int digit5 = fiai / 1; 
		System.out.println("digit5 = " + digit5);
		

    }
}