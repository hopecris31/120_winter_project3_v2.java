package proj3; // do not erase. Gradescope expects this.

/**
 * represents a single card
 */

public class Card {

    private int cardRank;
    private String cardSuit;


    /**
     * constructor, initializes the card
     */
    public Card(int rank, String suit){
        cardRank = rank;
        cardSuit = suit;
    }


    public getRank(){
        return cardRank;
    }

    public getSuit(){
        return cardSuit;
    }

    /**
     * take numeric rank and turn it into
     * a printable string where 11-14 are
     * turned into Face card values
     */
    private String toString(int rank){
        if (rank == 11){
            return "Jack";
        }
        else if (rank == 12) {
            return "Queen";
        }
        else if (rank == 13) {
            return "King";
        }
        else if (rank == 14) {
            return "Ace";
        }
        else {  //whole card -- just change type
            return "" + rank; //make int a string
        }
    }
}
