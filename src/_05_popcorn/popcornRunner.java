package _05_popcorn;

import javax.swing.JOptionPane;

public class popcornRunner {
	public static void main(String[] args) {
	Popcorn popcorn = new Popcorn("butter");
	Microwave microwave = new Microwave();
		microwave.putInMicrowave(popcorn);
		String popcornFlavor = JOptionPane.showInputDialog("what flavor popcorn would you like?");
		String minutes = JOptionPane.showInputDialog("How many minutes would you like to cook it for?");
		int minute2 = Integer.parseInt(minutes);
		microwave.setTime(minute2);
		microwave.startMicrowave();
		popcorn.applyHeat();
		popcorn.eat();
		
		
		
	}
}
