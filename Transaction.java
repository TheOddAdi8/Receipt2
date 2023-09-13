import java.util.Scanner;

    //main interface
    //creat variables
    //create methods
    //(create a constructor)

public class Transaction {
    public int custID;
    public String item1, item2;
    public double price1, price2;
    public boolean done = false;
    public String tempGreet;
    public Scanner storeBot = new Scanner(System.in);
    
    public boolean nextCustomer() {
        greet();
        while (!done) {
            scanItems();
        }
        checkOut();
        done = true;
        return done;
    }
    public void greet() {
        System.out.println("Welcome to Adi's Convenience Store!");
        
        checkID();
    }
    public void checkID() {
        System.out.println("Do you have a Customer ID?");
        tempGreet = storeBot.nextLine();

        if (tempGreet.toLowerCase().contains("no")) {
            System.out.println("The creator of this program was too lazy to actually make this part so you can just move on and acually buy the things now :)");
        }
        else if (tempGreet.toLowerCase().contains("yes")) {
            System.out.print("Enter your Customer ID: ");
            storeBot.nextInt();
            custID = storeBot.nextInt();
        }
        else {
            System.out.println("I'm sorry, but I cannot understand you. Please try again.");
            checkID();
        }
    }
    public void scanItems() {
        while (!done) {
            System.out.print("Scan the next item: ");
        }
        done = true;
    }
    public void checkOut() {
        System.out.println("Pay me or else :)");
    }




}
