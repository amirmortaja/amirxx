
public class AmirAOmurtaja_21670310026_Hafta2_Ornek3 {

	public static void main(String[] args) {
		
		
		ogrenci[] kisiler = new ogrenci[2];
		
		kisiler[0] = new ogrenci();
		kisiler[0].OgrenciNo = 7;
		kisiler[0].OgrenciAdi = "Amir";
		kisiler[0].OgrenciSoyadi = "Mortaja";
		
		System.out.println(kisiler[0].OgrenciNo + " , " + kisiler[0].OgrenciAdi + " , " + kisiler[0].OgrenciSoyadi);
		
		kisiler[1] = new ogrenci();
		kisiler[1].OgrenciNo = 10;
		kisiler[1].OgrenciAdi = "Nozha";
		kisiler[1].OgrenciSoyadi = "Mortaja";
		
		System.out.println(kisiler[1].toString());


	}

}
