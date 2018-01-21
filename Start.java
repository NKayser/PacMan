import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.*;
 
public class Start extends JFrame implements ActionListener
{
	private Fenster f;
		
    //Konstruktor
	public Start() {
    	
    	super("PacMan");
    	
    	//JButton mit Text "Start" wird erstellt
        JButton start = new JButton("Start");
        
        //JButton zum ActionListener hinzuf�gen, so dass per Mausklick auch was passiert
        start.addActionListener(this);
 
        //JButton wird dem Panel hinzugef�gt
        add(start);
 
        //Fenstergr��e setzen    
        setSize(435,400);
        
        //Fenster sichtbar machen
        setVisible(true);
    	
    }
	
	//Hauptmethode
    public static void main(String[] args)
    {
        //JFrame starten
		new Start();
    }
    
    //Action f�r den Mausklick festlegen
    public void actionPerformed(ActionEvent event)
    {
    	//aktives Fenster unsichtbar machen
    	setVisible(false);
    	
    	//neues Fenster erzeugen --> siehe Fenster.java
    	f = new Fenster();
    }
}