
public class HelloWorld {
	
	public static int Multipliziere(int Seite_A,int Seite_B) {
		int Flaeche; 
		
		Flaeche = Seite_A * Seite_B;
		
		return Flaeche;
	}
	
	public static boolean istPrimzahl(int testobj){
		int i = 3;
		boolean ergebnis = false;
		boolean ergebnis_gefunden = false;
		if (testobj <=3){
			ergebnis_gefunden = true;
			ergebnis = true;
		}
		else if (testobj % 2 == 0) {
			ergebnis_gefunden = true;
			ergebnis = false;
		}
		
		while ((ergebnis_gefunden == false )&& ( i < testobj)) {
				
			
				if (testobj % i == 0) {
				ergebnis_gefunden = true;
				ergebnis = false;
			} else {
				i = i+2;
				if ( i >= testobj){
					ergebnis_gefunden = true;
					ergebnis = true;
				
				}
			}
		}
		return ergebnis;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean ergebnis;
		int testobj = 59;
		ergebnis = istPrimzahl(testobj);
		System.out.println(ergebnis);
		System.out.println("Test 1 !! Werden die änderungen in github gespeichert??");
	}

}
