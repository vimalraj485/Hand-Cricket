package cricketHand;

import java.lang.Math; 

public class Round {
	Player P1 ;
	Player P2 ;
	
	static int roundNo = 0;
	

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
	
	public void P1_Bats() {
		P1.score=0;
		
		while(execute<15) {
			int Bat = (int)(Math.random()*7);
			int Bowl = (int)(Math.random()*7);
			// A bat firsts
			
			if(Bat != Bowl) {
				P1.score = P1.score + Bat;
				System.out.println(P1.Name + " shows "+Bat+" and "+P2.Name+" shows " +Bowl+", "+ P1.Name +" scores "+P1.score);
				
				execute++;
			}
			else {
				System.out.println(P1.Name +" shows "+Bat+" and "+P2.Name +" shows " +Bowl+", "+P1.Name+"  got out  scoring "+P1.score+" runs");
				target = P1.score;
				break;
			}
			if(P1.score>target) {
				break;
			}
			
			
			}
		
		execute = 0;
	}
	
	public void P2_Bats() {
	
		P2.score=0;
		while(execute<15) {
			int Bat = (int)(Math.random()*7);
			int Bowl = (int)(Math.random()*7);
			// B bats
			
			if(Bat != Bowl) {
				P2.score=P2.score+ Bat;
				System.out.println(P2.Name+" shows "+Bat+" and " + P1.Name +" shows " +Bowl+", "+P2.Name+ " scores "+ P2.score);
				
				execute++;
			}
			else {
				System.out.println(P2.Name+" shows "+Bat+" and " + P1.Name +" shows " +Bowl+", "+P2.Name+"  got out scoring "+P2.score+" runs");
				target = P2.score;
				break;
			}
			
			
			if(P2.score>target) {
				break;
			}
	
			}
		execute = 0;
	}
	
	
	
	public void Match(String toss) {
		
		
		int round = roundno();
		System.out.println("-------------Round:"+round+"-------------");
		
		// If A wins the Toss 
		
		if(toss=="Heads") {
			
			P1_Bats();
			
			System.out.println(" ");
			System.out.println("*****Innings Break*****");
			System.out.println(" ");
			
			P2_Bats();
		
		}
		
		
		//If B wins the Toss
		
		if(toss=="Tails") {
			
			
			P2_Bats();
			
			System.out.println(" ");
			System.out.println("*****Innings Break*****");
			System.out.println(" ");
			
			P1_Bats();
	
				
		}
		
		//Printing the round winner
		if(P1.score>P2.score) {
			System.out.println(" ");
			
			System.out.println(P1.Name+ " wins");
			
			System.out.println(" ");
			
			System.out.println(P1.Name+" is the winner of Round "+ round);
		}
		else if(P1.score<P2.score) {
			System.out.println(" ");
			
			System.out.println(P2.Name+" wins");
			
			System.out.println(" ");
			
			System.out.println(P2.Name+" is the winner of Round "+ round);
		}
		else if(P1.score==P2.score) {
			System.out.println("Round Draws!");
		}

	}
	
	public Player RoundWinner() {
		if(P1.score>P2.score) {
			return P1;
		}
		else if(P1.score<P2.score) {
			return P2;
		}
		return null;
	}
	
	
}
