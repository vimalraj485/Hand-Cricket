package cricketHand;

import java.lang.Math;
import java.util.ArrayList; 

public class Round {
	Player P1 ;
	Player P2 ;
	
	static int roundNo = 0;
	ArrayList<Integer>P1_wins = new ArrayList<>();
	ArrayList<Integer>P2_wins = new ArrayList<>();

	public Round(Player P1, Player P2) {
		this.P1 = P1;
		this.P2 = P2;
	}
	
	
	
	static int roundno() {
		roundNo++;
		return roundNo;
	}
	

	
	int execute = 0;
	int target = 91;

	public void Batting(Player batting, Player bowling) {
		batting.score=0;
		
		while(execute<15) {
			int Bat = (int)(Math.random()*7);
			int Bowl = (int)(Math.random()*7);
			// A bat firsts
			
			if(Bat != Bowl) {
				batting.score = batting.score + Bat;
				System.out.println(batting.Name + " shows "+Bat+" and "+bowling.Name+" shows " +Bowl+", "+ batting.Name +" scores "+batting.score);
				
				execute++;
			}
			else {
				System.out.println(batting.Name +" shows "+Bat+" and "+bowling.Name +" shows " +Bowl+", "+batting.Name+"  got out  scoring "+batting.score+" runs");
				target = batting.score;
				break;
			}
			if(batting.score>target) {
				break;
			}

			}
		
		execute = 0;
	}
	int round = roundno();
	
	public void Match(String toss) {

		System.out.println("-------------Round:"+round+"-------------");
		
		// If A wins the Toss 
		
		if(toss=="Heads") {
			
			Batting(P1,P2);
			
			System.out.println(" ");
			System.out.println("*****Innings Break*****");
			System.out.println(" ");
			
			Batting(P2,P1);
		
		}

		//If B wins the Toss
		
		if(toss=="Tails") {
			
			
			Batting(P2,P1);
			
			System.out.println(" ");
			System.out.println("*****Innings Break*****");
			System.out.println(" ");
			
			Batting(P1,P2);
	
				
		}
		

	}
	
	public int RoundWinner() {
		if(P1.score>P2.score) {
			return 1;
		}
		else if(P1.score<P2.score) {
			return 2;
		}
		System.out.println("Round Draws!");
		
		return 0;
	}
	
	
}
