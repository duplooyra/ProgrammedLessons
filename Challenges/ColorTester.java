public class ColorTester{
    public static void main(String[] args) {

        // Check for default random color
        Color test = new Color();
        System.out.println(test.r + ", " + test.g + ", " + test.b);

        // Check for inputted color
        test.setColor(-30, 200, 100);
        System.out.println(test.r + ", " + test.g + ", " + test.b);

        // Check for new random color
        test.genColor();
        System.out.println(test.r + ", " + test.g + ", " + test.b);

        // Retrieve and display current color
        System.out.println(test.getColor());

        // Darken and lighten by a percentage
        test.setBrightness(130);
        System.out.println(test.r + ", " + test.g + ", " + test.b);
        
    }
}