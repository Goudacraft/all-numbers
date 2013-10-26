package fr.elie.nombre;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Frame extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

		public JButton	Back = new JButton("Back"),
								Next = new JButton("Next");
		
		public int		Num_int = 0;
		public String 	Num_Str = new String(Integer.toString(Num_int));
		private JLabel	JLabel = new JLabel(Num_Str);

		
		/* ******************************************************** */
		
		
		public Frame(){
			super("Projet nombres entiers");
			setLayout(null);
			
			Back_Button();
			Next_Button();
			Label();
			
		}
		
		public void Back_Button(){					  
			Back.setFocusPainted(false);
			Back.addActionListener(this);
			Back.setBounds(5, 5,100,25);
			
			add(Back);
		}
		
		
		/* ********************************************************************** */
		
		
		public void Label(){
			JLabel.setBounds(5, 50,100,25);
			
			add(JLabel);
		}

		public void Next_Button(){
			Next.setFocusPainted(false);
			Next.addActionListener(this);
			Next.setBounds(150, 5,100,25);
			
			add(Next);

		}

		@Override
		public void actionPerformed(ActionEvent e) {
			Object src = e.getSource();
			if(src == Back){
				Num_int--;
				Num_Str = new String(Integer.toString(Num_int));
				JLabel.setText(Num_Str);
			}
			
			if(src == Next){
				Num_int++;
				Num_Str = new String(Integer.toString(Num_int));
				JLabel.setText(Num_Str);

			}
		} 
	}	
//Ici, tu va creer les 2 boutons + un jlabel + un int + un String 
