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

	public void Batting(Player P1, Player P2) {
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

	public void Match(String toss) {
		
		
		int round = roundno();
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
