package cricketHand;

import java.util.*;


public class Game {
	

	public static void main(String[] args) {

		Player P1 = new Player("A");
		Player P2 = new Player("B");
		
		System.out.println("*****WELCOME TO HAND CRICKET*****");
		System.out.println(" ");
		
		System.out.println("*****MATCH STARTS*****");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		
		ArrayList<Integer>P1_wins = new ArrayList<>();
		ArrayList<Integer>P2_wins = new ArrayList<>();
		
		String toss;
		
		//Toss
		
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
		
		
		int i=0;
		
		while(i<3) {

		Round round = new Round(P1,P2);
		
	
		round.Match(toss);

		if(toss=="Heads") {
			toss = "Tails";
		}
		else if(toss=="Tails") {		
			toss="Heads";
		}
		
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		
		
		
		if(round.RoundWinner()==P1) {
			P1_wins.add(0);
		}
		else if(round.RoundWinner()==P2) {
			P2_wins.add(0);
		}
		
		
		if(P1_wins.size()>1 || P2_wins.size()>1) {
			break;
		}
		
		i++;
		

		}
		
		System.out.println();
		
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
