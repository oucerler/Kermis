package Weekopdracht;

import java.util.ArrayList;
import java.util.Scanner;

public class Kassa {
	int geldhoeveelheid;
	ArrayList<Attractie> verkochteAttracties = new ArrayList();
	Scanner scanner = new Scanner(System.in);
	//zet de scanner echt als field, dan heb je 1 keer die scanner
	int totaalKaartjes;
	ArrayList<Attractie> verkochteKaartjes = new ArrayList();
	
	
	int verkopen() {
		//we moeten iets terug hebben, dus ipv 'void' komt hier 'int'
		System.out.println("In welke attractie wilt u gaan?");
		//als ik hier nu opties geef voor omzet en kaartverkoop...?
		String invoer = scanner.nextLine();//klant voert wat in
		System.out.println(invoer);
		int getal = Integer.parseInt(invoer); //wrappers, hoe werkte dat ook al weer?
		return getal;
	}
	void afrekenen(Attractie attractie) {
		geldhoeveelheid += attractie.prijs;
		System.out.println("Ik heb nu " + geldhoeveelheid + " euro omzet.");
	}
	void kaartjesAantal(Attractie attractie) {
		totaalKaartjes += attractie.kaartjes;
		System.out.println("Ik heb nu " + totaalKaartjes + " kaartjes verkocht.");
	}
//	void omzetBerekenen(Attractie attractie) {
//		geldhoeveelheid += attractie.prijs;
//		System.out.println("U heeft nu " + geldhoeveelheid + " euro omgezet.");
//	}
}