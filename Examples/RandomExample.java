import java.util.Random;

public class RandomExample{
    public static void main(String[] args) {
        Random randomGenerator = new Random();

        int max = 100;

        int n = randomGenerator.nextInt(max);

        System.out.println(n);





    }
}