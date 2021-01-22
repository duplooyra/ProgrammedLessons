abstract class Card
{
  protected String recipient;
  public abstract void greeting();
}

class Holiday extends Card
{
  public Holiday( String r )
  {
    recipient = r;
  }

  public void greeting()
  {
    System.out.println("Dear " + recipient + ",");
    System.out.println("Season's Greetings!\n");
  }
}

public class CardTester
{
  public static void main ( String[] args )
  {
    Holiday hol = new Holiday("Santa");
    hol.greeting();
  }
}