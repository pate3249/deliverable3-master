/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 
 * @author Nimrat , Vedant
 */
public abstract class Game {

    private final String name;//the title of the game
    private ArrayList<Player> players;// the players of the game

    public Game(String name) {
        this.name = name;
        players = new ArrayList();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return player of the game
     */
    public ArrayList<Player> getPlayers() {
        return players;
    }

    /**
     * @param players  players of the game
     */
    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    /**
     * Play game , this is method
     */
    public abstract void play();

    /**
     * use this method to declare and display a winning player, when game is over
     */
    public abstract void declareWinner();

}//end class
