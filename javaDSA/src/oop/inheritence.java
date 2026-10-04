package oop;

class vehicle{
	int speed;
	String brand;
	vehicle(int speed ,String brand){
		this.speed=speed;
		this.brand=brand;
		
}
	public void displayInfo() {
		System.out.println("speed "+speed);
		System.out.println("brand "+brand);
	}
}
class car extends vehicle{
	int doors;
public car(int speed,String brand,int doors) {
	super(speed,brand);
	this.doors=doors;
}
@Override
public void displayInfo() {
	super.displayInfo();
	System.out.println("doors "+doors);
}

}
public class inheritence {
public static void main(String args[]) {
	
}

}
