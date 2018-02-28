import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {
    Deck deck;

    @Before
    public void before() {
        deck = new Deck();
    }

    @Test
    public void haveFullDeck() {
        assertEquals(52, deck.countCards());
    }

    @Test
    public void hasAllSuits() {
        assertEquals(SuitType.DIAMONDS, deck.getCardAtIndex(20).getSuitType());
        assertEquals(ValueType.EIGHT, deck.getCardAtIndex(20).getValueType());
        assertEquals(SuitType.HEARTS, deck.getCardAtIndex(10).getSuitType());
        assertEquals(ValueType.JACK, deck.getCardAtIndex(10).getValueType());
        assertEquals(SuitType.CLUBS, deck.getCardAtIndex(30).getSuitType());
        assertEquals(ValueType.FIVE, deck.getCardAtIndex(30).getValueType());
        assertEquals(SuitType.SPADES, deck.getCardAtIndex(45).getSuitType());
        assertEquals(ValueType.SEVEN, deck.getCardAtIndex(45).getValueType());
    }


    @Test
    public void canDealCard() {
        Card card = deck.dealCard();
        assertEquals(51,deck.countCards());
    }

}
