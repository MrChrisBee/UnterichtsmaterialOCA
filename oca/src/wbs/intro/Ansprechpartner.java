package wbs.intro;

public class Ansprechpartner {
	
	private String durchwahl;
	private String email;
	private String name;
	private Position position;
	
	public Ansprechpartner(String name, String durchwahl, String email,
			Position position) {
		this.durchwahl = durchwahl;
		this.email = email;
		this.name = name;
		this.position = position;
	}
	
	public Ansprechpartner(String durchwahl, String name, Position position) {
		this.durchwahl = durchwahl;
		this.name = name;
		this.position = position;
	}

	public String getDurchwahl() {
		return durchwahl;
	}

	public void setDurchwahl(String durchwahl) {
		this.durchwahl = durchwahl;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "Ansprechpartner\n durchwahl=" + durchwahl + "\n email=" + email
				+ "\n name=" + name + "\n position=" + position;
	}

	
	

}
