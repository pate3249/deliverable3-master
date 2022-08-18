package javagroupassignment;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
             System.out.println("Player 1 please pick the card");
                Scanner in = new Scanner(System.in);
                int pickPlayerOneCard = in.nextInt();
               System.out.println("Player 2 please pick the card");
             
                int pickPlayerTwoCard = in.nextInt();
                
		GameImplement gameImplement = new GameImplement("War game",pickPlayerOneCard,pickPlayerTwoCard,4);
		PlayerImplement player1 = new PlayerImplement("A1");
		PlayerImplement player2 = new PlayerImplement("B1");
		System.out.println(gameImplement.getName()+"begins now");
		gameImplement.setPlayers(player1,player2);
		gameImplement.play();
	}

}
