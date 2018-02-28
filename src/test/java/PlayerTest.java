import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PlayerTest {
    Deck deck;
    Hand hand;
    Player player;

    @Before
    public void before() {
        deck = new Deck();
        hand = new Hand();
        player = new Player(hand, "J");
    }

    @Test
    public void playerHasName() {
        assertEquals("J", player.getName());
    }

    @Test
    public void playerCanReceiveCard() {
        player.receiveCard(deck);
        assertEquals(1, player.getHand().countCards());
    }

}
