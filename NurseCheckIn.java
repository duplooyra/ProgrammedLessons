import java.util.Scanner;
public class NurseCheckIn{

public static void main(String[] args){


    System.out.println("Name:");
    Scanner namescanner = new Scanner(System.in);
    String name = namescanner.next();

    System.out.println("Age:");
    Scanner agescanner = new Scanner(System.in);
    String age = agescanner.next();

    System.out.println("Temperature:");
    Scanner tempscanner = new Scanner(System.in);
    String temp = tempscanner.next();

    System.out.println("Blood Pressure:");
    Scanner bpscanner = new Scanner(System.in);
    String bp = bpscanner.next();

    System.out.println("Family history of diabetes (y/n):");
    Scanner diabetesscanner = new Scanner(System.in);
    String diabetes = diabetesscanner.next();

    System.out.println("Current level of discomfort 1-10:");
    Scanner discscanner = new Scanner(System.in);
    String disc = discscanner.next();

    System.out.println("2 Symptoms:");
    Scanner symptomscanner = new Scanner(System.in);
    String symptoms = symptomscanner.next();

    System.out.println("\n \n \n \n \n");
    System.out.println("Patient name: " + name + "\n" + "Patient age: " + age + "\n" + "Temperature: " + temp + "\n" + "Blood Pressure: " + bp + "\n" + "Family history of diabetes (y/n): " + diabetes + "\n" + "Current level of discomfort 1-10: " + disc + "\n" + "2 Symptoms: " + symptoms);

    namescanner.close();
    agescanner.close();
    tempscanner.close();
    bpscanner.close();
    diabetesscanner.close();
    discscanner.close();
    symptomscanner.close();









    
}








}