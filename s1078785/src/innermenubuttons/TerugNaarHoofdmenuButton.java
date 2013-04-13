package innermenubuttons;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;

import javax.swing.JComponent;

public class TerugNaarHoofdmenuButton extends JComponent implements MouseListener { 
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ClassLoader cldr = this.getClass().getClassLoader();
	private final URL terugnaarhoofdmenupath = cldr.getResource("res/back-to-main-menu-button.png");
	private final URL selectedterugnaarhoofdmenupath = cldr.getResource("res/s-back-to-main-menu-button.png");
	
	private Image terugnaarhoofdmenu = Toolkit.getDefaultToolkit().getImage(terugnaarhoofdmenupath);
	private Image selectedterugnaarhoofdmenu = Toolkit.getDefaultToolkit().getImage(selectedterugnaarhoofdmenupath);
	
	
	
	
	private boolean hover = false;
	
	
	public TerugNaarHoofdmenuButton(){
		this.addMouseListener(this);

		
		
	}

	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		if(!hover){
			TerugNaarHoofdMenuButton(g);
			repaint();
		}
		else{
			SelectedTerugNaarHoofdMenuButton(g);
			repaint();
		}
		
	}
	
	public void TerugNaarHoofdMenuButton(Graphics g){

		
		g.drawImage(terugnaarhoofdmenu,0,0,null);
	
		repaint();
	}
	
	public void SelectedTerugNaarHoofdMenuButton(Graphics g){
		
		g.drawImage(selectedterugnaarhoofdmenu,0,0,null);
		repaint();
	}
	
	@Override
	public void mouseClicked(MouseEvent m) {
		System.out.println("Terug bij hoofdmenu");
	
		
	}
	
	@Override
	public void mouseEntered(MouseEvent m) {
		System.out.println("Mouse hovered");
		hover=true;
		repaint();
		
		
	}
	
	@Override
	public void mouseExited(MouseEvent m) {
		hover=false;
		repaint();
		
	}
	
	@Override
	public void mousePressed(MouseEvent m) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mouseReleased(MouseEvent m) {
		// TODO Auto-generated method stub
		
	}

}
