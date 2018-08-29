import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args){
        double pi = Math.PI;
        String inData;
        Scanner scan = new Scanner(System.in);

        System.out.println("Input the Radius: ");
        inData = scan.nextLine();
        String r = inData;
        double area = r * pi;

        System.out.println("The radius is: " + r);
        System.out.println("The area is: " + area);
    }
}