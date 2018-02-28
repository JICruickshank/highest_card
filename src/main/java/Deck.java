import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> deck;

    public Deck() {
        this.deck = new ArrayList<>();
        populateDeck();
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

    public Card dealCard() {
        Collections.shuffle(deck);
        return deck.remove(0);

    }

}