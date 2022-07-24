package Practice;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
	
	
	static Scanner sc = new Scanner(System.in);
	static int yourScore = 0;
	static int AIScore = 0;
	public static void main(String[] args) {
		boolean game = true;
		while(game) {
			//Asking for Input from Player
			System.out.println("Enter your choice:");
			System.out.println("1. R for Rock");
			System.out.println("2. P for Paper");
			System.out.println("3. S for Scissors");
			char yourChoice = sc.next().charAt(0);
			
			
			//Taking Input from Computer
			char[] choices = {'R', 'P', 'S'};
			Random r = new Random();
			char AIChoice = choices[r.nextInt(choices.length)];
			
			
			if(yourChoice == 'R') {
				if(AIChoice == 'P') {
					System.out.println("AI selected Paper");
					System.out.println("You Lost");
					AIScore++;
				}
				else if(AIChoice == 'S') {
					System.out.println("AI selected Scissors");
					System.out.println("You Won");
					yourScore++;
				}
				else if(AIChoice == 'R') {
					System.out.println("AI also selected Rock");
					System.out.println("It's a DRAW");
				}
			}
			else if(yourChoice == 'P') {
				if(AIChoice == 'R') {
					System.out.println("AI selected Rock");
					System.out.println("You Won");
					yourScore++;
				}
				else if(AIChoice == 'S') {
					System.out.println("AI selected Scissors");
					System.out.println("You Lost");
					AIScore++;
				}
				else if(AIChoice == 'P') {
					System.out.println("AI also selected Paper");
					System.out.println("It's a DRAW");
				}
			}
			else if(yourChoice == 'S') {
				if(AIChoice == 'R') {
					System.out.println("AI selected Rock");
					System.out.println("You Lost");
					AIScore++;
				}
				else if(AIChoice == 'P') {
					System.out.println("AI selected Paper");
					System.out.println("You Won");
					yourScore++;
				}
				else if(AIChoice == 'S') {
					System.out.println("AI also selected Scissors");
					System.out.println("It's a DRAW");
				}
			}
			
			System.out.println("Do you want to continue?");
			System.out.println("Enter 1 for Yes");
			System.out.println("Enter 2 for No");
			if(sc.nextInt() == 2) game = false; 
		}
		
		if(AIScore > yourScore) System.out.println("AI won by "+(AIScore - yourScore)+" points");
		else if(AIScore < yourScore) System.out.println("You won by "+(yourScore - AIScore)+" points");
		else System.out.println("It's a DRAW");
	}
}
