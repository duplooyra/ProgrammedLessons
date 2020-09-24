import java.util.Scanner;
public class WhileLoops{
    public static void main(String[] args) {
        int count = 0;                  //start
        while (count < 10){              //stopping condition
            System.out.println(count);  //action
            count += 1;          //change
        }


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter password: ");
        String password = scanner.next();

        while (!password.equals("password")){
            System.out.println("Enter password:");
            password = scanner.next();
        }

        scanner.close()

    }
}