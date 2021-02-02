import java.util.ArrayList;
import java.util.Arrays;


public class ArrayListProblems {
    public static void main(String[] args) {
        System.out.println("0: " + fruitVegetableSort());
        System.out.println("1: " + commonFruitList());
        System.out.println("2: " + animalRemoveDuplicates());
        System.out.println("3: " + addInteger());  
        System.out.println("4: " + reverseInteger());      
        

    }

    public static ArrayList<String> fruitVegetableSort() {
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> fruitList = new ArrayList<String>();
        ArrayList<String> vegetableList = new ArrayList<String>();

        String[] fruits = {"Apricot","Lychee","Watermelon","Strawberry","Kumquat","Mango","Papaya","Quince","Durian"};
        String[] vegetables = {"Pumpkin","Pea","Squash","Corn","Spinach","Tomato","Turnip","Zucchini","Yam","Onion"};

        for (String fruit: fruits){
            fruitList.add(fruit);
        }
        for (String vegetable: vegetables){
            vegetableList.add(vegetable);
        }

        list.addAll(fruitList);
        list.addAll(vegetableList);

        for (int i = 0; i < list.size(); i++){
            for (int x = i + 1; x < list.size(); x ++){
                if (list.get(i).equals(list.get(x))){
                    String tempValue = list.get(i);
                    list.set(i, list.get(x));
                    list.set(x, tempValue);
                }
            }
        }
        return list;
    }
    public static ArrayList<String> commonFruitList(){
        ArrayList<String> fruitList1 = new ArrayList<String>();
        ArrayList<String> fruitList2 = new ArrayList<String>();
        String[] fruits1 = {"Apple","Watermelon","Banana","Jackfruit","Tomato","Squash","Pear","Peach","Blueberry"};
        String[] fruits2 = {"Apricot","Lychee","Watermelon","Strawberry","Kumquat","Mango","Papaya","Quince","Durian"};
        
        for (String fruit: fruits1){
            fruitList1.add(fruit);
        }
        for (String fruit: fruits2){
            fruitList2.add(fruit);
        }

        ArrayList<String> list = new ArrayList<String>(fruitList2);
        list.retainAll(fruitList1);

        return list;

        
    }
    public static ArrayList<String> animalRemoveDuplicates(){
        String[] animals = {"Dog","Cat","Horse","Dog","Mouse","Lion","Bear","Eagle","Snake","Cheetah","Tiger"};
        ArrayList<String> animalList = new ArrayList<String>();
        animalList.addAll(Arrays.asList(animals));
        for (int i = 0; i < animalList.size(); i++){
            if (animalList.indexOf(animalList.get(i)) != animalList.lastIndexOf(animalList.get(i))){
                animalList.remove(animalList.get(i));
            }
        }
        return animalList;
    }

    public static ArrayList<Integer> addInteger(){
        Integer[] sortedArray = {1,2,3,4,5,6,7,9,10};
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.addAll(Arrays.asList(sortedArray));
        list.add(8);

        for (int i = 1; i < list.size(); i++) { 
            int tempValue = list.get(i); 
            int x = i - 1; 

            while (x >= 0 && list.get(x) > tempValue) { 
                list.set(x + 1, list.get(x)); 
                x = x - 1; 
            }

            list.set(x + 1, tempValue); 

        } 

        return list;
    }

    public static ArrayList<Integer> reverseInteger(){
        Integer[] integers = {1,2,3,4,5,6,7,9,10};
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.addAll(Arrays.asList(integers));
    
        for (int i = 0; i < list.size()/2; i++) { 
            int tempValue = list.get(i);
            list.set(i, list.get(list.size() - i-1));
            list.set(list.size() - 1-i, tempValue);
        } 

        return list;
    }
}