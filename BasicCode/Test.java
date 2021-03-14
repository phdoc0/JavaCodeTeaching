package week6WARCodingAssignment;

public class App {
	public static void main(String[] args) {

		Player one = new Player("Gus");
		Player two = new Player("Violet");

		Deck deck = new Deck();

		for (int i = 0; 1 < 52; i++) {
			// if i is odd
			// then, if i is even
			if (i % 2 == 0) {
				one.draw(deck);

			} else {
				two.draw(deck);
			} 
		}

		for (int g = 0; g < (one.hand.size() - 1); g++) {
		
			System.out.print("Current Game: " + g + " of " + one.hand.size());
			Card oneCard = one.flip();
			Card twoCard = two.flip();
			
            if (oneCard.getValue() > twoCard.getValue()) {
				one.incrementScore();
			} else if (twoCard.getValue() > oneCard.getValue()) {
				two.incrementScore();

			} else {
				continue;		
            }//if else end
            
	    }//for lopp 

        //Print score if else
        if (one.score > two.score) {
                
            System.out.println("player one wins");
        } else if (two.score > one.score) {
            System.out.println("player two wins");
        } else {
            System.out.println("it's a draw");
        }//closes socre

    }// Close main
}//Close class
