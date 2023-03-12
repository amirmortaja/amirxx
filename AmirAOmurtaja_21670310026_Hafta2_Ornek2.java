
public class AmirAOmurtaja_21670310026_Hafta2_Ornek2 {

	public static void main(String[] args) {
		
		
		Point p1 = new Point();
		
		p1.x = 2;
		p1.y = 10;
		
		System.out.println("p1 : " + p1.x + " , " + p1.y);
		
		p1.translate(4, 5);
		System.out.println("p1 : " + p1.x + " , " + p1.y);  // sum numbers (5+1 = 6 ), (12 + 4 = 16 )
		
		System.out.println("Yeni noktanin orjine olan uzakligi = " + p1.distanceFromOrigin(p1.x, p1.y));
		
		Point p2 = new Point();
		
		p2.x = 4;
		p2.y = 12;
		System.out.println("p2 Orjine olan uzaklik = " + p2.distanceFromOrigin(p2.x, p2.y));

	}

}
