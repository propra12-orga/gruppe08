
public class Spielfeld {
	
	public Block[][] feld;
	public Spieler spielerEins;
	
	
	// Spielfeld und Spielfigur erstellen, Rand setzen
	public Spielfeld(int groesse){
		feld=new Block[groesse][groesse];
		spielerEins= new Spieler();
		
		for(int i=0; i<groesse; i++) {
			for(int j=0; j<groesse; j++) {
				feld[i][j]=new Block();
			}
		}
		
		for(int i=0; i<groesse; i++) {
			feld[0][i]=new Mauer();
			feld[i][0]=new Mauer();
			feld[groesse-1][i]=new Mauer();
			feld[i][groesse-1]=new Mauer();
		}
		
		
		
	}
	
	
	// Spielfigur nach oben, links, unten, rechts bewegen
	public void bewegen(char richtung) {
		switch(richtung) {
		case 'w': if(feld[spielerEins.getxPos()][spielerEins.getyPos()-1].isPassierbar()==true) spielerEins.setyPos(spielerEins.getyPos()-1); break;
		case 'a': if(feld[spielerEins.getxPos()-1][spielerEins.getyPos()].isPassierbar()==true) spielerEins.setxPos(spielerEins.getyPos()-1); break;
		case 's': if(feld[spielerEins.getxPos()][spielerEins.getyPos()+1].isPassierbar()==true) spielerEins.setyPos(spielerEins.getyPos()+1); break;
		case 'd': if(feld[spielerEins.getxPos()+1][spielerEins.getyPos()].isPassierbar()==true) spielerEins.setxPos(spielerEins.getyPos()+1); break;		
		}
	}


	public Block getFeldBlockXY(int posX, int posY) {
		return feld[posX][posY];
	}

	
	public Spieler getSpielerEins() {
		return spielerEins;
	}
	
	
	
}
