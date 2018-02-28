import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HandTest {
    Hand hand;
    Card clubsFive;
    Card diamondsEight;



    @Before
    public void before() {
        ArrayList<Card> cards = new ArrayList<>();
        clubsFive = new Card(SuitType.CLUBS, ValueType.FIVE);
        cards.add(clubsFive);
        diamondsEight = new Card(SuitType.DIAMONDS, ValueType.EIGHT);
        cards.add(diamondsEight);
        hand = new Hand(cards);
    }

    @Test
    public void hasCards() {
        assertEquals(2, hand.countCards());
    }

    @Test
    public void canGetScore() {
        assertEquals(13, hand.getTotalScore());
    }
}
