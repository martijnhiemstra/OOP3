
public class Person {

	private String naam;
	
	private int leeftijd;
	
	private boolean geslacht;
	
	private String beroep;
	
	// Properties moeten uniek zijn
	// public String naam;
	
	// String   -> tekst
	// int		-> hele getal
	// boolean	-> true / false
	
	public void doeIets() {
		System.out.println("Wij zitten in methode doeIets");
		System.out.println("Naam is " + naam);
	}
	
	public String watIsJouwNaam() {
		String antwoord = "Mijn naam is " + naam;
		
		return antwoord;
		
		// return "Mijn naam is " + naam
	}
	
	public int watIsJouwLeeftijd() {
		return leeftijd;
	}
	
	public void stelLeeftijdIn(int nieuweLeeftijd) {
		leeftijd = nieuweLeeftijd;
	}
	
}
