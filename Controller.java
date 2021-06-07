package cricketHand;



public class Controller {
	public static void main(String[] args) {

		System.out.println("*****WELCOME TO HAND CRICKET*****");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("*****MATCH STARTS*****");
		System.out.println(" ");
		System.out.println(" ");
		Game game = new Game();
		game.Toss();
		int i=0;
		while(i<3) {
		game.roundStarts();
		if(game.P1_wins.size()>1 || game.P2_wins.size()>1) {
			break;
		}
		}
		game.gameDisplay();

	}

}
