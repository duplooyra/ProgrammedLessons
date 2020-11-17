public class LunchAccountTester{
    public static void main(String[] args) {
        LunchAccount test = new LunchAccount();
        test.generateWithBalance(100);
        test.printBalance();
        test.purchase(10); 
        test.printBalance(); // 90.0
        test.addMoney(20);
        test.printBalance(); // 110.0
        test.purchase(150); // Insufficient Funds
        test.printBalance(); // 110.0
        test.printID();
    }
}