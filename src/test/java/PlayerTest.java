import org.junit.Before;

import java.util.ArrayList;

public class PlayerTest {

    @Before
    public void before() {
        ArrayList<Card> cards = new ArrayList<>();
        Hand hand = new Hand(cards);
        Player playerOne = new Player(hand, "J");
    }
}
