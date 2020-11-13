public class LunchAccount{
    private double balance = 100;
    private int purchases;
    private static final int FIRST_100_BONUS = 20;
    private int id = 0;

    public void purchase(double price){
        if ((balance - price) >= 0){
            balance = balance - price;
        }
    }
}