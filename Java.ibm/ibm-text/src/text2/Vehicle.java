package text2;
public class Vehicle {
	private String speed;
	private String size;
	public Vehicle(String speed,String size) {
		this.speed = speed;
		this.size = size;
	}
	public String speed() {
		return speed;
	}
	public String size() {
		return size;
	}
	public void speedUp() {
		System.out.println("����");
	}
	public void speedDown() {
		System.out.println("����");
	}
	public String getspeed() {
		// TODO Auto-generated method stub
		return speed;
	}
	public String getsize() {
		// TODO Auto-generated method stub
		return size;
	}
	
	
}
