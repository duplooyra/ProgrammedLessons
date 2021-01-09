import java.util.Arrays;
public class ArrayTester{
    public static void main(String[] args) {
        int[] numbers = {1, 8, 5, 3};
        System.out.println(Arrays.toString(numbers) + " ORIGINAL ARRAY");

        ArrayPractice.swapEnds(numbers);
        System.out.println(Arrays.toString(numbers) + " SWAPPED ENDS");

        System.out.println(ArrayPractice.hasSeven(numbers) + " CHECKED FOR 7");

        System.out.println(ArrayPractice.mean(numbers) + " MEAN");

        ArrayPractice.reverse(numbers);
        System.out.println(Arrays.toString(numbers) + " REVERSED ARRAY");

        System.out.println(ArrayPractice.search(numbers, 8) + " SEARCHED ARRAY FOR 8");

        ArrayPractice.sort(numbers);
        System.out.println(Arrays.toString(numbers) + " SORTED ARRAY");
    }
}