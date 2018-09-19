package abc;

public class Card {
	private String couleur;
	
	private String num;
	
	private int value;
	
	public Card() {
		super();
	}

	public Card(String couleur, String num) {
		super();
		this.couleur = couleur;
		this.num = num;
		
			
	}
	
	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public void setvalue() {
		switch(this.num) {
			case "2":
				this.value = 2;break;
			case "3":
				this.value = 3;break;
			case "4":
				this.value = 4;break;
			case "5":
				this.value = 5;break;
			case "6":
				this.value = 6;break;
			case "7":
				this.value = 7;break;
			case "8":
				this.value = 8;break;
			case "9":
				this.value = 9;break;
			case "10":
				this.value = 10;break;
			case "V":
				this.value = 11;break;
			case "D":
				this.value = 12;break;
			case "R":
				this.value = 13;break;
			case "A":
				this.value = 14;break;
		}
	}
	
	public int getValue() {
		return value;
	}

	@Override
	public String toString() {
		return  num + couleur;
	}
}
