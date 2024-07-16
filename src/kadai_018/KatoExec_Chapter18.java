package kadai_018;

public class KatoExec_Chapter18 {

	public static void main(String[] args) {
		//taroインスタンス化
		KatoTaro_Chapter18 taroAll = new KatoTaro_Chapter18() ;
		//太郎の紹介文を表示
		taroAll.setGivenName();
		taroAll.execIntroduce();
		
		System.out.println( );
		
		//ichiro インスタンス化
		KatoIchiro_Chapter18 ichiAll = new KatoIchiro_Chapter18() ;
		//紹介文を表示
		ichiAll.setGivenName();
		ichiAll.execIntroduce();
		
		System.out.println( );
		
		//hanakoインスタンス化
	    KatoHanako_Chapter18 hanakoAll = new KatoHanako_Chapter18() ;
	    //紹介文を表示
	    hanakoAll.setGivenName();
	    hanakoAll.execIntroduce();
		
	}
}
