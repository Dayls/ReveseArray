import java.util.*;

public class ReverseArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		scanner.close();
		String reversedStr;
		char[] strArray = str.toCharArray();
		char[] reversedArray = new char[strArray.length];
		for(int i = strArray.length - 1, j = 0; i >= 0; i--, j++) {
			reversedArray[j] = strArray[i];
		}
		reversedStr = String.valueOf(reversedArray);
		System.out.println(reversedStr);
	}
}
