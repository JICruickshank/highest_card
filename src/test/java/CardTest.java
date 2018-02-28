import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {
    Card card;

    @Before
    public void before() {
        card = new Card(SuitType.HEARTS, ValueType.JACK);
    }

    @Test

    public void cardHasSuitType() {
        assertEquals(SuitType.HEARTS, card.getSuitType());
    }

    @Test

    public void cardHasScore() {
        assertEquals(10, card.getScore());
    }
}
