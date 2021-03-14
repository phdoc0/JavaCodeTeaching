package BasicCode.Week6;
import java.util.ArrayList;
public class Player {

    // fields
    ArrayList<Card> hand = new ArrayList<Card>();
    int score;
    String name;

    // method incrementScore adds 1 to the Player's scores field
    public Player(String name) {
        this.score = 0;
        this.name = name;
    }

    public void describe() {
        System.out.println("player " + this.name + "Score of " + this.score);
        for (Card c : hand) {
            c.describe();
        }
    }

    public Card flip() {
        Card myCard = this.hand.get(0);
        this.hand.remove(0);
        return myCard;
    }

    public void draw(Deck deck) {
        this.hand.add(deck.draw());
    }

    public void incrementScore() {
        this.score++;
    }
}

