package TriOne;

import java.util.Scanner;

public class Nim {
	public static void main(String[] args) {
		game();
	}
	
	
	public static void game() {
		aiTurn();
		playerTurn();
		int towerHeight = 15;
		boolean playerTurn = true;
		System.out.println("█▀▀▄ █▀▀█ █▀▀▄ █░░█ █░░ █▀▀█ █▀▀▄");
		System.out.println("█▀▀▄ █▄▄█ █▀▀▄ █▄▄█ █░░ █░░█ █░░█");
		System.out.println("▀▀▀░ ▀░░▀ ▀▀▀░ ▄▄▄█ ▀▀▀ ▀▀▀▀ ▀░░▀");
		System.out.println("-----------------------------------------------");
		System.out.println("Welcome to Tower of Babel");
		System.out.println("-----------------------------------------------");
		while (towerHeight >= 0) {
			while (playerTurn == true) {
				Scanner input = new Scanner (System.in);
				System.out.println("How many discs would you like to remove(1-3): ");
				int playerChoice = input.nextInt();
				
				if (playerChoice == 1) {
					towerHeight = towerHeight - 1;
					System.out.println("Tower Height is now " + towerHeight);
					playerTurn = false;
				}
				if (playerChoice == 2) {
					towerHeight = towerHeight - 2;
					System.out.println("Tower Height is now " + towerHeight);
					playerTurn = false;
				}
				if (playerChoice == 3) {
					towerHeight = towerHeight - 3;
					System.out.println("Tower Height is now " + towerHeight);
					playerTurn = false;
				}
			}
			
			while (playerTurn == false) {
				if (towerHeight >= 10) {towerHeight -= 2; System.out.println("Computer took 2 disc. Tower Height is now " + towerHeight); playerTurn = true; break;}
				if (towerHeight == 9) {towerHeight -= 1; System.out.println("Computer took 1 disc. Tower Height is now " + towerHeight); playerTurn = true; break;}
				if (towerHeight == 8) {towerHeight -= 3; System.out.println("Computer took 3 disc. Tower Height is now " + towerHeight); playerTurn = true; break;}
				if (towerHeight == 7) {towerHeight -= 2; System.out.println("Computer took 2 disc. Tower Height is now " + towerHeight); playerTurn = true; break;}
				if (towerHeight == 6) {towerHeight -= 1; System.out.println("Computer took 1 disc. Tower Height is now " + towerHeight); playerTurn = true; break;}
				if (towerHeight == 5) {towerHeight -= 2; System.out.println("Computer took 2 disc. Tower Height is now " + towerHeight); playerTurn = true; break;}
				if (towerHeight == 4) {towerHeight -= 3; System.out.println("Computer took 3 disc. Tower Height is now " + towerHeight); playerTurn = true; break;}
				if (towerHeight == 3) {towerHeight -= 2; System.out.println("Computer took 2 disc. Tower Height is now " + towerHeight); playerTurn = true; break;}
				if (towerHeight == 2) {towerHeight -= 1; System.out.println("Computer took 1 disc. Tower Height is now " + towerHeight); playerTurn = true; break;}
				if (towerHeight == 1) {towerHeight -= 1; System.out.println("Computer took 1 disc. Tower Height is now " + towerHeight); System.out.println("You Won!"); playerTurn = true; break;}
				playerTurn = true;
				System.out.println("The Computer won");
				break;
			}
		}
	}
	
	public static void playerTurn() {
		
		
	}
	
	
	public static void aiTurn() {
		
		
	}
	
	
	
}
