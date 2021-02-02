import java.util.Arrays;
public class ComparisonSorts{
   public static void main(String[] args) {
     int[] array = {3,7,1,2,8};  
     selectionSort(array);
     System.out.println(Arrays.toString(array) + " Selection Sort");

     array = new int[] {5,2,3,7,1}; 
     InsertionSort(array);
     System.out.println(Arrays.toString(array) + " Insertion Sort");

     array = new int[] {2,4,8,1,3}; 
     BubbleSort(array);
     System.out.println(Arrays.toString(array) + " Bubble Sort");
      
   }

   public static int[] selectionSort(int[] array1){
      for (int i = 0; i < array1.length - 1; i++){
         int location = i;
         for (int x = i + 1; x < array1.length; x++){
            if (array1[x] < array1[location]){
               location = x;
            }
         }
         int smaller = array1[location];
         array1[location] = array1[i];
         array1[i] = smaller;
      }
      return array1;
   }

   public static int[] InsertionSort(int[] array1){
      for (int i = 1; i < array1.length; i++){
         int k = array1[i];
         int x = i - 1;
         while ((x > -1) && (array1[x] > k)){
            array1[x + 1] = array1[x];
            x = x - 1;
         }
         array1[x + 1] = k;
      }
      return array1;
   }

   public static int[] BubbleSort(int[] array1){
      for (int i = 0; i < array1.length - 1; i++){
         for (int x = 1; x < (array1.length - 1); x++){
            if (array1[x - 1] > array1[x]){
               int tempValue = array1[x - 1];
               array1[x - 1] = array1[x];
               array1[x] = tempValue;
            }
         }
      }
      return array1;
   }

}