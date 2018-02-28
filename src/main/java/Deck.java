import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> deck;

    public Deck(ArrayList<Card> deck) {
        this.deck = deck;
    }

    public int countCards() {
        return this.deck.size();
    }

    public void populateDeck() {
        for (SuitType suit : SuitType.values()) {
            for (ValueType value : ValueType.values()) {
                Card card = new Card(suit, value);
                this.deck.add(card);
            }

        }
    }

    public Card getCardAtIndex(int index) {
        return this.deck.get(index);
    }
}