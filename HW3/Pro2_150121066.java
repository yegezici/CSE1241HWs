//This program calculates number times 4 minus the previous number until 
//the number that is taken from user.
//Yunus Emre Gezici 150121066
import java.util.Scanner;

public class Pro2_150121066 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        //This part takes number from user
		System.out.print("Please enter an integer number: ");
		int number = input.nextInt();
		//The first result must be 0
		if (number == 1) {
			System.out.println("In position " + number + ", the value is 0");
		} else {
			//Due to the first result must be 0, this program uses a variable like k 
			int k = number - 1;
			int n1 = 0;
			int n = 1;
			int n2 = 0;
			//This for loop is used at calculating every number until k
			for (int i = 0; i < k; i++) {
				n2 = n1;
				n1 = n;
				n = 4 * n1 - n2;
			}System.out.println("In position " + number + ", the value is " + n1);
		}
	}
}
