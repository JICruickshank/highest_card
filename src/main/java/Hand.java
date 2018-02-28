import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> hand;
    private int totalScore;

    public Hand(ArrayList<Card> hand) {

        this.hand = hand;
        this.totalScore = 0;
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
}
