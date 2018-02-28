import java.util.ArrayList;

public class Player {
    private Hand hand;
    private String name;

    public Player(Hand hand, String name) {
        this.hand = hand;
        this.name = name;
    }

    public Hand getHand() {
        return hand;
    }

    public String getName() {
        return name;
    }

    public void receiveCard(Deck deck) {
        Card card = deck.dealCard();
        this.hand.addCard(card);
    }
}
