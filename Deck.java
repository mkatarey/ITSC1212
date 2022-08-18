public class Deck {
    public Card drawCard() {
        int value = (int)((Math.random() * 13) + 1);
        int integerSuit = (int)((Math.random() * 4) + 1);
        String suit;
        if (integerSuit == 1) {
            suit = "Spades";
        } else if (integerSuit == 2) {
            suit = "Clubs";
        } else if (integerSuit == 3) {
            suit = "Hearts";
        } else {
            suit = "Diamonds";
        }
        return new Card(value, suit);
    }
}