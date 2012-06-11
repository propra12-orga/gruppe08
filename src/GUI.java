import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GUI {
  public GUI () {
    Frame f = new Frame ("Menübeispiel");
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
    // Menüleiste anlegen
    MenuBar menueLeiste = new MenuBar ();
    // Ein Menü anlegen
    Menu datei = new Menu ("Datei");
    // Einen Menüeintrag anlegen
    MenuItem oeffnen = new MenuItem ("Öffnen");
    // Den Eintrag dem Menü hinzufügen
    datei.add (oeffnen);
    // Das Menü der Leiste hinzufügen
    menueLeiste.add(datei);

    // Noch ein Menü anlegen
    Menu extra = new Menu ("Extras");
    // ... und noch ein Menü
    Menu schriftart = new Menu ("Schriftart");
    //...das Menü dem Extramenü als Untermenü hinzufügen
    extra.add(schriftart);
    // Das Untermenü mit Einträgen füllen
    schriftart.add("Sans");
    schriftart.add("Sans Serif");
    schriftart.addSeparator();
    schriftart.add("Courier");
    // Das Extramenü der Leiste hinzufügen
    menueLeiste.add(extra);
    return menueLeiste;
  }

  public static void main (String[] args) {
    GUI menusample = new GUI ();
  }
}