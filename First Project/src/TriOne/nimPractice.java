package TriOne;

import java.util.Scanner;

public class nimPractice {
	public static void main(String[] args) {
		game();
	}
	
	
	public static void game() {
		int towerHeight = 15;
		System.out.println("█▀▀▄ █▀▀█ █▀▀▄ █░░█ █░░ █▀▀█ █▀▀▄");
		System.out.println("█▀▀▄ █▄▄█ █▀▀▄ █▄▄█ █░░ █░░█ █░░█");
		System.out.println("▀▀▀░ ▀░░▀ ▀▀▀░ ▄▄▄█ ▀▀▀ ▀▀▀▀ ▀░░▀");
		System.out.println("-----------------------------------------------");
		System.out.println("Welcome to Tower of Babel");
		System.out.println("-----------------------------------------------");
		while (towerHeight >=1) {
			int playerChoice = getPlayerTake(towerHeight);
			towerHeight = towerHeight - playerChoice;
			System.out.println("You removed " + playerChoice + " discs");
			System.out.println("Tower Height is now " + towerHeight);
			if (towerHeight == 0){
				System.out.println("You lose, sorry!");
				break;
			}
			int aiChoice = aiTurn(towerHeight);
			System.out.println("computer removed " + aiChoice + " discs");
			towerHeight = towerHeight - aiChoice;
			System.out.println("Tower Height is now " + towerHeight);
			if (towerHeight == 0){
				System.out.println("You won!");
				break;
			}
			
		}
	}
	
	
	public static int getPlayerTake(int towerHeight) {
		
		int playerChoice = 0;
		while (playerChoice != 1 || playerChoice != 2 || playerChoice != 3) {
			Scanner input = new Scanner (System.in);
			System.out.println("How many discs would you like to remove(1-3): ");
			playerChoice = input.nextInt();
			switch (playerChoice){
            case 1: {return 1;}
            case 2: {return 2;}
            case 3: {return 3;}
			}
		}
		return 0;
	}

	
	
	public static int aiTurn(int towerHeight) {
			if (towerHeight >= 10) return 2;
			if (towerHeight == 9) return 1;
			if (towerHeight == 8) return 3; 
			if (towerHeight == 7) return 2; 
			if (towerHeight == 6) return 1; 
			if (towerHeight == 5) return 2; 
			if (towerHeight == 4) return 3; 
			if (towerHeight == 3) return 2; 
			if (towerHeight == 2) return 1;
			if (towerHeight == 1) return 1;
			//TODO if all else fails, what should it return?
			return 0;
		
	}
	
	
	
}
