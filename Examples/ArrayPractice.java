public class ArrayPractice{
    public static void swapEnds(int[] data){
        int x = data[0];
        data[0] = data[data.length - 1];
        data[data.length - 1] = x;
    }

    public static boolean hasSeven(int[] data){
        for (int i = 0; i < data.length; i++){
            if (data[i] == 7){
                return true;
            }
        }
        return false;
    }

    public static double mean(int[] data){
        int total = 0;
        for (int i = 0; i < data.length; i++){
            total = total + data[i];
        }
        double mean = total / data.length;
        return mean;
    }

    public static void reverse(int[] data){
        for (int i = 0; i < data.length /2; i++){
            int x = data[i];
            data[i] = data[data.length - i - 1];
            data[data.length - i -1] = x;
        }
    }
}