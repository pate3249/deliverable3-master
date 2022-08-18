package ca.sheridancollege.project;

public class PlayerImplement extends Player {

	private int playerCardVal;
	public PlayerImplement(String name) {
		super(name);

	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
     CardDeck cardDeck  = new CardDeck();
     cardDeck.shuffle();
		
	}

	public int getPlayerCardVal() {
		return playerCardVal;
	}

	public void setPlayerCardVal(int playerCardVal) {
		this.playerCardVal = playerCardVal;
	}
	
	

}
