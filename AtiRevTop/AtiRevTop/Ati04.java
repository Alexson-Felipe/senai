package AtiRevTop;

import javax.swing.JOptionPane;

public class Ati04 {
	
	static int valor1, valor2;

	public static void main(String[] args) {
		
		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));
		
		if (valor1 == valor2) {
			JOptionPane.showMessageDialog(null,"valor1 = " + valor1 + " e " + "valor2 = " + valor2 + " são iguais.");
		}else if(valor1 > valor2){
			JOptionPane.showMessageDialog(null,"valor1 = " + valor1 + " é maior que " + "valor2 = " + valor2);
		}else {
			JOptionPane.showMessageDialog(null,"valor2 = " + valor2 + " é maior que " + "valor1 = " + valor1);
		}
		
	}

}
