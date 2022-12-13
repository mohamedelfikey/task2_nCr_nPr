/*
 * Write java program that find and prints nCr (Combination) and nPr (Permutation)
   based on the n and r value entered by user at run-time of the program.

 * mohamed ahmed elsayed elfikey
 * id 1900306
 */
package lab1_task2_ncr_npr;
import java.util.Scanner;
public class Lab1_task2_nCr_nPr {

    
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        int n,r,C,P;
        System.out.println("please enter n value");
        n=input.nextInt();
        System.out.println("please enter r value");
        r=input.nextInt();
        C=fact(n) / (fact(n-r) * fact(r)); // calculate the nCr
        System.out.println("nCr = "+C);
        P=fact(n)/fact(n-r); // calculate the nPr
        System.out.println("nPr = "+P);
        
       
    }
    public static int fact(int f) // function to calculat the factorial
     {
         int count=f-1;
         while (count!=0)
         {
             f*=count;
             count--;
         }
         return f;
     }
    
}
