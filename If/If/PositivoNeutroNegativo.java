package If;

import javax.swing.JOptionPane;

public class PositivoNeutroNegativo {
	
	static int numero;

	public static void main(String[] args) {
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		
		if (numero == 0) {
			JOptionPane.showMessageDialog(null, "O numero é Neutro");
		}else if(numero > 0) {
			JOptionPane.showMessageDialog(null, "O numero é Positivo");
		}else {
			JOptionPane.showMessageDialog(null, "O numero é Negativo");
		}

	}

}
