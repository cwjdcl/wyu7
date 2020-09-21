package text2;

public class Main {
	public static void main(String[] args) {
		Vehicle v = new Vehicle("50km/h","15立方米");
		System.out.println("速度为：" + v.getspeed() + "体积为：" + v.getsize());
		v.speedUp();
		v.speedDown();
	}

}
