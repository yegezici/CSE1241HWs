/*This program is about Private Pension System.
This program easily shows us the money that we have after six months
*/
//Yunus Emre Gezici 
//150121066

import java.util.Scanner;

public class Pro3_150121066 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// The program takes data from user

		System.out.print("How much do you earn per month: ");
		double salary = input.nextDouble();

		System.out.print("Enter the percent of your salary to save");
		double saving = input.nextDouble();

		System.out.print("Enter the monthly interest rate");
		double interestRate = input.nextDouble();

		System.out.print("Enter the monthly government support rate");
		double supportRate = input.nextDouble();

		// The program calculates the value of account for 6 months

		double monthlySaving = salary * (saving / 100);

		double month1 = monthlySaving * (1 + supportRate / 100) * (1 + interestRate / 100);
		System.out.println("The money that you have after 1 month:" + (int) (month1 * 100) / 100.0);

		double month2 = (month1 + monthlySaving * (1 + supportRate / 100)) * (1 + interestRate / 100);
		System.out.println("The money that you have after 2 month:" + (int) (month2 * 100) / 100.0);

		double month3 = (month2 + monthlySaving * (1 + supportRate / 100)) * (1 + interestRate / 100);
		System.out.println("The money that you have after 3 month:" + (int) (month3 * 100) / 100.0);

		double month4 = (month3 + monthlySaving * (1 + supportRate / 100)) * (1 + interestRate / 100);
		System.out.println("The money that you have after 1 month:" + (int) (month4 * 100) / 100.0);

		double month5 = (month4 + monthlySaving * (1 + supportRate / 100)) * (1 + interestRate / 100);
		System.out.println("The money that you have after 5 month:" + (int) (month5 * 100) / 100.0);

		double month6 = (month5 + monthlySaving * (1 + supportRate / 100)) * (1 + interestRate / 100);
		System.out.println("The money that you have after 6 month:" + (int) (month6 * 100) / 100.0);

		// The program calculates total profit and saving

		double totalSaving = monthlySaving * 6;
		double totalProfit = month6 - totalSaving;
		System.out.println("After six months, your saving will be " + totalSaving + " and total profit will be  "
				+ (int) (totalProfit * 100) / 100.0);

	}

}
