package Weekopdracht;

import java.util.ArrayList;

class KermisApp{
	public static void main (String[] args) {
		Kermis km = new Kermis();
		km.starten();//nu ben ik in OOP context
	}
}

class Kermis{
	//in de Kermis zijn allerlei zaken aanwezig dus ik moet fields maken
	ArrayList<Attractie> attracties = new ArrayList();
	//meteen een lijst aanmaken waar de attracties in kunnen
	Kassa kassa = new Kassa();
	
	Kermis(){
		attracties.add(new Botsautos("Botsautos",250, 1));
		attracties.add(new Spin("Spin",225, 1));
		attracties.add(new Spiegelpaleis("Spiegelpaleis",275, 1));
		attracties.add(new Spookhuis("Spookhuis",320, 1));
		attracties.add(new Hawaii("Hawaii",290, 1));
		attracties.add(new Ladderklimmen("Ladderklimmen",500, 1));
	}
	
	void starten() {
		System.out.println("Dit zijn onze attracties");
		for(Attractie assortiment : attracties) {
			System.out.println(assortiment);
		}
		startVerkoop();
			//af en toe naar een nieuwe methode zodat je bijv het verkopen hier gaat doen		
	}
	void startVerkoop() {
		int keuze = kassa.verkopen();
		Attractie attractie = attracties.get(keuze);
		System.out.println("U heeft gekozen voor " + attractie);
		kassa.afrekenen(attractie);
	}
}