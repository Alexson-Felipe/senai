package Case;

import javax.swing.JOptionPane;

public class Ati05 {
	
	static int valor;

	public static void main(String[] args) {
		
		valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
		valor = valor % 2;
		
		switch(valor) {
		case 0:
			JOptionPane.showMessageDialog(null, "Par");
			break;
		case 1:	
			JOptionPane.showMessageDialog(null, "Impar");
			break;
		}

	}

}
