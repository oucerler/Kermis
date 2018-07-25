package Weekopdracht;

public abstract class Attractie {
	String naam;
	int prijs;
	int oppervlakte;
	int kaartjes;
	int omzet;	
	
	Attractie(String naam, int prijs, int kaartjes){
		this.naam = naam;
		this.prijs = prijs;
		this.kaartjes = kaartjes;
	}
	
	public String toString() {
		return "Attractie " + naam + " kost " + prijs;
	}
}