package Case;

import javax.swing.JOptionPane;

public class Ati01 {
	
	//Calculadoraa simples
	
	static double v1, v2, calculando;
	static char operacao;
	
	public static void main(String[] args) {
		
		v1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor"));
		operacao = JOptionPane.showInputDialog("/ * + -").charAt(0);
		v2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor"));
		
		switch(operacao) {
		case '/':
			calculando = v1 / v2;
			break;
		case '*':
			calculando = v1 * v2;
			break;
		case '+':
			calculando = v1 + v2;
			break;
		case '-':
			calculando = v1 - v2;
			break;
		}
		JOptionPane.showMessageDialog(null,v1 + "" +operacao + "" + v2 + " Resultado dessa equação foi: "  +  calculando);
		

	}

}
