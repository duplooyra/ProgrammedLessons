import java.util.Scanner;
public class WeekTemp{

public static void main(String[] args) {
    
    
    Scanner sc = new Scanner(System.in);
    System.out.print(" Monday:");
    int day1 = sc.nextInt();
    System.out.print(" Tuesday:");
    int day2 = sc.nextInt();
    System.out.print(" Wednesday:");
    int day3 = sc.nextInt();
    System.out.print(" Thursday:");
    int day4 = sc.nextInt();
    System.out.print(" Friday:");
    int day5 = sc.nextInt();
    System.out.print(" Saturday:");
    int day6 = sc.nextInt();
    System.out.print(" Sunday:");
    int day7 = sc.nextInt();

    double average = (day1 + day2 + day3 + day4 + day5 + day6 + day7)/7.0;

    

    System.out.println("\n \n \n \n \n");
    System.out.println("-----------------------");
    System.out.println("Monday:\t \t"+day1); 
    System.out.println("Tuesday:\t"+day2); 
    System.out.println("Wednesday:\t"+day3); 
    System.out.println("Thursday:\t"+day4); 
    System.out.println("Friday:\t \t"+day5); 
    System.out.println("Saturday:\t"+day6); 
    System.out.println("Sunday:\t \t"+day7); 
    System.out.println("\nWeek Average:\t"+average); 
    System.out.println("-----------------------");

    sc.close();
    



}
}