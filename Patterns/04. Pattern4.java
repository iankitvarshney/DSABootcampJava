import java.util.*;

public class Main {

	public static void pattern4(int n) {

		for(int row = 1; row <= n; row++) {
			for(int col = 1; col <= row; col++) {
				System.out.print(col + "\t");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		pattern4(n);

	}
}

/*

Input:
5

Output:
1	
1	2	
1	2	3	
1	2	3	4	
1	2	3	4	5	

*/