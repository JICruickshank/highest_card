import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DeckTest {
    Deck deck;
    Card card;

    @Before
    public void before() {
        ArrayList<Card> cards = new ArrayList<>();
        card = new Card(SuitType.HEARTS, ValueType.JACK);
        cards.add(card);
        Deck deck = new Deck(cards);
    }

    @Test
    public void hasNoCards() {
        assertEquals(0, deck.countCards());
    }
}
