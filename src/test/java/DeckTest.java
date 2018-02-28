import org.junit.Before;
import org.junit.Test;
import sun.awt.SunHints;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DeckTest {
    Deck deck;
    Card diamondsEight;
    Card heartsJack;
    Card spadesSeven;
    Card clubsFive;

    @Before
    public void before() {
        ArrayList<Card> cards = new ArrayList<>();
        deck = new Deck(cards);
        diamondsEight = new Card(SuitType.DIAMONDS, ValueType.EIGHT);
        heartsJack = new Card(SuitType.HEARTS, ValueType.JACK);
        spadesSeven = new Card(SuitType.SPADES, ValueType.SEVEN);
        clubsFive = new Card(SuitType.CLUBS, ValueType.FIVE);
    }

    @Test
    public void hasNoCards() {
        assertEquals(0, deck.countCards());
    }

    @Test
    public void haveFullDeck() {
        deck.populateDeck();
        assertEquals(52, deck.countCards());
    }

    @Test
    public void hasAllSuits() {
        deck.populateDeck();
        assertEquals(SuitType.DIAMONDS, deck.getCardAtIndex(20).getSuitType());
        assertEquals(ValueType.EIGHT, deck.getCardAtIndex(20).getValueType());
        assertEquals(SuitType.HEARTS, deck.getCardAtIndex(10).getSuitType());
        assertEquals(ValueType.JACK, deck.getCardAtIndex(10).getValueType());
        assertEquals(SuitType.CLUBS, deck.getCardAtIndex(30).getSuitType());
        assertEquals(ValueType.FIVE, deck.getCardAtIndex(30).getValueType());
        assertEquals(SuitType.SPADES, deck.getCardAtIndex(45).getSuitType());
        assertEquals(ValueType.SEVEN, deck.getCardAtIndex(45).getValueType());
    }

}
