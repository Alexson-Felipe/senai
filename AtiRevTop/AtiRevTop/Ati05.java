package AtiRevTop;

import javax.swing.JOptionPane;

public class Ati05 {

	static double valor1, valor2, div, rest;
	
	public static void main(String[] args) {
		
		valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor"));
		valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor"));
		
		div = valor1 / valor2;
		rest = valor1 % valor2;
		
		JOptionPane.showMessageDialog(null, "Quociente: " + div + "\nResto: " + rest);
		
	}

}
