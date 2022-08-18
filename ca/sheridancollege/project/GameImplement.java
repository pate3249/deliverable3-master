package ca.sheridancollege.project;

public class GameImplement extends Game{

	private PlayerImplement player1;
	private PlayerImplement player2;
	private String winner;
	public GameImplement(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		if (player1.getPlayerCardVal() > player2.getPlayerCardVal()) {
			 System.out.println("Player One Wins The War");
			 winner= player1.getName();
		}
           
        else if (player2.getPlayerCardVal() > player1.getPlayerCardVal()) {
        	 System.out.println("Player Two Wins The War");
        	 winner= player2.getName();
        }
           
        else
            System.out.println("The War Is A Tie");
		
	}

	public void setPlayers(PlayerImplement player1,PlayerImplement player2) {
		// TODO Auto-generated method stub
		this.player1 = new PlayerImplement(player1.getName());
		this.player2 = new PlayerImplement(player2.getName());
		
	}
	
	@Override
	public void declareWinner() {
		// TODO Auto-generated method stub
		System.out.println(winner  + " is winner of this round");
	}

}
