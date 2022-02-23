package proj3; // do not erase. Gradescope expects this.

import java.util.ArrayList;

public class PokerHand { //how to set up constructor as instructed

    int DEFAULT_HAND = 5;
    public ArrayList<Card> handContents;


    /**
     * Constructor, initializes the hand
     * @param cardList
     */
    public PokerHand (ArrayList<Card> cardList){
        handContents = (ArrayList<Card>) cardList.clone(); //empty to potentially contain however many cards

    }


    /**
     * adds a card to the hand
     *
     * checks how many cards in hand
     * if 5 card, do nothing
     * if less than 5 cards, add a card
     *
     * @param card, a card object
     * @return
     */
    public void addCard(Card card){
        if (handContents.size() < 5){
            handContents.add(card);
        }
    }

    /**
     *return the card at specified index
     *
     * @param index the index of which card you want returned
     * @return Card at specified index
     */
    public int getIthCard(int index){

    }


    /**
     *
     * @param otherHand, other hand that is being compared
     * @return a negative number if self is worth LESS than otherHand,
     *          zero if they are worth the SAME (a tie), and a positive number if
     *          self is worth MORE than otherHand
     */
    public int compareTo(Card otherHand){

    }

    /**
     * prints the hand as a string
     */
    public String toString(){
        String handPrint = new String();
        for(int i=0; i<= (handContents.size() - 1); i++){
            handPrint += (handContents.get(i)).toString() + "\n";
        }
        return handPrint;
    }

}