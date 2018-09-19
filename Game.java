package abc;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game {
	//This is the class of game, it contains the main method.
	String[] numeroList = {"2","3","4","5","6","7","8","9","10","V","D","R","A"};
	String[] couleurList = {"Tr","Ca","Co","Pi"};
	List<Card> cardBeginList;
	Player p1 = new Player("main1");
	Player p2 = new Player("main2");
	
	public Game() {
		super();
		this.cardBeginList = new ArrayList<Card>();
	}
	
	void createCards() {
		//This method is to create all the cards.
		System.out.println("----------start to create Poker----------");
		for (int i = 0;i< couleurList.length;i++) {
			for (int j=0;j<numeroList.length;j++) {
				Card newPoker = new Card(couleurList[i],numeroList[j]);
				newPoker.setvalue();
				cardBeginList.add(newPoker);	}		
		}
	}
	
	void showCards() {
		//This method is to show the cards created.
		System.out.println("Please input the cards you want to see[All,Tr,Ca,Co,Pi]:");
		Scanner patern = new Scanner(System.in);
		String getPatern = patern.nextLine();
		if ("All".equals(getPatern)) {
			System.out.println(cardBeginList);
		}else {
			for(int i = 0;i<cardBeginList.size();i++) {
				if(getPatern.equals(cardBeginList.get(i).getCouleur())) {
					System.out.println(cardBeginList.get(i));
				}
			}
		}
	}
	
	void giveCard() {
		//This method is to give the players cards.
		//Now, there is just one card.
		Random random = new Random();
		int j = random.nextInt(cardBeginList.size());
		Card c = new Card();
		c= cardBeginList.get(j);
		p1.receiveCard(c);
		j = random.nextInt(cardBeginList.size());
		c= cardBeginList.get(j);
		p2.receiveCard(c);
		p1.getCard();
		p2.getCard();
	
	}
	
	void compareGame() {
		//This method is to compare the value and give the winner.
		Compare.compare1(p1,p2);
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the game!");
		Game game1 = new Game();
		game1.createCards();
		game1.showCards();
		System.out.println('\n');
		game1.giveCard();
		System.out.println('\n');
		game1.compareGame();
	}

}
