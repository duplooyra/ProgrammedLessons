public class StringExamples{
    public static void main(String[] args) {
        String str = "This is a string";
        //             01234567
        String game = "baseball";
        
        game.indexOf("ball"); // 4
        game.indexOf("all"); // 5
        game.indexOf("z"); // -1

        game.substring(5, 8); // "all"
        game.substring (1, 2); // "a"

        game.substring(3); // "eball"

        // concatenation -> adds the strings
        String newString = game.substring(0, 1) + "new ending";

        String a = "a";
        String b = "b";

        // compareTo -> given another one
        // 1 -> the two are already in order
        // 0 -> the two are the same
        // -1 -> the two are out of order

        a.compareTo(b); // 1
        b.compareTo(a); // -1
        a.compareTo(a); // 0

        
    }
}