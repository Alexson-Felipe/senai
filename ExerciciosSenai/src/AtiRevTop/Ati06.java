package AtiRevTop;

import javax.swing.JOptionPane;

public class Ati06 {
	
	static int valor1, valor2, mult;

	public static void main(String[] args) {
		
		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));
		
		mult = valor1 * valor2;
		
		if(mult % 2 == 0) {
			JOptionPane.showMessageDialog(null,mult + " esse valor par");
		}else {
			JOptionPane.showMessageDialog(null,mult + " esse valor inpar");
		}
	}

}
