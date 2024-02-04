
//This program calculates how many gross and dozen eggs
//Yunus Emre Gezici
//150121066
import java.util.Scanner;

public class Pro2_150121066 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//Here the program is asking total eggs that you have
		System.out.print("How many eggs do you have: ");
		int totalEggs = input.nextInt();
//Firstly, the program calculates how many gross that you have here
		int gross = totalEggs / 144;
		int remainder1 = totalEggs % 144;
//Secondly,it calculates dozens
		int dozen = remainder1 / 12;
//Lastly, it calculates rest of the eggs
		int eggs = totalEggs - (gross * 144 + dozen * 12);
		// The program prints the results here
		System.out.println("You have " + gross + " gross " + dozen + " dozen " + " and " + eggs + " eggs.");

	}
}