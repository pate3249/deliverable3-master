package javagroupassignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class GameImplement extends Game {
	int comparable = 0;
        private int playerOnePick=0;
        private int playerTwoPick=0;
	PlayerImplement player1;
	PlayerImplement player2;
        int numOfCards=0;
	GroupOfCards groupOfCards = new GroupOfCards(52);
	static Random random = new Random();
	static Scanner scanner = new Scanner(System.in);
	static ArrayList<CardImplement> playerOneDeck = new ArrayList<CardImplement>();
	static ArrayList<CardImplement> playerTwoDeck = new ArrayList<CardImplement>();
        static ArrayList<CardImplement> playerOneDeckTemp = new ArrayList<CardImplement>();
	static ArrayList<CardImplement> playerTwoDeckTemp = new ArrayList<CardImplement>();
        
	public GameImplement(String name,int playerOnePick,int playerTwoPick,int numOfCards) {
		super(name);
                playerOnePick= playerOnePick;
                playerTwoPick=playerTwoPick;
                numOfCards=numOfCards;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
                Scanner in = new Scanner(System.in);
		playerOneDeck = CardImplement.createStackOne();
		for (int i = 0; i < numOfCards; i++) {
			groupOfCards.setCards(playerOneDeck);
			groupOfCards.shuffle();
			playerOneDeck = groupOfCards.getCards();
		}

		playerTwoDeck = CardImplement.createStackTwo();
		for (int i = 0; i < numOfCards; i++) {
			groupOfCards.setCards(playerTwoDeck);
			groupOfCards.shuffle();
			playerTwoDeck = groupOfCards.getCards();
		}

                System.out.println(playerOneDeck);
               
                int playerPick = playerOnePick;
		CardImplement playerOneTopCard = playerOneDeck.get(playerPick);
                System.out.println("Player 2 please pick the card");
                playerPick = playerTwoPick;
		CardImplement playerTwoTopCard = playerTwoDeck.get(playerPick);
		System.out.println(player1.getName() + " top card is: " + playerOneTopCard);
		System.out.println("VS");
		System.out.println(player2.getName() + " top card is: " + playerTwoTopCard);
		comparable = playerOneTopCard.compareTo(playerTwoTopCard);
		declareWinner();
	}


	public  int declareWinner() {
		// TODO Auto-generated method stub
		if (comparable == -1) {
			System.out.println("The winner is: " + player1.getName());
		}
		if (comparable == 1) {
			System.out.println("The winner is: " + player2.getName());
		} else {
			//System.out.println("Game is Tie between" + player1.getName() + " AND " + player2.getName());
		}
                return comparable;

	}

	public void setPlayers(PlayerImplement player1, PlayerImplement player2) {
		this.player1 = player1;
		this.player2 = player2;

	}

}
