import java.util.Scanner;

public class HighLowGame {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Scanner scnr = new Scanner(System.in);
        int x = 1;
        String keepPlaying;
        int wins = 0;
        int losses = 0;
        
        while(x <= 4) {
            Card card1 = deck.drawCard();
            System.out.println("The first card is " + card1.declareCard());
            System.out.println("Will the next card be higher or lower? ");
            System.out.println("Enter 1 for lower, 2 for higher.");

            int choice = scnr.nextInt();

            Card card2 = deck.drawCard();
            System.out.println("The next card is the " + card2.declareCard());

            boolean higher = card2.getValue() > card1.getValue();
            if (card1.getValue() == card2.getValue()) {
                System.out.println("Card values were the same, no winner or loser this round.");
            } else if ((higher && choice == 2) || (!higher && choice == 1)) {
                System.out.println("Winner!");
                wins++;
            } else {
                System.out.println("Sorry, your guess was incorrect :(");
                losses++;
            }

            System.out.println("Wins: " + wins);
            System.out.println("Losses " + losses);
            x++;
            
            if(x == 4) {
                System.out.println("Do you want to keep playing? Say 'Y' if yes or 'N' for no.");
                keepPlaying = scnr.next();
                if(keepPlaying.equals("Y")) {
                    x = 1;
                } else if(keepPlaying.equals("N")) {
                    break;
                }
            }
        }
    scnr.close();
    }
}