package ed.German;

public class School {

	private static final int ANY = 2022;
	private static final String CICLE_FORMATIU = "1º DAM-B";
	private static final String COGNOMS_ALUMNE = "Juan";
	private static final String NOM_ALUMNE = "Germán";

	public static void main(String[] args) {
		
		Persona alumneGerman = new Persona();
		
		alumneGerman.nom = NOM_ALUMNE;
		alumneGerman.cognoms = COGNOMS_ALUMNE;
		alumneGerman.cicleFormatiu = CICLE_FORMATIU;
		alumneGerman.any = ANY;
		
		System.out.println(alumneGerman.toString());

	}

}
