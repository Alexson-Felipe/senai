package Exe23;
import javax.swing.JOptionPane;

public class temperatura {
	
	static double c, k, re, ra, f;

	public static void main(String[] args) {
		
		c = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em Celsius: "));
		
		k = c + 273.15;
		re = c * 0.8;
		ra = c * 1.8 + 32 + 459.67;
		f = c * 1.8 + 32;
		
		JOptionPane.showMessageDialog(null, " Temperatura " + "\nCelsius: " + c + "\nKelvin: " + k + 
				"\nRéaumur: " + re + "\nRankine: " + ra + "\nFahrenheit: " + f);

	}

}
