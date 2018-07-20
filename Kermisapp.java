package Weekopdracht;

import java.util.ArrayList;

class Kermisapp{
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
		attracties.add(new Attractie("Botsautos",250));
		attracties.add(new Attractie("Spin",225));
		attracties.add(new Attractie("Spiegelpaleis",275));
		attracties.add(new Attractie("Spookhuis",320));
		attracties.add(new Attractie("Hawaii",290));
		attracties.add(new Attractie("Ladderklimmen",500));
	}
	
	void starten() {
		System.out.println("Dit zijn onze attracties");
		for(Attractie a : attracties) {
			System.out.println(a);
		}
		startVerkoop();
			//af en toe naar een nieuwe methode zodat je bijv het verkopen hier gaat doen		
	}
	void startVerkoop() {
		int keuze = kassa.verkopen();
		Attractie attractie = attracties.get(keuze);
		System.out.println("U heeft gekozen voor " + attractie);
	}
}
