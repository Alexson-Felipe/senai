package AtiRevTop;

import javax.swing.JOptionPane;


public class Ati11 {
	
	static double div;

	public static void main(String[] args) {
		
		div = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor"));
		
		if(div % 2 == 0) {
			JOptionPane.showMessageDialog(null, "Divisível por 2");
		}else if(div % 5 == 0) {
			JOptionPane.showMessageDialog(null, "Divisível por 5");
		}else if(div % 10 == 0) {
			JOptionPane.showMessageDialog(null, "Divisível por 10");
		}else {
			JOptionPane.showMessageDialog(null, "Esse valor não é divisível por nenhum valor da lista");
		}
	}

}
