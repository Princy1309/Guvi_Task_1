package Task1;

import java.util.Scanner;
public class Solution5 {
    public static void main(String[] args) {
       
        Scanner obj = new Scanner(System.in);
        
        Double purchase= obj.nextDouble();
        
        System.out.println("Enter Your Purchase amount : "+purchase);
        
        double discount =0.0;
        
        if(purchase<500){
            discount=0;
        }
        else if(purchase>=500 && purchase<=100){
            discount=purchase*0.10;
        }
        else{
            discount=purchase*0.20;
        }
        
        Double finalAmount=purchase-discount;
        
        System.out.println("Dicount Amount is : ₹"+discount);
        System.out.println("Final Payable Amount: ₹"+finalAmount);
         obj.close();
    }
   
}