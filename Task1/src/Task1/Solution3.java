package Task1;

import java.util.Scanner;
public class Solution3 {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        
        int input = obj.nextInt();
        
        System.out.println("Input Number : "+input);
        int reversed = 0;
        
        while(input!=0){
            int digit = input%10;
            reversed = reversed * 10 +digit;
            input = input / 10;
            
        }
        System.out.println("Reversed Number : "+reversed );
        obj.close();
    }
}