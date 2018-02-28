import java.util.ArrayList;

public class Player {
    private ArrayList<Card> hand;
    private String name;

    public Player(ArrayList<Card> hand, String name) {
        this.hand = hand;
        this.name = name;
    }
}
