package day17_While_DoWhile;

import java.util.Scanner;

public class WillYouMarryMe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Will you marry me?");
        String a = scan.next().toLowerCase();



        while (!(a.equals("yes")||a.equals("no"))){
            System.out.println("invalid respond, please re-enter");
        }
        if(a.equals("yes")){
            System.out.println("congrats");
        }else{
            System.out.println("Too Shame");
        }
    }
}
