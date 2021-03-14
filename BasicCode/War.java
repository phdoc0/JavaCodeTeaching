package BasicCode;
import java.lang.reflect.Array;
import java.util.*;


//Classes
class Card{
    //Variables
    public int value;
    public String name; 

    //constructor
    public Card(int value, String name)
    {
        setValue(value);
        setName(name);
    }

    //method
    public void setValue(int x){this.value = x;}
    public void setName(String name){this.name = name;}
    public int getValue(){return this.value;}
    public String getName(){return this.name;}


    public void describe()
    {
        System.out.println("Your card is the " + this.value + "of " + this.name);
    }
}
class Deck{
    //Variables
    private List<Card> myDeck = new ArrayList<Card>();


    //Constructor
    public Deck()
    {
        this.myDeck = createDeck();
    }

    public Card draw()
    {
        return this.cards.get(0);
    }
    public void shuffle()
    {
        Collections.shuffle(this.cards);
    }

    //Method
    public ArrayList createDeck()
    {
        Arrry newCarcdset [52]

        suitList [Diamonds, Hearts, clubs, Spades] 
        
        [2, Daimond] 

        index = 0;
        for each suit
            for i = 2 i =14; i++
            {
                Card newCard = new Card(i, suit)
                newCarcdset[index];
                index++; 
                

            }

            }
        return newCarcdset; 

} //Full deck

System.out.print("Current Game: " + g + " of " + hand.size())
class Player{
    //variable
    Array hand = new Array[26];
    int score;
    String name; 
    
    public Player(String name)
    {
        this.score = 0;
        this.name = name; 

    }

    public void describe()
    {
        System.out.println("Player " + this.name + " Score of " + this.score);
        for each card in hand:
            card.describe();
    }

    public Card flip(){
        card = this.hand[0]
        remove hand[0] 
        return card

    public void draw(Deck d){
        hand.add(d.draw());

    }

    public void incrementScore(){
        this.score++; 
    }
    
}


public class War { //This class should be call app
    public static void main(String[] args) {

        Player one = new Player("Gus");
        Player two = new Player("Violet"); 

        Deck deck = new Deck();

        for(int i= 0; i <52; i++)
        {
            if i is odd{ player one.draw[deck]}
            else i is even player two.draw(deck);

        }

        for(int g = 0; g <26; g++)
        {
            oneCard = one.flip()
            twoCard = two.flip()
            if oneCard > twoCard one.incrementScore();
            else two.incrementScore();
        }

        if one.score > two.score print one wins
        else if two.score > one.score print two wins
        else print draw



 
        
    }

    if(oneCard.getValue() > twoCard.getValue())
    {

    }else if(oneCard.getValue() < twoCard.getValue())
    {

    }else{continue;}



    for (int g = 0; g < (one.hand.size() - 1); g++) {
        Card oneCard = one.flip();
        Card twoCard = two.flip();
        if (oneCard.getValue() > twoCard.getValue()) {
            one.incrementScore();
        } else if (twoCard.getValue() > oneCard.getValue()) {
            two.incrementScore();
        } else {
            continue;

        }
    

    }//in for loop

    
}
