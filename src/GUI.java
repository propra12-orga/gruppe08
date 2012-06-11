import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GUI {
  public GUI () {
    Frame f = new Frame ("Men�beispiel");
    f.addWindowListener(new WindowAdapter () {
      public void windowClosing (final WindowEvent e) {
        System.exit(0);
      }
    });
    f.setMenuBar(this.getMenubar ());
    f.setSize(400,100);
    f.setVisible(true);
  }

  protected MenuBar getMenubar () {
    // Men�leiste anlegen
    MenuBar menueLeiste = new MenuBar ();
    // Ein Men� anlegen
    Menu datei = new Menu ("Datei");
    // Einen Men�eintrag anlegen
    MenuItem oeffnen = new MenuItem ("�ffnen");
    // Den Eintrag dem Men� hinzuf�gen
    datei.add (oeffnen);
    // Das Men� der Leiste hinzuf�gen
    menueLeiste.add(datei);

    // Noch ein Men� anlegen
    Menu extra = new Menu ("Extras");
    // ... und noch ein Men�
    Menu schriftart = new Menu ("Schriftart");
    //...das Men� dem Extramen� als Untermen� hinzuf�gen
    extra.add(schriftart);
    // Das Untermen� mit Eintr�gen f�llen
    schriftart.add("Sans");
    schriftart.add("Sans Serif");
    schriftart.addSeparator();
    schriftart.add("Courier");
    // Das Extramen� der Leiste hinzuf�gen
    menueLeiste.add(extra);
    return menueLeiste;
  }

  public static void main (String[] args) {
    GUI menusample = new GUI ();
  }
}