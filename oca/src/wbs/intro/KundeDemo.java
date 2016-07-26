package wbs.intro;

public class KundeDemo {

	public static void main(String[] args) {
		
		Kunde k1 = new Kunde(5.5,10,new Adresse("Paul Paulsen", "Im letzten Winkel 12", 12345, "Hintertupfingen") );
		k1.addAnsprechpartner(new Ansprechpartner("123","Gott",Position.VERTRIEB));
		k1.addAnsprechpartner(new Ansprechpartner("123","Herr",Position.ENTWICKLUNG));
		k1.addLieferAdresse(new Adresse("Hinz und Kunz", "Am Spring 5", 12333, "Weiterstown"));
		k1.addLieferAdresse(new Adresse("HinUndHer", "Am Fall 5", 12333, "Weiterstown"));
		System.out.println(k1);
		
		System.out.println("alle Lieferadressen");
		for(Adresse adresse : k1.getLiferadresse()) {
			System.out.println(adresse);
		}
		
		System.out.println("alle Ansprechpartner");
		for(Ansprechpartner aPartner : k1.getAnsprechpartner()) {
			System.out.println(aPartner);
		}
		 
		
	}

}
