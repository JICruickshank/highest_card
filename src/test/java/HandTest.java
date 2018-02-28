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
        hand = new Hand();
        ArrayList<Card> cards = new ArrayList<>();
        clubsFive = new Card(SuitType.CLUBS, ValueType.FIVE);
        diamondsEight = new Card(SuitType.DIAMONDS, ValueType.EIGHT);
    }

    @Test
    public void canAddCardToHand() {
        hand.addCard(clubsFive);
        hand.addCard(diamondsEight);
        assertEquals(2, hand.countCards());
    }

    @Test
    public void canGetScore() {
        hand.addCard(clubsFive);
        hand.addCard(diamondsEight);
        assertEquals(13, hand.getTotalScore());
    }

}
