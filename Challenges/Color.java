
import java.util.Random;
public class Color{
    // Generate default random color
    Random randomGenerator = new Random();
    int r = randomGenerator.nextInt(256);;
    int g = randomGenerator.nextInt(256);;
    int b = randomGenerator.nextInt(256);;
    int x = 0;

    public void clampValues(){
        if (r > 255){
            r = 255;
        }
        if (g > 255){
            r = 255;
        }
        if (b > 255){
            r = 255;
        }
        if (r < 0){
            r = 0;
        }
        if (g < 0){
            r = 0;
        }
        if (b < 0){
            r = 0;
        }
    }

    // Sets color to inputed values
    public void setColor(int r,int g,int b){
        clampValues();
        this.r = r;
        this.g = g;
        this.b = b;
    }

    // Generates a new random color
    public void genColor(){
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
    }
    

}