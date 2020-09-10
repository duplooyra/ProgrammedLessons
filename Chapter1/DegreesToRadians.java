public class DegreesToRadians{

    public static void main(String[] args) {
        double degrees = 30.0;
        double rad = degrees * Math.PI/180;
        double sin = Math.sin(rad);
        double cos = Math.cos(rad);
        double sum = Math.sqrt(sin) + Math.sqrt(cos);

        System.out.println("sine: " + sin + " cosine: " + cos + " sum of squares: " + sum );
        

        





    }

}