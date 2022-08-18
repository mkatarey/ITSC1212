import java.util.Scanner;

public class Blackjack {
    public static void main (String [] args) throws InterruptedException {
        Deck deck = new Deck();
        Scanner scnr = new Scanner(System.in);
        int x = 1;
        String keepPlaying;
        int wins = 0;
        int losses = 0;
        while (x <= 4) {
            int houseTotal = deck.drawCard().getValue(true) + deck.drawCard().getValue(true);
            int playerTotal = deck.drawCard().getValue(true) + deck.drawCard().getValue(true);
    
            System.out.println("\nThe House is showing: " + houseTotal);
            
            while(playerTotal < 22) {
                Thread.sleep(500);
                System.out.println("Player's total is: " + playerTotal);
                System.out.println("Would you like to hit or stand? \n\tEnter 1 for hit or 0 or stand.");
                int choice = scnr.nextInt();
                if (choice == 0) {
                    break;
                } else if (choice == 1) {
                    Card nextCard = deck.drawCard();
    
                    System.out.println("\nThe player has been dealt the " + nextCard.declareCard());
                    playerTotal += nextCard.getValue(true);
                } else {
                    System.out.println("Invalid option, try again.");
                }
            }
    
            if (playerTotal > 21) {
                System.out.println("The player has busted! You lose! :(");
            } else {
                //
                System.out.println("\nThe player stands with " + playerTotal);
                //
                System.out.println("The House will play next.\n");
                //
                while (houseTotal < 22) {
                    Thread.sleep(500);
                    if (houseTotal < 17) {
                        System.out.println("The house has " + houseTotal);
                        
                        System.out.println("The house takes another card.");
                        Card nextCard = deck.drawCard();
    
                        System.out.println("The House is dealt " + nextCard.declareCard());
                        houseTotal += nextCard.getValue(true);
                    } else if ((houseTotal >= 17) && (houseTotal <= 21)){
                        System.out.println("The House stands with " + houseTotal);
                        break;
                    }
                }
                System.out.println("\nGame Results!");
                Thread.sleep(500);
                if(houseTotal > 21) {
                    System.out.println("The House has busted! The player wins! :)");
                    wins++;
                } else if (houseTotal > playerTotal){
                    System.out.println("The House wins! Sorry :(");
                    losses++;
                } else if (playerTotal > houseTotal){
                    System.out.println("The player wins! :)");
                    wins++;
                } else {
                    System.out.println("The House and the player have tied.");
                }
                x++;

                if(x == 4) {
                    System.out.println("Do you want to keep playing? Say 'Y' if yes or 'N' for no.");
                    keepPlaying = scnr.next();
                    if(keepPlaying.equalsIgnoreCase("Y")) {
                        x = 1;
                    } else if(keepPlaying.equalsIgnoreCase("N")) {
                        break;
                    }
                }
                System.out.println("Wins: " + wins);
                System.out.println("Losses " + losses);
            }
        }
    }
}