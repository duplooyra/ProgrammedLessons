import java.util.Scanner;
public class OneLetterPerLine{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.next();
        int length = word.length();

        for(int i = 0; i < length; i++){
            System.out.println(word.charAt(i));
        }

        sc.close();
    }
}