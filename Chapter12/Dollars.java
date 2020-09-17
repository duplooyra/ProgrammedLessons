import java.util.Scanner;
public class Dollars
{
  public static void main ( String[] args )
  {
    System.out.println("Input the cents: ");
    Scanner sc = new Scanner (System.in);
    int cents = sc.nextInt();
    int centsleft = cents % 100;
    int dollars = cents / 100;
    System.out.println("That is " + dollars + " and " + centsleft + " cents");
    sc.close();

  }
}