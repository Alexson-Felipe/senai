package AtiRevTop;

import javax.swing.JOptionPane;

public class Ati01 {
	
	static double valor;

	public static void main(String[] args) {
		
		valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da poupança"));
		valor = valor * 1.01;
		
		JOptionPane.showMessageDialog(null, "Valor reajustado: " + valor);

	}

}
