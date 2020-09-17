import java.util.Scanner;
public class OhmLaw
{
  public static void main ( String[] args )
  {
    System.out.println("Voltage:  ");
    Scanner sc = new Scanner (System.in);
    int voltage = sc.nextInt();

    System.out.println("Resistance:  ");
    int resistance = sc.nextInt();

    double current = (voltage + 0.0) / resistance;
    
   
    
    System.out.println("Current: " + current);
    sc.close();

  }
}