import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		System.out.println("Applicatie is gestart");
		
		Person p = new Person();
		//p.naam = "Henk";
		//p.leeftijd = 35;
		p.stelLeeftijdIn(35);
		p.doeIets();
		
		Person p2 = new Person();
		//p2.naam = "Magreet";
		p2.doeIets();
		String antwoordVanPersoon2 = p2.watIsJouwNaam();
		System.out.println("Antwoord van persoon 2 = " + antwoordVanPersoon2);
		
		// String 	-> ""
		// int 		-> 12  34567 23
		// boolean 	-> true   false
		
		// Vul de andere properties
		// Maak een 2de person aan
		
		
		Rekenmachine r = new Rekenmachine();
		int antwoord = r.optellen(8, 17);
		System.out.println("Antwoord is " + antwoord);
		
		Animal a = new Animal();
		
		int legs = a.getLegs();
		System.out.println("Aantal poten = " + legs);
		a.setLegs(8);
		
	}

}
