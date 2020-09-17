import java.util.Scanner;
public class FurtherSubstring
{
  public static void main ( String[] args )
  {
    
    Scanner sc = new Scanner (System.in);
    
    System.out.println("Enter a string: ");
    String str = sc.nextLine();

    System.out.println("Enter beginning index: ");
    int begin = sc.nextInt();

    System.out.println("Enter ending index: ");
    int end = sc.nextInt();

    String sub = str.substring(begin, end);

    System.out.println("\nOriginal String:\n" + str + "\n\nSubstring:\n" + sub);

    sc.close();

  }
}