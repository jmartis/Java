package Hoofdstuk1;

import javax.swing.*;



public class h01
{
	
	JFrame venster = null;
	
	public h01()
	{
		JFrame venster = new JFrame();
		venster.setTitle("Hoofdstuk 1 - Opdracht 1");
		venster.setLocation(100, 100);
		venster.setSize(300, 300);
		venster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel hoofdpaneel = new JPanel();
		venster.add(hoofdpaneel);
		venster.setVisible(true);
		
	}
	
	public static void main (String [] args)
	{
		
		new h01();
	}

}
