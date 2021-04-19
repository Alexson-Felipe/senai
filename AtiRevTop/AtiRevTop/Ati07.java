package AtiRevTop;

import javax.swing.JOptionPane;

public class Ati07 {
	
	static int valor;

	public static void main(String[] args) {
		
		valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
		
		if(valor / 9 == 9) {
			JOptionPane.showMessageDialog(null, "O valor " + valor + " sua raiz é  9");
		}else if(valor / 8 == 8) {
			JOptionPane.showMessageDialog(null, "O valor " + valor + " sua raiz é  8");
		}else if(valor / 7 == 7) {
			JOptionPane.showMessageDialog(null, "O valor " + valor + " sua raiz é  7");
		}else if(valor / 6 == 6) {
			JOptionPane.showMessageDialog(null, "O valor " + valor + " sua raiz é  6");
		}else if(valor / 5 == 5) {
			JOptionPane.showMessageDialog(null, "O valor " + valor + " sua raiz é  5");
		}else if(valor / 4 == 4) {
			JOptionPane.showMessageDialog(null, "O valor " + valor + " sua raiz é  4");
		}else if(valor / 3 == 3) {
			JOptionPane.showMessageDialog(null, "O valor " + valor + " sua raiz é  3");
		}else if(valor / 2 == 2) {
			JOptionPane.showMessageDialog(null, "O valor " + valor + " sua raiz é  2");
		}

	}

}
