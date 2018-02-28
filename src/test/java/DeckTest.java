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
        deck = new Deck(cards);
        card = new Card(SuitType.DIAMONDS, ValueType.EIGHT);
    }

    @Test
    public void hasNoCards() {
        assertEquals(0, deck.countCards());
    }

    @Test
    public void haveFullDeck() {
        assertEquals(52, deck.countCards());
    }

    //    @Test
//    public void canAddCard() {
//        deck.addCard(card);
//        assertEquals(1, deck.countCards());
//    }

}
