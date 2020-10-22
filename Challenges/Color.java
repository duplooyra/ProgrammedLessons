
import java.util.Random;
public class Color{
    // Generate default random color
    Random randomGenerator = new Random();
    int r = randomGenerator.nextInt(256);;
    int g = randomGenerator.nextInt(256);;
    int b = randomGenerator.nextInt(256);;


    public void InputColor(int r,int g,int b){
        this.r = r;
        this.g = g;
        this.b = b;
        
    }
    // Generates a new random color
    public String GenerateColor(){
        r = randomGenerator.nextInt(256);
        g = randomGenerator.nextInt(256);
        b = randomGenerator.nextInt(256);
        return (r + "," + g + "," + b);
    }

}