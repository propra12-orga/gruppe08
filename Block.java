
public class Block {
	
	//Grundtyp f�r jeden Block/den Boden
	protected boolean passierbar;
	protected boolean zerstoerbar;
	
	public Block(){
		passierbar=true;
	}
	
	

	public void setPassierbar(boolean passierbar) {
		this.passierbar = passierbar;
	}



	public boolean isPassierbar() {
		return passierbar;
	}
	
}
