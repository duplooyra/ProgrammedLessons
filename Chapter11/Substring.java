public class Substring
{
  public static void main ( String[] args )
  {

    String str = new String( "Golf is a good walk spoiled." ); // create the original object

    String sub = str.substring(20); //create a new object from the original
    System.out.println(sub);

    String sub2 = str.substring(0,28);
    System.out.println(sub2);

  }
}