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
        handContents = new ArrayList<Card>(cardList.size()); //empty to potentially contain however many cards



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
    public Card addCard(Card card){
    }

    /**
     *return the card at specified index
     *
     * @param index the index of which card you want returned
     * @return Card at specified index
     */
    public int getIthCard(int index){

    }

    public String toString(){
        String handPrint = new String();
        for(int i=0; i<= (handContents.size() - 1); i++){
            handPrint += (handContents.get(i)).toString() + "\n";
        }
        return handPrint;
    }

}