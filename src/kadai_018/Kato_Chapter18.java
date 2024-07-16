package kadai_018;

abstract public class Kato_Chapter18 {
	//フィールド
    public String familyName ="加藤" ; //性
    public String givenName ;  //名
    public String address = "東京都中野区〇×";  //住所
    
    //コンストラクタ
    public Kato_Chapter18 () {
    }
    
    //メソッド
    
   public void commonIntoroduce() {
	   System.out.println("名前は"+this.familyName+this.givenName+"です");
	   System.out.println("住所は"+this.address+"です");
   }
   
   abstract void eachIntoroduce();
   
   public void execIntroduce() {
	   commonIntoroduce();
	   eachIntoroduce();
   }
}
