
public class Spieler {
	
	private int xPos, yPos; // Position auf dem Spielfeld
	private boolean status; // lebendig?

	//Spieler mit Position und Status
	public Spieler(){
		xPos=1;
		yPos=1;
		status=true;
	}

	
	//setter und getter
	public int getxPos() {
		return xPos;
	}

	public int getyPos() {
		return yPos;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public void setxPos(int xPos) {
		this.xPos = xPos;
	}

	public void setyPos(int yPos) {
		this.yPos = yPos;
	}
}