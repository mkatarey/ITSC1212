import java.util.Scanner;

public class CandleShop {
    public static void main(String[] args) {
        // **********************************
        // Project 3
        // **********************************

        System.out.println("Welcome to Crazy Cool Candles!");
        System.out.println("Please check out our loyalty program, where you can earn one point for every 10 candles you buy!");
        System.out.println("-------------------------------------------------------------------------------------------------");

        // Store Setup
        Candle birthdayCandle = new Candle("Birthday", 1, 5.99, 3);
        Candle teaLight = new Candle("Tea Light", 2, 10.99, 4);
        Candle pillar = new Candle("Pillar", 3, 14.99, 5);

        //Purchase
        Scanner sc = new Scanner(System.in);
        System.out.println("How many Birthday Candles would you like?");
        int numOfBirthdayCandles = sc.nextInt();
        sc.nextLine();
        System.out.println("How many Tea Light Candles would you like?");
        int numOfTeaLights = sc.nextInt();
        sc.nextLine();
        System.out.println("How many Pillar Candles would you like?");
        int numOfPillars = sc.nextInt();
        System.out.println("-------------------------------------------------------------------------------------------------");

        //Calculate total number of candles to determine loyalty points
        int totalNumOfCandles = numOfBirthdayCandles + numOfTeaLights + numOfPillars;
        int loyaltyPointsEarned = totalNumOfCandles / 10;

        //Calculate total price of each candle type
        double priceOfBirthdayCandles = numOfBirthdayCandles * birthdayCandle.getCost();
        double priceOfTeaLights = numOfTeaLights * teaLight.getCost();
        double priceOfPillars = numOfPillars * pillar.getCost();

        //Calculate total price of all candles together
        double totalPriceOfAllCandles = priceOfBirthdayCandles + priceOfTeaLights + priceOfPillars;

        //Calculate discount based on total price of all candles
        double discountedPrice = 0.00;
        if ((totalPriceOfAllCandles >= 20.00) && (totalPriceOfAllCandles < 35.00)) {
            discountedPrice = totalPriceOfAllCandles * 0.95;
        }
        else if ((totalPriceOfAllCandles >= 35.00) && (totalPriceOfAllCandles < 55)) {
            discountedPrice = totalPriceOfAllCandles * 0.93;
        }
        else if ((totalPriceOfAllCandles >= 55.00) && (totalPriceOfAllCandles < 100)) {
            discountedPrice = totalPriceOfAllCandles * 0.90;
        }
        else if (totalPriceOfAllCandles > 100) {
            discountedPrice = totalPriceOfAllCandles * 0.80;
        }
        else {
            discountedPrice = totalPriceOfAllCandles;
        }

        //Calculate burn time
        double burnTimeOfBirthdayCandles = numOfBirthdayCandles * birthdayCandle.getTime();
        double burnTimeOfTeaLights = numOfTeaLights * teaLight.getTime();
        double burnTimeOfPillars = numOfPillars * pillar.getTime();
        double totalBurnTimeinHours = burnTimeOfBirthdayCandles + burnTimeOfTeaLights + burnTimeOfPillars;

        //Calculate cost-per-minute by dividing discounted total price by total burn time
        double costPerMinute = discountedPrice / (totalBurnTimeinHours * 60);

        //Output
        System.out.println("Thank you for your purchase. Your order is as follows: ");
        System.out.print(numOfBirthdayCandles + " Type " + birthdayCandle.getType() + " " + birthdayCandle.getName() + " Candles: ");
        for (int b = 0; b < numOfBirthdayCandles; b++) {
            System.out.print("!");
        }
        System.out.println("");
        System.out.println("$" + priceOfBirthdayCandles);

        System.out.print(numOfTeaLights + " Type " + teaLight.getType() + " " + teaLight.getName() + " Candles: ");
        for (int t = 0; t < numOfTeaLights; t++) {
            System.out.print("@");
        }
        System.out.println("");
        System.out.println("$" + priceOfTeaLights);

        System.out.print(numOfPillars + " Type " + pillar.getType() + " " + pillar.getName() + " Candles: ");
        for (int p = 0; p < numOfPillars; p++) {
            System.out.print("|");
        }
        System.out.println("");
        System.out.println("$" + priceOfPillars);
        System.out.println("-------------------------------------------------------------------------------------------------");

        System.out.println("Total price: $" + totalPriceOfAllCandles);
        System.out.println("Final price after Discount: $" + discountedPrice);
        System.out.println("Total burn time: " + totalBurnTimeinHours + " hours");
        System.out.println("Cost per minute: " + costPerMinute);
        System.out.println("Loyalty Points Earned: " + loyaltyPointsEarned);
    }
}