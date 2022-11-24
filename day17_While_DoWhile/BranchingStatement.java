package day17_While_DoWhile;

import java.util.Scanner;

public class BranchingStatement {
    public static void main(String[] args) {
        for (char i = 'A'; i <='Z' ; i++) {
           if (i=='F'){
               break; // exist the loop, doesn't execute this value
           }
           System.out.print(i+" ");
        }
        System.out.println("////////////////////////////////////////////////////////////////////");

        while (true){
            Scanner scan= new Scanner(System.in);
            System.out.println("Enter a number: ");
            int num = scan.nextInt();
            if(num<0){
       break;}
        }
        System.exit(0);
    }
}
