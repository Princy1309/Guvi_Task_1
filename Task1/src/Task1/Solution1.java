package Task1;
import java.util.Scanner;
public class Solution1 {
    public static void main(String[] args) {
        Scanner obj =new Scanner (System.in);
        
        int i=obj.nextInt();
        int j=obj.nextInt();
        
        while(i<=j){
            System.out.println(i);
            i++;
        }
        obj.close();
    }
    
}