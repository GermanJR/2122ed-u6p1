package ed.German;

public class School {

	public static void main(String[] args) {
		
		Persona alumneGerman = new Persona();
		
		alumneGerman.nom = "Germán";
		alumneGerman.cognoms = "Juan";
		alumneGerman.cicleFormatiu = "1º DAM-B";
		alumneGerman.any = 2022;
		
		System.out.println(alumneGerman.toString());

	}

}
