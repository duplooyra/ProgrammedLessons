import java.util.ArrayList;
import java.util.Arrays;

public class Points {
    double x;
    double y;

    public Points(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double originDistance(Points point){
        return (Math.abs(0 - point.getX(point)) + Math.abs(0 - point.getY(point)));
    }

    public String toString(){
        return ("(" + x + ", " + y + ")");
    }

    public double getX(Points point){
        return x;
    }

    public double getY(Points point){
        return y;
    }

    

    public static ArrayList<Points> createPoints(){
        Double[] list = {0.0, 1.0, 2.0, 3.0, 2.0, 5.0};
        ArrayList<Double> doubleList = new ArrayList<Double>();
        doubleList.addAll(Arrays.asList(list));

        ArrayList<Points> pointList = new ArrayList<Points>();

        for (int i = 0; i < doubleList.size() - 1; i = i += 2){
            Points points = new Points(doubleList.get(i), doubleList.get(i+1));
            pointList.add(points);
        }

        return pointList;

    }

    public static ArrayList<Points> createMidpoints(){
        ArrayList<Points> pointList = createPoints();
        for (int i = 0; i < pointList.size() - 1; i++){

            double x1 = pointList.get(i).getX(pointList.get(i));
            double x2 = pointList.get(i + 1).getX(pointList.get(i + 1));
            double y1 = pointList.get(i).getY(pointList.get(i));
            double y2 = pointList.get(i + 1).getY(pointList.get(i));

            double midpX = (x1 + x2) / 2;
            double midpY = (y1 + y2) / 2;
            Points midp = new Points(midpX, midpY);

            pointList.add(i + 1, midp);
            i++;
        }
        return pointList;
    }

    public static ArrayList<Points> proximitySort(){
        ArrayList<Points> pointList = createPoints();
        for (int i = 1; i < pointList.size(); i++){
            Points t = pointList.get(i);
            int x = i - 1;
            while (x >= 0 && pointList.get(x).originDistance(pointList.get(x)) > t.originDistance(t)){
                pointList.set(x + 1, pointList.get(x));
                x -= 1;
            }
            pointList.set(x + 1,t);
        }
        return pointList;
    }
    







}