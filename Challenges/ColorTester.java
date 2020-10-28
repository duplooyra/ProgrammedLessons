public class ColorTester{
    public static void main(String[] args) {

        // Check for default random color
        Color test = new Color();

        test.generateRandom();
        System.out.println(test.r + ", " + test.g + ", " + test.b);

        // Check for inputted color
        test.createColor(-30, 2000, 100);
        System.out.println(test.r + ", " + test.g + ", " + test.b);

        // Check for new random color
        test.randomize();
        System.out.println(test.r + ", " + test.g + ", " + test.b);

        // Retrieve and display current color
        test.getColor();

        // Darken and lighten by a percentage
        test.changeBrightness(130);
        System.out.println(test.r + ", " + test.g + ", " + test.b);
        
        // Access individual shade of color
        test.r = 155;
        test.g = 100;
        test.b = 50;
        System.out.println(test.r + ", " + test.g + ", " + test.b);

    }
}