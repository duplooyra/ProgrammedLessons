import java.util.Scanner;
public class HelloWorld {
    

public static void main(String[] args){
    
    // System.out.println("\nPeriod 1 - ACC English\nPeriod 2 - US Economics\nPeriod 3 - AP Physics\nPeriod 4 - AP Computer Science A\nPeriod 5 - US Government\nPeriod 6 - ACC Revit Architecture\nPeriod 7 - AP Calculus BC");

    System.out.println("What is your name?");
    Scanner scanner = new Scanner(System.in);

    String name = scanner.next();
    scanner.close();
    System.out.println("Hello " + name);
}

}