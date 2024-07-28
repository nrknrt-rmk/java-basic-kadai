package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	
	public String getMyChoice() {
		
		Scanner scanner = new Scanner(System.in); //スキャナー
		
     while (true) {
	    System.out.println("自分のじゃんけんの手を入力しましょう"); 
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		
		String input = scanner.next(); //入力値の取得
		
		 if ((input.equals("r"))||(input.equals("s"))||(input.equals("p"))) { //じゃんけんに当てはまれば出力
			 System.out.println(input); //入力値の出力
			 scanner.close();
			 return input ;
		}
		 else {
			 System.out.println("表示できません");
		}
		
     }
	}
	
	public String getRandom() {
		
		String[] youJan = {"r" , "s" , "p"} ;       
	    String youCho = youJan[(int)(Math.floor(Math.random() * 3))] ; //ランダムに選ぶ
	    return youCho ;
	}
	
	public void playGame(String my , String you) {
		
		HashMap<String,String> comparison = new HashMap<String,String>();
		comparison.put("r", "グー") ;
		comparison.put("s", "チョキ") ;
		comparison.put("p", "パー") ;
		
		System.out.println("自分の手は"+comparison.get(my)+"、対戦相手の手は"+comparison.get(you));
		
		//じゃんけん
		if ((my.equals("r")&&(you.equals("s"))) || (my.equals("s"))&&(you.equals("p")) || (my.equals("p"))&&(you.equals("r"))) {
			System.out.println("自分の勝ちです。");
		} 
			
		else if (my.equals(you)) {
			System.out.println("あいこです。");
		}
		else {
			System.out.println("自分の負けです。");
		}
		
	}
}
