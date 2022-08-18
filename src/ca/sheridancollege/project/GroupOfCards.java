/**
 * SYST 17796 Project Base code.
 * Students can customize and expand to implement their game.
 */
package javagroupassignment;

import java.util.ArrayList;
import java.util.Collections;

/**
 * a physical class that may be used to represent any collection of cards in a game.
 * HINT: Consider subclassing this more more once. The maximum size property for 
 * the group of cards is reusably configurable
 * @author Nimrat Kaur, Vedant Patel
 */
public class GroupOfCards {

    public void setCards(ArrayList<CardImplement> cards) {
		this.cards = cards;
	}

	//The group of cards, stored in an ArrayList
    private ArrayList<CardImplement> cards;
    private int size;//size of the assemblage

    public GroupOfCards(int size) {
        this.size = size;
    }

    /**
     * A method that will get the group of cards as an ArrayList
     *
     * @return the group of cards.
     */
    public ArrayList<CardImplement> getCards() {
        return cards;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

	/**
     * @return the size of the group of cards
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the max size for the group of cards
     */
    public void setSize(int size) {
        this.size = size;
    }

}//end class
