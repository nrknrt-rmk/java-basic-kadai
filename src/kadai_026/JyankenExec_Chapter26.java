package kadai_026;

public class JyankenExec_Chapter26 {
	
	public static void main(String[] args) {
		
		Jyanken_Chapter26 janken = new Jyanken_Chapter26() ;

		String my = janken.getMyChoice();
		String you = janken.getRandom();
		janken.playGame( my ,you );
		
	}
	
	
   
}
