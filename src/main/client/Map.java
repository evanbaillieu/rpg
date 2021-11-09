package main.client;

import java.util.Scanner;

public class Map {

	private static char map[][] = {{'-', '-','-', '-','-', '-','-', '-','-', '-','-', '-','-', '-', 'x', '-'}
								  ,{'-', '-','-', '-','-', '-','-', '-','-', '-','-', '-','-', '-', '.', '-'}
								  ,{'-', '-','-', '-','-', '-','-', '-','-', '-','-', '-','-', '-', '.', '-'}
								  ,{'-', '-','-', '-','-', '-','-', '-','-', '-','-', '-','-', '-', '.', '-'}
								  ,{'-', '-','-', '-','-', '-','-', '-','-', '-','-', '-','-', '-', '.', '-'}
								  ,{'-', '-','-', '-','-', '-','-', '-','-', '-','-', '-','-', '-', '.', '-'}
								  ,{'-', '-','-', '-','-', '*','-', '.','.', '.','.', '.','.', '.', '.', '-'}
								  ,{'-', '-','-', '-','-', '.','-', '.','-', '-','-', '-','-', '-', '-', '-'}
								  ,{'-', 'm','-', '-','-', '.','-', '.','.', '-','-', '-','-', '-', '-', '-'}
								  ,{'-', '.','.', '.','.', '.','.', '.','-', '-','-', '-','-', '-', '-', '-'}
								  ,{'-', '.','.', 'm','.', '.','.', '.','*', '-','-', '-','-', '-', '-', '-'}
								  ,{'-', '.','.', '-','.', '.','.', '.','.', '-','-', '-','-', '-', '-', '-'}
								  ,{'-', '.','.', '-','.', '.','.', '.','.', '-','-', '-','-', '-', '-', '-'}
								  ,{'-', '.','.', '-','.', '.','.', '.','.', '-','-', '-','-', '-', '-', '-'}
								  ,{'-', '.','.', '-','.', 'm','.', '.','.', '-','-', '-','-', '-', '-', '-'}
								  ,{'-', '.','.', '.','.', '.','.', '.','.', '-','-', '-','-', '-', '-', '-'}
								  ,{'-', '.','.', '.','.', '.','.', '.','.', '.','.', '.','.', '-', '-', '-'}
								  ,{'-', '.','.', '.','.', '.','.', '.','.', '.','.', '.','.', '-', '-', '-'}
								  ,{'-', '.','-', '-','-', '-','-', '-','-', '-','-', '-','-', '-', '-', '-'}
								  ,{'-', '.','-', '-','-', '-','-', '-','-', '-','-', '-','-', '-', '-', '-'}};
	
	private int x,y;
	private Game game;
	
	Map(int x , int y ){
		this.x = x;
		this.y = y;
		this.game = new Game();
		Scanner clavier = new Scanner(System.in);
		this.map[x][y] = 'O';
		while(this.map[x][y] != 'x') {
			System.out.println("vous pouvais vous deplacer");
			String key = clavier.nextLine();
			switch(key) {
				case "z":
					this.moveUp();
					break;
				case "s":
					this.moveDown();
					break;
				case "q":
					this.moveL();
					break;
				case "d":
					this.moveR();
					break;
					
			}
			this.afficheMap();
		}
		
	}
	//19
	//16
	private void move() {
		char c = map[x][y];
		
	}
	
	private void afficheMap() {
		
		for(int i = 0; i < this.map.length; i++ ) {
				System.out.println(this.map[i]);

		}
	}
	
	private void moveUp() {
		if(this.x != 0 && this.map[this.x+1][this.y] != '-') {
			char c = map[x][y];
			map[x][y] = '.';
			this.x -= 1;
			this.checkZone();
			map[this.x][this.y] = c;
			
			
		}else {
			System.out.println("vous neut pouvais pas plus monter");
		}
	}
	
	private void moveR() {
		if(this.y != 15 && this.map[this.x][this.y - 1] != '-') {
			char c = map[x][y];
			map[x][y] = '.';
			this.y -= 1;
			this.checkZone();
			map[this.x][this.y] = c;
		}else {
			System.out.println("vous neut pouvais pas plus aller plus a droite");

		}
	}
	
	private void moveL() {
		if(this.y != 0 && this.map[this.x][this.y + 1] != '-') {
			char c = map[x][y];
			map[x][y] = '.';
			this.y += 1;
			this.checkZone();
			map[this.x][this.y] = c;
		}else {
			System.out.println("erre");
		}
	}
	
	private void moveDown() {
		if(this.x != 18 && this.map[this.x - 1][this.y] != '-') {
			char c = map[x][y];
			map[x][y] = '.';
			this.x += 1;
			this.checkZone();
			map[this.x][this.y] = c;
		}else {
			System.out.println("vous neut pouvais pas plus desendre");
		}
		
	}
	
	private void checkZone() {
		switch(map[x][y]){
			case 'm':
				System.out.println("voici un monstreur");
				this.game.combat();
				break;
			case '*':
				System.out.println("voici un marchant");
				this.game.decouvreMarchant();
				break;
			case '.':
				System.out.println("il ni a rien");
				this.game.objetUtilisable();
				break;
		}
	}
}
