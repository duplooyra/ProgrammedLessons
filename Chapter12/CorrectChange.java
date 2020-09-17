import java.util.Scanner;
public class CorrectChange
{
  public static void main ( String[] args )
  {
    System.out.println("Input the cents: ");
    Scanner sc = new Scanner (System.in);
    int cents = sc.nextInt();
    
    int centsleft = cents % 100;
    int dollars = cents / 100;

    int quarters = centsleft / 25;
    centsleft = centsleft % 25;

    int dimes = centsleft / 10;
    centsleft = centsleft % 10;

    int nickels = centsleft / 5;
    centsleft = centsleft % 5;
    
    System.out.println("Your change is: " + dollars + " dollars " + quarters + " quarters " + dimes + " dimes " + nickels + " nickels and "+ centsleft + " cents");
    sc.close();

  }
}