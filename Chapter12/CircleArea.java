import java.util.Scanner;
public class CircleArea{
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Input the radius: ");

    int r = sc.nextInt();
    double area = Math.PI * (r*r);

    System.out.println("The radius is: " + r + " The area is: " + area);

    sc.close();






}

}