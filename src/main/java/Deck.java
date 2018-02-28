import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> deck;

    public Deck(ArrayList<Card> deck) {
        this.deck = deck;
    }

    public int countCards() {
        return this.deck.size();
    }

//    public void addCard(card) {
//        this.deck.add(card);
//    }

    public void populateDeck() {
        for (SuitType suit : SuitType.values()) {
            for (ValueType value : ValueType.values()) {
                Card card = new Card(SuitType suit, ValueType value);
                this.deck.add(card);
            }

        }
    }
}