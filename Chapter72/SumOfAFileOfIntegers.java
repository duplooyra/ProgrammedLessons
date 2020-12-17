import java.io.*;
import java.util.*;

public class SumOfAFileOfIntegers {

public static void main(String args[]){
    try{
        File saveFile = new File("test.txt");
        Scanner scanner = new Scanner(saveFile);
        int sum = 0;
        while (scanner.hasNext()){
            sum += scanner.nextInt();
        }
        System.out.println("Sum: "+sum); 
        scanner.close();
    }catch(Exception err){
        err.printStackTrace();
    }

}
}