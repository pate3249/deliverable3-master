package javagroupassignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class GameRun {
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);
    static ArrayList <CardImplement> playerOneDeck = new ArrayList<CardImplement>();
    static ArrayList <CardImplement> playerTwoDeck = new ArrayList<CardImplement>();


    public static void main(String[] args) {
        System.out.println("Hey waddup let's play a game of war!\nPlayer One type your name, please: ");
        String namePlayerOne = scanner.nextLine();
        playerOneDeck = CardImplement.createStackOne();
        for (int i = 0; i < playerOneDeck.size(); i++) {
            Collections.swap(playerOneDeck,randomizer(),i);
        }


        System.out.println("Player Two type your name, please:");
        String namePlayerTwo = scanner.nextLine();
        playerTwoDeck = CardImplement.createStackTwo();
        for (int i = 0; i < playerTwoDeck.size(); i++) {
            Collections.swap(playerTwoDeck,randomizer(),i);
        }
        System.out.println("The game begins!");
        CardImplement playerOneTopCard = playerOneDeck.get(0);
        CardImplement playerTwoTopCard = playerTwoDeck.get(0);

        System.out.println("Play One's top card is: " + playerOneTopCard);
        System.out.println("VS");
        System.out.println("Play Two's top card is: " + playerTwoTopCard);
        int comparable = playerOneTopCard.compareTo(playerTwoTopCard);

        System.out.println("The winner is: " + determineWinner(playerOneTopCard,playerTwoTopCard,comparable));
    }
    static int randomizer(){
        return random.nextInt(56);
    }
    static String determineWinner(CardImplement playOneTopCard, CardImplement playerTwoTopCard, int comparable){
        if (comparable == -1){
            return "Player One!";
        } if (comparable == 1) {
            return "Player Two!";
        } else {
            return "It's a draw";
        }
    }
}