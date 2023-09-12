import java.util.Scanner;

    //main interface
    //creat variables
    //create methods
    //(create a constructor)

public class Transaction {
    public String custID;
    public String item1, item2;
    public double price1, price2;
    public boolean done = false;
    public boolean fin = false;

    public boolean nextCustomer() {
        greet();
        while (!done) {
            scanItems();
        }
        checkOut();
        return fin;
    }
    public void greet() {
        System.out.println("Welcome to Adi's Convenience Store!");
    }
    public void scanItems() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Scan the next item");
        }
        done = true;
    }
    public void checkOut() {
        System.out.println("Pay me or else :)");
    }




}
