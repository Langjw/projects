import java.util.Scanner;

public class Excercise2 {
    public static void main(String[] args) {
        //String inData;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Input the Cents: 324");
        //inData = scan.nextLine();
        int cents = 324 % 100;
        int dollars = 324 / 100;
        System.out.println("That is " + dollars); 
        System.out.println("dollars and " + cents); 
        System.out.println("cents.");
        
    }
}