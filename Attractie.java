package Weekopdracht;

public class Attractie {
	String naam;
	int prijs;
	
	Attractie(String naam, int prijs){
		this.naam = naam;
		this.prijs = prijs;
	}
	
	public String toString() {
		return "Attractie " + naam + " kost " + prijs;
	}
}
