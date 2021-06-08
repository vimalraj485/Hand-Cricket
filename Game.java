package cricketHand;

import java.util.*;

public class Game {

	String toss;
	
	ArrayList<Round>rounds = new ArrayList<>(3);	
	Player P1 = new Player("A");
	Player P2 = new Player("B");
	
	ArrayList<Integer>P1_wins = new ArrayList<>();
	ArrayList<Integer>P2_wins = new ArrayList<>();
	

	
	public void Toss() {
		
		int b = (int)(Math.random()*2);
		if(b==1) {
			 System.out.println("TOSSS WIN BY:-"+P1.Name);
			 System.out.println(P1.Name+" decides to bat first");
			 toss = "Heads";
		}
		else{
			System.out.println("TOSSS WIN BY:-"+P2.Name);
			System.out.println(P2.Name+" decides to bat first");
			 toss = "Tails";
		}
	}

	public void roundStarts() {

		
		Round round = new Round(P1,P2);

		round.Match(toss);

		round.RoundWinner();
		
		

		if(toss=="Heads") {
			toss = "Tails";
		}
		else if(toss=="Tails") {		
			toss="Heads";
		}
		
		
		if(round.RoundWinner()==1) {
			
			System.out.println(" ");
			
			System.out.println(P1.Name+ " wins");
			
			System.out.println(" ");
			
			System.out.println(P1.Name+" is the winner of Round "+round.roundNo);
			P1_wins.add(0);
		
		}
		else if(round.RoundWinner()==2) {
			System.out.println(" ");
			
			System.out.println(P2.Name+" wins");
			
			System.out.println(" ");
			
			System.out.println(P2.Name+" is the winner of Round "+round.roundNo);
			P2_wins.add(0);
		}
		else{
			System.out.println("Round Draws");
		}		
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		
		rounds.add(round);
		

	}
	
		public void gameDisplay() {
		
		Player P1 = new Player("A");
		Player P2 = new Player("B");
			
		if(P1_wins.size()>P2_wins.size()) {
			System.out.println("*****"+P1.Name +" wins the game*****");
		}
		else if(P1_wins.size()<P2_wins.size()) {
			System.out.println("*****"+P2.Name +" wins the game*****");
		}
		else if(P1_wins.size()==P2_wins.size()){
			System.out.println("*****Game Draws!*****");
		}

		}
	
	
}
