import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> deck;

    public Deck(ArrayList<Card> deck) {
        this.deck = deck;
    }

    public int countCards() {
        return this.deck.size();
    }




}
