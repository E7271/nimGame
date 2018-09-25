package TriOne;

import java.util.Scanner;

public class NimBot {
	public static void main(String[] args) {
		game();
	}
	
	
	public static void game() {
		int towerHeight = (int) Math.floor(Math.random() * 99999999 + 10000000);
		System.out.println("█▀▀▄ █▀▀█ █▀▀▄ █░░█ █░░ █▀▀█ █▀▀▄");
		System.out.println("█▀▀▄ █▄▄█ █▀▀▄ █▄▄█ █░░ █░░█ █░░█");
		System.out.println("▀▀▀░ ▀░░▀ ▀▀▀░ ▄▄▄█ ▀▀▀ ▀▀▀▀ ▀░░▀");
		System.out.println("-----------------------------------------------");
		System.out.println("Welcome to Tower of Babel");
		System.out.println("-----------------------------------------------");
		while (towerHeight >=1) {
			int playerChoice = getPlayerTake(towerHeight);
			towerHeight = towerHeight - playerChoice;
			//System.out.println("Computer One removed " + playerChoice + " discs");
			//System.out.println("Tower Height is now " + towerHeight);
			if (towerHeight == 0){
				System.out.println("Computer One wins");
				break;
			}
			int aiChoice = aiTurn(towerHeight);
			//System.out.println("Computer Two removed " + aiChoice + " discs");
			towerHeight = towerHeight - aiChoice;
			//System.out.println("Tower Height is now " + towerHeight);
			if (towerHeight == 0){
				System.out.println("Computer Two wins");
				break;
			}
			
		}
	}
	
	
	public static int getPlayerTake(int towerHeight) {
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
