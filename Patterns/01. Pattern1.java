import java.util.*;

public class Main {

	public static void pattern1(int n) {

		for(int row = 1; row <= n; row++) {
			for(int col = 1; col <= n; col++) {
				System.out.print("*\t");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		pattern1(n);

	}
}

/*

Input:
5

Output:
*	*	*	*	*	
*	*	*	*	*	
*	*	*	*	*	
*	*	*	*	*	
*	*	*	*	*	

*/