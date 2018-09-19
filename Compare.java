package abc;
public class Compare {
	//The function of this class is to compare and give the winner.
	static void compare1(Player p1,Player p2) {
		if(p1.getValue()<p2.getValue()) {
			System.out.println("La"+p2.getName()+" gagne avec carte la plus ¨¦lev¨¦e:"+ p2.getValue());
		}else if(p1.getValue()>p2.getValue()) {
			System.out.println("La"+p1.getName()+" gagne avec carte la plus ¨¦lev¨¦e:"+ p1.getValue());
		}else {
			System.out.println("Equalite!");
		}
		
	}
}
