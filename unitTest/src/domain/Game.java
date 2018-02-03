package domain;

public class Game {
	Player player1;
	Player player2;
	public Player playerWhoPlay;
	public Player playerWhoRest;
	Game(Player player1, Player player2){
		this.player1 = player1;
		this.player2 = player2;
		playerWhoPlay = this.player1;
		playerWhoRest = this.player2;
	}
	public void playGame() {
		while(player1.getPointsOfPlayer() != 0 && player2.getPointsOfPlayer() != 0) {
			changePlayer();
			playerWhoPlay.playerTurn();
		}
		System.out.println(playerWhoPlay.getName() + " won");
	}
	public void changePlayer() {
		Player tempPlayer = playerWhoPlay;
		playerWhoPlay = playerWhoRest;
		playerWhoRest = tempPlayer;
	}
}
