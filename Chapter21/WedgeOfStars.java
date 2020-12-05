import java.util.Scanner;
public class WedgeOfStars{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Initial number of stars: ");

        String stars = "";
        int starAmount = sc.nextInt();

        for (int i = 0; i <= (starAmount-1); i++){
            stars = stars + "*";
        }

        for (int i = 0; i <= (starAmount-1); i++){
            System.out.println(stars);
            stars = stars.substring(0, stars.length()-1);
        }
        
        sc.close();
    }
}