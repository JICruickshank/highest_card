import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> hand;

    public Hand() {

        this.hand = new ArrayList<>();
    }

    public int countCards() {
        return this.hand.size();
    }

    public int getTotalScore() {
        int total = 0;
        int loops = this.countCards();
        ArrayList<Card> cards = this.hand;
        for (int i = 0; i < loops; i++) {
            int score = cards.get(i).getScore();
            total += score;
        }
        return total;
    }

    public void addCard(Card card) {
        this.hand.add(card);
    }


}
