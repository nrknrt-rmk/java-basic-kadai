package kadai_015;

public class Car_Chapter15 {
	//フィールド
   private int gear = 1 ;//ギア
   private int speed = 10 ;//速度
   
    //コントラスタ
   public Car_Chapter15(int gear , int speed) {
	   this.gear = gear ;
	   this.speed = speed ;
	
   }
//メソッド
   public void gearChange(int afterGear) {
	   System.out.println("ギア"+gear+"からギア"+afterGear+"に切り替えました") ;
	   afterGear = this.gear ;
	   //ギアと速度の定義づけ
	   this.speed = switch(this.gear) {
	   case 1 ->  10 ;
	   case 2 ->  20 ;
	   case 3 ->  30 ;
	   case 4 ->  40 ;
	   case 5 ->  50 ;
	   default -> 10 ;
	   } ;
   }
   
   public void run () {
	   System.out.println("速度は時速"+speed+"kmです");
   }
}
