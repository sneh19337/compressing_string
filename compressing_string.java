import java.util.Scanner;

public class runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(Solution.compress(input));
	}
}
public class Solution {

	public static String compress(String inputString) {
		// Write your code here
         
    int currentLength = 1;

    StringBuilder result = new StringBuilder(); // empty string
    for (int i = 1; i < inputString.length(); i++) {
        if (inputString.charAt(i) == inputString.charAt(i - 1)) {
            currentLength++;
        } else {
           // System.out.println(currentLength + "" + inputString.charAt(i - 1));
            result.append(inputString.charAt(i - 1))
                .append(currentLength > 1 ? currentLength : "");
            currentLength = 1; // reset the length
        }
    }

    // print last one
   // System.out.println(currentLength + "" + a.charAt(a.length() - 1));
    result.append(inputString.charAt(inputString.length() - 1))
        .append(currentLength > 1 ? currentLength : "");
    inputString= result.toString();
     return (inputString);
	}

}
