package text2;

public class Main {
	public static void main(String[] args) {
		Vehicle v = new Vehicle("50km/h","15������");
		System.out.println("�ٶ�Ϊ��" + v.getspeed() + "���Ϊ��" + v.getsize());
		v.speedUp();
		v.speedDown();
	}

}
