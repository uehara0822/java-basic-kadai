package samuraiterakoya;

public class Car_Chapter15{
	private int gear=1;
	private int speed=10;
	
//	public Car_Chapter15() {
//	}
	
	public void gearChange(int afterGear){
		this.gear=afterGear;
		switch(this.gear) {
		case 1 ->this.speed=10;
		case 2 ->this.speed=20;
		case 3 ->this.speed=30;
		case 4->this.speed=40;
		case 5->this.speed=50;
		default->this.speed=60;
		}
	}
	public void run() {
		System.out.println("ギア1から"+this.gear+"に切り替えました");
		System.out.println("速度は時速"+this.speed+"kmです");
	}
	
	
	
}