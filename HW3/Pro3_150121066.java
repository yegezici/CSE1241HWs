
//This program takes a string from the user and
//it writes it twice but firstly, letter of string decreases 
//one by one then increases
//Yunus Emre Gezici 150121066
import java.util.Scanner;

public class Pro3_150121066 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// The program takes string from the user here
		System.out.print("Enter an input string: ");
		String s1 = input.nextLine();
		String s = s1.toUpperCase();
		if (s.equals("QUIT") || s.equals("QUİT")) {
			System.out.println("OK. Good bye :-)");
		} else {
			while (s != "QUIT") {
				// This for loop finds length of the string
				for (int u = s.length(); u > 0; u--) {
					int b = s.length();
					// These substrings decide the part of string which will be displayed
					String leftS = s.substring(0, u);
					String rightS = s.substring(b - u);
					System.out.print(leftS);
					// This for loop prints spaces
					for (int i = b; i > u && i > 0; i--) {
						System.out.print("  ");
					}
					System.out.print(rightS + "\n");
				}
				// This part is for the lower part
				for (int u = s.length() - 1; u >= 0; u--) {
					int b = s.length();
					String leftS = s.substring(0, b - u);
					String rightS = s.substring(u);
					System.out.print(leftS);
					for (int i = 0; i < u && i >= 0; i++) {
						System.out.print("  ");
					}
					System.out.print(rightS + "\n");

				}
				// If the user writes quit, this program will stop
				System.out.print("Enter an input string: ");
				s1 = input.nextLine();
				s = s1.toUpperCase();
				if (s.equals("QUIT") || s.equals("QUİT")) {
					System.out.println("OK. Good bye :-)");
					break;
				}
			}
		}
	}
}
