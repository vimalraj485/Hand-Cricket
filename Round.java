package cricketHand;

import java.lang.Math;
import java.util.ArrayList; 

public class Round {
	Player P1 ;
	Player P2 ;
	
	int P1Score = 0;
	int P2Score = 0;
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
	
	int target = 91;


	public void A_Batting() {
		int execute = 0;
		while(execute<15) {
			int Bat = (int)(Math.random()*7);
			int Bowl = (int)(Math.random()*7);
			
			if(Bat != Bowl) {
				P1Score = P1Score + Bat;
				System.out.println(P1.Name + " shows "+Bat+" and "+P2.Name+" shows " +Bowl+", "+ P1.Name +" scores "+P1Score);
				
				execute++;
			}
			else {
				System.out.println(P1.Name +" shows "+Bat+" and "+P2.Name +" shows " +Bowl+", "+P1.Name+"  got out  scoring "+P1Score+" runs");
				target = P1Score;
				break;
			}
			if(P1Score>target) {
				break;
			}

			}
		
		execute = 0;
	}
	
	public void B_Batting() {
		int execute = 0;

		while(execute<15) {
			int Bat = (int)(Math.random()*7);
			int Bowl = (int)(Math.random()*7);
			// A bat firsts
			
			if(Bat != Bowl) {
				P2Score = P2Score + Bat;
				System.out.println(P2.Name + " shows "+Bat+" and "+P1.Name+" shows " +Bowl+", "+ P2.Name +" scores "+P2Score);
				
				execute++;
			}
			else {
				System.out.println(P2.Name +" shows "+Bat+" and "+P1.Name +" shows " +Bowl+", "+P2.Name+"  got out  scoring "+P2Score+" runs");
				target = P2Score;
				break;
			}
			if(P2Score>target) {
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
			
			A_Batting();
			
			System.out.println(" ");
			System.out.println("*****Innings Break*****");
			System.out.println(" ");
			
			B_Batting();
		
		}

		//If B wins the Toss
		
		if(toss=="Tails") {

			B_Batting();
			
			System.out.println(" ");
			System.out.println("*****Innings Break*****");
			System.out.println(" ");
			
			A_Batting();
	
				
		}
		

	}
	
	public int RoundWinner() {
		if(P1Score>P2Score) {
			return 1;
		}
		else if(P1Score<P2Score) {
			return 2;
		}
		System.out.println("Round Draws!");
		return 0;
	}
	
	
}
