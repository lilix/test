import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Graphics;
import java.awt.BorderLayout;
	  
public class fenetre { 
	  
	public static void main(String[] args){     
		
			class fenetreprincipal extends JFrame { //class qui d�finis la fen�tre principal
		    public fenetreprincipal(){
		    this.setTitle("FTP Client");
		    this.setSize(400, 300);
		    this.setLocationRelativeTo(null);
		    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
		    this.setVisible(true); 
		    this.setResizable(false); 
		  
		    this.setLayout(new BorderLayout()); 
		  //Au sud
		    this.getContentPane().add(new JButton("Connexion"), BorderLayout.SOUTH);
		  } 
		   
		    
		    
		    
		    
		    
		} //fin de la d�finition de la fen�tre
			
	
				
		fenetreprincipal fen = new fenetreprincipal(); //appel de la fen�tre principal 
		
	
	    
	  } 
	
	
	
	

	
}