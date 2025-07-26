package Task1;

import java.util.Scanner;
public class Solution4 {
    public static void main(String[] args) {
        Scanner obj = new Scanner (System.in);
		
		int num1=obj.nextInt();
		int num2=obj.nextInt();
		int num3=obj.nextInt();
		
		int smallest = Math.min(num1,Math.min(num2, num3));
		
			System.out.println("The Smallest among three numbers is : "+smallest);
	
		
		obj.close();
    }
}
