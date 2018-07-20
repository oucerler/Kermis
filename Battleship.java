package Weekopdracht;
//FELIX ik ben verder gegaan in mijn alternatief. alle rode kruisjes op een rij:
//rij25 zegt ie dat ik initializeArray niet als method heb. Rij101, daar is ie
//rij47 precies hetzelfde, dat ik geen validMove methode heb. Zie rij95
//rij53 printSea ook weer! Ik zie een wederkomend probleem...


//OK Omer wat is de opdracht? Maak Zeeslag
//Wat heb je nodig? Nou allereerst een Zee. Maak die.
//Goed zo! Je kunt fokking class en Zee naast elkaar typen
//Net als in het voorbeeld van de producten in de supermarkt stoppen we de schepen in de zee
//We maken ook een aparte klasse Ship, met daarin de variabele coordinate want ze moeten zich op vaste plekken van de zee bevinden
//en net zoals er in de winkel een product met een prijs ligt doen we hetzelfde met sea.ship.coordinate
//en toen wist ik het even niet meer en was het half 12


import java.util.Scanner;

public class Battleship {

	public static void main(String[] args) {
		Scanner invoerUser = new Scanner (System.in);
		char [][] sea = new char [4][4];//afgestapt van nummers, ga even char proberen
		Ship ship = new Ship();
		char player = 'x';
		int movesLeft = 10;//maximaal 10 zetten
		int [] playerMove = new int[4];
		boolean isValid = false;
		initializeArray(sea);
		
//		sea[0][0] = (char) ship1.coordinate1;
//		sea[0][1] = (char) ship1.coordinate2;
//		sea[2][0] = (char) ship2.coordinate1;
//		sea[2][1] = (char) ship2.coordinate2;
//		sea[2][2] = (char) ship2.coordinate3;
//		sea[1][4] = (char) ship3.coordinate1;
//		sea[2][4] = (char) ship3.coordinate2;
//		sea[3][4] = (char) ship3.coordinate3;
//		sea[4][4] = (char) ship3.coordinate4;
		
		ship.getInfo();
		
		while (true) {
			while(isValid == false) {
				System.out.println("Captain, Please enter coordinates");
				playerMove[0] = invoerUser.nextInt();
				playerMove[1] = invoerUser.nextInt();
				isValid = validMove(sea,playerMove,player);
				if(isValid == false)
					System.out.println("Sorry Captian, invalid coordinates, please try again");
			}
			movesLeft--;//elke beurt één beurt minder
			printSea(sea);
			
			if(hasWinner(sea, player)) {
				invoerUser.close();
				break;
			}
			
			isValid = false;
			
			if(movesLeft == 0) {
				movesLeft = 10;
				initializeArray(sea);
				player = 'x';
				System.out.println("No sunk battleship, Captain, start over");
			}
	}
	System.out.println("You sank a battleship! You win!");
}

//class Sea{
//	int [][] sea = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
//	void inSea() {
//		for(int i = 0; i <sea.length;i++) {
//			for(int j = 0; j <sea.length;j++) {
//			}
//		}
//	}
	Ship ship1 = new Ship();
	Ship ship2 = new Ship();
	Ship ship3 = new Ship();

public static boolean validMove(char [][] sea, int []playerMove, char player) {
	if(playerMove[0] >= 0 && playerMove[0] <= 4 && playerMove[1] >= 0 && playerMove[1] <=4) {
		if(sea[playerMove[0]][playerMove[1]] == '0') {
			sea[playerMove[0]][playerMove[1]] = player;
			return true;
		}
	}
	return false;
}
static void initializeArray(char[][] sea) {//initialiseren van de zee met 0
	for(int i = 0; i < sea.length;i++) {
		for(int j = 0; j < sea[i].length;j++) {
			sea[i][j] = '0';
		}
	}
}

public static void printSea(char[][] sea) {
	for(int i = 0; i < sea.length;i++) {
		for(int j = 0; j < sea[i].length;j++) {
			System.out.println(sea[i][j] + " ");
		}
		System.out.println();
	}
}

public static boolean hasWinner(char [][] sea, char player) {
	if(sea[0][0] == player && sea[0][1] == player)
		return true;
	else if(sea[2][0] == player && sea[2][1] == player && sea[2][2] == player)
		return true;
	else if(sea[1][4] == player && sea[2][4] == player && sea[3][4] == player && sea[4][4] == player)
		return true;
	else
		return false;
}}
class Ship{
	char coordinate1;
	char coordinate2;
	char coordinate3;
	char coordinate4;
	void sink() {
		System.out.println("You sank a battleship!");
	}
	boolean win;
	void getInfo() {	
	}}