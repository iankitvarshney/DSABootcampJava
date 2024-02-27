import java.util.*;

public class Main {

	public static void pattern2(int n) {

		for(int row = 1; row <= n; row++) {
			for(int col = 1; col <= row; col++) {
				System.out.print("*\t");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		pattern2(n);

	}
}

/*

Input:
5

Output:
*	
*	*	
*	*	*	
*	*	*	*	
*	*	*	*	*	

*/