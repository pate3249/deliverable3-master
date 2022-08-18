package ca.sheridancollege.project;

public class Main {

	public static void main(String[] args) {
		GameImplement gameImplement = new GameImplement("War of Cards");
		PlayerImplement player1 = new PlayerImplement("Player1");
		PlayerImplement player2 = new PlayerImplement("Player2");
		gameImplement.setPlayers(player1,player2);
		CardImplement[][] hands = new CardImplement[2][1];
		CardDeck myDeck = new CardDeck();
		
		for (int i = 0; i < 26; i++) {
			System.out.printf("\n Round %s of The War \n", i);

			
			for (int player = 0; player < hands.length; player++)
				hands[player][0] = myDeck.dealCard();

			
			
			player1.setPlayerCardVal(hands[0][0].getValue());
			player2.setPlayerCardVal(hands[1][0].getValue());
			
			gameImplement.play();
			gameImplement.declareWinner();
		}

	}

}
