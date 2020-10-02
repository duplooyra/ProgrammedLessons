import java.util.Random;
import java.util.Scanner;
public class SnakeEyes{
    public static void main(String[] args) {
     
        Random randomGenerator = new Random();
        int max = 6;

        Scanner sc = new Scanner(System.in);
        System.out.println("Number of times");
        int rolls = sc.nextInt();
        float player = 1;
        int score = 0;
        float above4 = 0;
        int rollscore = 0;
        int rollcount = 0;

        for (int i = 1; i < rolls; i++){
            int dice1 = randomGenerator.nextInt(max);
            int dice2 = randomGenerator.nextInt(max);
            if (dice1 == 1 && dice2 == 1){
                player = player + 1;
                rollscore = rollscore + rollcount;
                rollcount = 0;
                
            }
            else{
                rollcount = rollcount + 1;
                if (rollcount == 4){
                    above4 += 1;
                }
                score = score + (dice1 + dice2);
            }
            
            //System.out.println("Roll: " + i + " Score: "+ score + " Player: " + player + " Rollcount: " + rollcount + " Dice1: " + dice1 + " Dice2: " + dice2);
            

        }
            System.out.println("\n\n\nAverage # of rolls: " + (rollscore/(int)player));
            System.out.println("Average score: " + (score/(int)player));
            System.out.println("% of players with more than 4 rolls: " + ((above4/(int)player) * 100));
            //System.out.println("\n" + above4 + "\n" + player);




        sc.close();
    }
}