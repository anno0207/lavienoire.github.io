package abc;

import java.util.ArrayList;
import java.util.List;

public class Player {
	//This is the class of player!
	private String name;
	private List<Card> privatecard;
	private int valueOfP;
	
	public Player(String name) {
		super();
		this.name = name;
		this.privatecard = new ArrayList<Card>();
	}
	
	public String getName() {
		return this.name;
	}
	
	public void receiveCard(Card newcard) {
		privatecard.add(newcard);
	}
	
	public int getValue() {
		valueOfP=privatecard.get(0).getValue();
		return  valueOfP;
	}
	
	public void getCard() {
		System.out.print(name+":");
		for(int i = 0;i<privatecard.size();i++) {
			System.out.print(privatecard.get(i)+" ");
		}
		System.out.print("\n");
	}
	
	@Override
	public String toString() {
		return name;
	}
}
