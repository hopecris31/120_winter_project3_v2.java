package proj3; // do not erase. Gradescope expects this.

import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;

public class Deck {

    private ArrayList contents;
    public final int DEFAULT_DECK_SIZE = 52;
    public final int[] RANKS = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
    public final String[] SUITS = {"Spades", "Hearts", "Diamonds", "Clubs"};
    public int nextToDeal;
    public Card dealtCard;



    /**
     * Constructor, initializes the deck
     */
    public Deck(){
        contents = new ArrayList(DEFAULT_DECK_SIZE); //makes empty list of n elements
        nextToDeal = 0;
        Card card;
        for (int rank : RANKS){
            for (String suit : SUITS){
                card = new proj3.Card(rank, suit);
                contents.add(card);

            }
        }
    }

    /**
     * for each index in the deck
     *swap with another random index
     *
     * range of for loop
     * starting pos is nexttodeal
     * final is length of array -1
     */
    public void shuffle(){ //random number within undealt range, collections.swap(deck, i(nexttodeal), end+nexttodeal)
        for(int i=nextToDeal; i <= contents.size()-1; i++) {
            int randomIndex = ThreadLocalRandom.current().nextInt((contents.size() - nextToDeal));
            randomIndex += nextToDeal;
            Collections.swap(contents, i,  randomIndex);
        }

    }

    public boolean isEmpty(){
        if (nextToDeal == contents.size()-1){
            return true;}
        else{
            return false;}
        }

    public int size(){
        return contents.size() - nextToDeal;

    }

    public int gather(){
        return nextToDeal = 0;
    }

    public String toString(){
        String deckPrint = new String();
        for(int i=nextTodeal, i<= (contents.seze() - 1); i ++1){
            deckPrint += (contents.get(i)).toString() + "\n";
        }
        return deckPrint;
    }

    /**
     * deal a single card from deck
     * if nextToDeal is equal to length of array -1, return null
     * else, get the nextToDeal element in deck and return it
     * add one to nextToDeal
     * nextToDeal has to be in the range of the deck size
     *
     * start at next to deal index, pick random number fron mext to deal to the end of the deck
     *
     */
    public Card deal() {
        if (isEmpty == true){
            return null;}
        else{
            dealtCard = contents.get(nextToDeal);
            nextToDeal += 1;
            return dealtCard;
            }

        }

    }

/**keep track of cards dealt
 * gather method, set nextTo equal to 0
 */
