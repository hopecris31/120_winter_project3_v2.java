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
    public Card get_ith_card(int index){
        return handContents.get(index);
    }


    private boolean checkFlush(){
        String firstSuit = handContents.get(0).getSuit();

        for(Card card : handContents){
            if(firstSuit != card.getSuit()){
                return false;
            }
        }
        return true;
    }

    /**
     * Determines how this hand compares to another hand, returns
     * positive, negative, or zero depending on the comparison.
     *
     * @param other The hand to compare this hand to
     * @return a negative number if this is worth LESS than other, zero
     * if they are worth the SAME, and a positive number if this is worth
     * MORE than other
     */
    public int compareTo(PokerHand other){

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