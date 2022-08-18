import java.util.Scanner;

public class Business {
    static String companyName = "Manav's Food Cart";
    static String name = "Manav";
    static String[] menuItems = {"Cheeseburger", "Veggie Burger", "Small Milkshake", "Large Milkshake", "Potato Chips", "Cookie"};
    static int numberOfItems = 6;
    public static void main(String[] args) throws InterruptedException {
        String decorativeLine = "****************************************";
        //First thing
        System.out.println(decorativeLine);

        //Part A
        System.out.println("Welcome to " + companyName + "!");
        Thread.sleep(1000);
        System.out.println("I am " + name + ". What is your name?");
        Thread.sleep(1000);
        Scanner scnr = new Scanner(System.in);
        String userName = scnr.nextLine();
        Thread.sleep(1000);
        System.out.println("Nice to meet you, " + userName + "!");

        //Part B
        Thread.sleep(1000);
        System.out.println("\nTake a look at our menu, " + userName + ".");
        Thread.sleep(1000);
        int counter = 1;
        for (String i : menuItems){
            System.out.println(counter + ". " + i);
            counter++;
        }

        //Part C
        System.out.println("\nHow many items would you like to purchase?");
        int numOfCustomerOrderItems = scnr.nextInt();
        String[] order = new String[numOfCustomerOrderItems];
        int customerOrderItemNumber;
        for (int i = 0; i < numOfCustomerOrderItems; i++){
            System.out.println("Please enter the number of your item.");
            customerOrderItemNumber = scnr.nextInt();
            while(customerOrderItemNumber < 1 || customerOrderItemNumber > 6) {
                System.out.println("Please enter a valid item number.");
                customerOrderItemNumber = scnr.nextInt();
            }
            order[i] = menuItems[(customerOrderItemNumber - 1)];
        }
        System.out.println("\nThank you for your order, " + userName + "!");
        System.out.println("You have ordered: ");
        int itemCounter = 0;
        for (String i : order){
            System.out.print(i);
            itemCounter++;
            if (!(itemCounter == (order.length))) {
                System.out.print(", ");
            }
        }
        System.out.println("\n\nThank you again, " + userName + "! Your order will be right up! Have a great day!");

        scnr.close();
        //Last thing
        System.out.println(decorativeLine);
    }
}