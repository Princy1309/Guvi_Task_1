package Task1;

import java.util.Scanner;
public class Solution2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner (System.in);
		
		int input =obj.nextInt();
		
		if(input<0) {
			System.out.println("Negative");
		}
		else {
			System.out.println("Positive");
		}
		obj.close();
    }
}