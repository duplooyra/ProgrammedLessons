
import java.util.Random;
public class Color{
    // Generate default random color
    Random randomGenerator = new Random();
    int r;
    int g;
    int b;

    // Generate a new color with random values for r, g, and b
    public void generateRandom(){
        r = randomGenerator.nextInt(256);
        g = randomGenerator.nextInt(256);
        b = randomGenerator.nextInt(256);
        }
    

    // Creates a new color with set values for r, g, and b
    public void createColor(int r,int g,int b){
        this.r = r;
        this.g = g;
        this.b = b;
        clampValues();
    }

    // Creates a new random color
    public void randomize(){
        r = randomGenerator.nextInt(256);
        g = randomGenerator.nextInt(256);
        b = randomGenerator.nextInt(256);
    }

    // Returns the color values
    public void getColor(){
        System.out.println("[" + r + ", " + g + ", "+ b + "]");
    }

    // Adjusts the brightness of the color
    public void changeBrightness(double percent){
        percent = percent / 100.0;
        r = (int) (r*percent);
        g = (int) (g*percent);
        b = (int) (b*percent);
        clampValues();
    }

    // Clamps illegal values
    private void clampValues(){
        if (r > 255){
            r = 255;
        }
        if (g > 255){
            g = 255;
        }
        if (b > 255){
            b = 255;
        }
        if (r < 0){
            r = 0;
        }
        if (g < 0){
            g = 0;
        }
        if (b < 0){
            b = 0;
        }
    }
    

}