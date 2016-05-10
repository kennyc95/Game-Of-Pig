//This program is to play Game Of Pig
//Kenny Chen, V00825715
// 10/22/2014
import java.util.*;
public class GameOfPig{
	public static void main (String args []){
		System.out.println("Let's Play!");
		int yourTotal = 0;
		int compTotal = 0;
		for(int i=1; i>0; i++){//Loops the 2 methods so the dice keep rolling and the score accumulates
			int curscorep = PlayerTurn();
			int curscorec = CompTurn();
			yourTotal = yourTotal + curscorep;//Calculates your total by adding what you previously had with what you just rolled
			System.out.println("Your total score is " + yourTotal);
			compTotal = compTotal + curscorec;//Calculates computer total by adding what the computer previously had with what the computer just rolled
			System.out.println("Computer total score is " + compTotal);
		if(compTotal>= 100){//A rule that if either player gets 100 points, they win
			System.out.println("Computer wins");
			i = -100;
			}
		else if(yourTotal >= 100){//A rule that if either player gets 100 points, they win
			System.out.println("You win!!!! Congratulations!");
			i=-1;
		}
		}
		}
	//This method acts as the dice for the game, generates a random value between 1 and 6 and returns the value so it can
	//be used by other methods
	public static int Dice(){
	Random gen = new Random();
	int randomInt = gen.nextInt(6)+1;
	return randomInt;
	}
	
	//This is the players turn, it initializes a scanner and then asks if the player wants to roll
	//If the player does want to roll, it calls on the dice method and tallies up your score
	//If the player doesn't want to roll then it sets i=-1 so it can end the while loop
	public static int PlayerTurn(){
		Scanner ask = new Scanner(System.in);
		int i = 2;
		int total = 0;
		while(i > 1){
			System.out.println("Would you like to roll?");
			String quest = ask.nextLine();
			if(quest.equalsIgnoreCase("y")){
				int roll = Dice();
				if(roll==1){
					System.out.println("You have rolled " + roll );
					total = 0;
					i= -1;
				}
				else {
				System.out.println("You have rolled "+ roll);
				total = total + roll;
				System.out.println("Your total for the round is "+ total);
				}
			}	
			else if(quest.equalsIgnoreCase("n")){
			i = -1;
			}
			
		}
	return total;
	}
	//This is the computers turn. The computers turn will end either they roll 4 times, maintained by the for loop
	//Or if the computer rolls a 1
	public static int CompTurn(){
		int total = 0;
		for( int i = 1; i<=4; i++){
			int roll = Dice();
		if( roll == 1){
			System.out.println("Computer rolled " + roll + " and computer total for the round is " + total);
			total = 0;
			i = 5;
		}
		else{
		total = total + roll;
		System.out.println("Computer rolled " + roll + " and computer total for the round is " + total);
		}
		
	}
	return total;
	}
}