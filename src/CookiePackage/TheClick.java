package CookiePackage;

import java.awt.event.ActionEvent;
import CookiePackage.Variables.*;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
//import CookiePackage.GUI.*;
public class TheClick implements ActionListener {

	public static boolean hasitbeenused1 = true;
	static boolean hasitbeenused2 = true;
	static boolean hasitbeenused3 = true;
	static boolean hasitbeenused4 = true;
	static boolean hasitbeenused5 = true;
	static boolean hasitbeenused6 = true;
	static boolean hasitbeenused7 = true;
	static boolean hasitbeenused8 = true;
	static boolean hasitbeenused9 = true;
	
	
	
	
	public void TheClicker(){
		
		//System.out.println("Clicker Clicked");
	
        Variables.RacesWon += Variables.ClickPower;
		System.out.println(hasitbeenused1);
		
		
		String RacesFinal = "" + Variables.RacesWon;
		GUI.RacesWonCount.setText(RacesFinal);
		
		if(Variables.RacesWon == 1 && hasitbeenused1==true){
			hasitbeenused1 = false;
			JOptionPane.showMessageDialog(null, "Achievement: First Race!");
			Achievements.Achievements.add("Achievement: First Race!");
			
		}
		if(Variables.RacesWon == 10 && hasitbeenused2==true){
			hasitbeenused2 = false;
			JOptionPane.showMessageDialog(null, "Achievement: Your first ten");
			Achievements.Achievements.add("Achievement: Your first ten");
			
		}
		if(Variables.RacesWon == 25 && hasitbeenused3==true){
			hasitbeenused3 = false;
			JOptionPane.showMessageDialog(null, "Achievement: Enough for an engine..!");
			Achievements.Achievements.add("Achievement: Enough for an engine..!");
			
		}
		if(Variables.RacesWon == 100 && hasitbeenused4==true){
			hasitbeenused4 = false;
			JOptionPane.showMessageDialog(null, "Achievement: One Hundred Races!");
			Achievements.Achievements.add("Achievement: One Hundred Races!");
			
		}
		if(Variables.RacesWon == 1000 && hasitbeenused5==true){
			hasitbeenused5 = false;
			JOptionPane.showMessageDialog(null, "Achievement: 1K Races!!");
			Achievements.Achievements.add("Achievement: 1K Races!!");
			
		}
		if(Variables.RacesWon == 15000 && hasitbeenused6==true){
			hasitbeenused6 = false;
			JOptionPane.showMessageDialog(null, "Achievement: Time for some clean rims..");
			Achievements.Achievements.add("Achievement: Time for some clean rims..");
			
		}
		if(Variables.RacesWon == 50000 && hasitbeenused7==true){
			hasitbeenused7 = false;
			JOptionPane.showMessageDialog(null, "Achievement: 50K Races!!");
			Achievements.Achievements.add("Achievement: 50K Races!!");
			
		}
		if(Variables.RacesWon == 100000 && hasitbeenused8==true){
			hasitbeenused8 = false;
			JOptionPane.showMessageDialog(null, "Achievement: Lets turn up the visibility..!!");
			Achievements.Achievements.add("Achievement: Lets turn up the visibility..!!");
			
		}
		if(Variables.RacesWon == 1000000 && hasitbeenused9==true){
			hasitbeenused9 = false;

			JOptionPane.showMessageDialog(null, "Achievement: You've been playing for longer than expected..");
			Achievements.Achievements.add("Achievement: You've been playing for longer than expected..");
		
		}
		
		
		if(Variables.RacesWon == 2100000000){
			JOptionPane.showMessageDialog(null,"You are reaching the limit of the amount of races your 32bit system can handle, you have officially won the game. Congrats. Brace for glitches and negative numbers after this message.");
		}
		
	
	}

	
	
	public void actionPerformed(ActionEvent arg0) {
		
		TheClicker();
		
		
		
	}

}
