    import java.util.Random;
import java.util.Scanner;
public class SnakeEyes{
    public static void main(String[] args) {
     
        Random randomGenerator = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of times");

        int rolls = sc.nextInt();
        int player = 0;
        int score = 0;
        int above4 = 0;
        int rollScore = 0;
        int rollCount = 0;

        for (int i = 0; i < rolls; i++){
            int dice1 = randomGenerator.nextInt(6) + 1;
            int dice2 = randomGenerator.nextInt(6) + 1;
            
            while (dice1 != 1 && dice2 != 1){
                rollCount = rollCount + 1;
                if (rollCount == 4){
                    above4 += 1;
                }
                score = score + (dice1 + dice2);
                dice1 = randomGenerator.nextInt(6) + 1;
                dice2 = randomGenerator.nextInt(6) + 1;
                System.out.println("Roll: " + i + " Score: "+ score + " Player: " + player + " Rollcount: " + rollCount + " Dice1: " + dice1 + " Dice2: " + dice2);
            }
            
            player += 1;
            rollScore = rollScore + rollCount;
            rollCount = 0;
            

            
            //System.out.println("Roll: " + i + " Score: "+ score + " Player: " + player + " Rollcount: " + rollCount + " Dice1: " + dice1 + " Dice2: " + dice2);
            

        }
            System.out.println("\n\n\nAverage # of rolls: " + (rollScore/(double)player));
            System.out.println("Average score: " + (score/(double)player));
            System.out.println("% of players with more than 4 rolls: " + ((above4/(double)player) * 100));
            //System.out.println("\n" + above4 + "\n" + player);




        sc.close();
    }
}