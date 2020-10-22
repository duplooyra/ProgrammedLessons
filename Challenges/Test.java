import java.util.Random;
public class test {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int x = 1;
        while (x != 0){
            x = randomGenerator.nextInt(256);
            if (x == 0){
                System.out.println(x);
                break;
            }
            System.out.println(x);
        }
    }
    
}
