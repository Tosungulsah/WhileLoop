package day17_While_DoWhile;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age=scan.nextInt(); // valid age 1-120
        while ( !(age>=0&& age<=120)){
            System.err.println("Invalid entry, please re-enter: ");
            age= scan.nextInt();
        }
        System.out.println("Are you a US citizen? yes or no: ");
        String answer= scan.next().toLowerCase();

        while(!(answer.equals("yes")) || answer.equals("no") ) {
            System.err.println("Invalid entry please, re-enter ");
            System.err.println("Are you a US citizen? yes or no: ");
            answer = scan.next().toLowerCase();
        }
        System.out.println((age < 16) ? "You are not eligible to vote" : "You are eligible to vote");
        scan.close();
        }
}
