
public class Spiel {
	
	Spielfeld brett ;
	char taste;
	int spielfeldquadratgroesse=10;
	
	// Erstellt ein Spielfeld
	public Spiel(){
		brett = new Spielfeld(spielfeldquadratgroesse);
		
	}
	
	// zeichnet die Karte samt Spieler in der Konsole - kann auskommentiert werden, sobald Grafik vorhanden ist.
	public void plot() {
		for(int j=0; j<spielfeldquadratgroesse; j++) {
			for(int i=0; i<spielfeldquadratgroesse; i++) {
				if(i==brett.getSpielerEins().getxPos() && j==brett.getSpielerEins().getyPos()) {
					System.out.print("X");
				}
				if(brett.getFeldBlockXY(i, j) instanceof Mauer == true && !(i==brett.getSpielerEins().getxPos() && j==brett.getSpielerEins().getyPos())) {
					System.out.print("1");
				}
				else if((brett.getFeldBlockXY(i, j) instanceof Block == true) && (i!=brett.getSpielerEins().getxPos() || j!=brett.getSpielerEins().getyPos()) ){ 
					System.out.print("0");
				}
				
			}
			System.out.print("\n");
		}
		
	}
}
