package fr.Goudacraftnombre;

import javax.swing.JFrame;
import javax.swing.UIManager;

public class Main {
	public static void main(String[] args){

		try{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		}catch (Exception e){
			System.out.println("Unable to load Windows look and feel");
		}
		
		
		Frame GUI = new Frame();
			
		GUI.setSize(275, 100);
		GUI.setLocationRelativeTo(null);
		GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GUI.setVisible(true);
		GUI.setResizable(false);
		
	
			
			
		
	
		    
		} 
	
	}
	
		
	
		
