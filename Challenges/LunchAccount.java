import java.util.Random;
public class LunchAccount{
    Random randomGenerator = new Random();
    private double balance;
    private int purchases;
    private static final int FIRST_100_BONUS = 20;
    private int id = randomGenerator.nextInt(999999-100000) + 100000;
    private int first_100_count =+ 1;

    public void generateEmpty(){
        balance = 0;
    }

    public void generateWithBalance(double balance){
        if (first_100_count <= 100){
            this.balance = balance + FIRST_100_BONUS;
        }
        else{
            this.balance = balance;
        }
    }
    

    public void purchase(double price){
        if ((balance - price) >= 0){
            balance = balance - price;
        }
        else{
            System.out.println("Insufficient Funds");
        }
    }

    public void printBalance(){
        System.out.println("$" + balance);
    }

    public void addMoney(double money){
        if (balance == 0 && first_100_count <= 100){
            balance = balance + money + FIRST_100_BONUS;
            first_100_count =+ 1;
        }
        else{
            balance = balance + money;
        }
    }

    public void printID(){
        System.out.println(id);
    }
}