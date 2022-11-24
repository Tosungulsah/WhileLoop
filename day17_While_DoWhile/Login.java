package day17_While_DoWhile;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //username= "Cydeo";
        //password= "Cydeo123";
        System.out.println("Please enter a user name: ");
        String u=scan.nextLine();

        System.out.println("Please enter your password: ");
        String p=scan.nextLine();

       if(u.equals("Cydeo") && p.equals("Cydeo123")){
           System.out.println("Logged in");
       }else{
           int attemps=3;
           while(!(u.equals("Cydeo") && p.equals("Cydeo123")) && attemps>0){
               if(attemps==1){
                   System.out.println("This is your last chance");
               }
               System.out.println("Incorrect username or password, please try again ");
               System.out.println("Please enter a user name: ");
               u=scan.nextLine();

               System.out.println("Please enter your password: ");
                p=scan.nextLine();
                attemps--;

           }if(u.equals("Cydeo") && p.equals("Cydeo123")){
               System.out.println("Logged in");
           }else {
               System.out.println("Your account is locked.");
           }
       }
scan.close();
    }
}
