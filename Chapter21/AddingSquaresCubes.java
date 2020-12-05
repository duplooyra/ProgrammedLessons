import java.util.Scanner;
public class AddingSquaresCubes{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("N: ");
        int n = sc.nextInt();
        int squareSum = 0;
        int cubeSum = 0;

        for (int i = 0; i <= n; i++){
            squareSum = squareSum + (i*i);
            cubeSum = cubeSum + (i*i*i);
        }

        System.out.println("The sum of Squares is " + squareSum);
        System.out.println("The sum of Cubes is " + cubeSum);

        sc.close();
    }
}