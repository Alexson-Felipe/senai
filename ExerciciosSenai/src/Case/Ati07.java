package Case;

import javax.swing.JOptionPane;

public class Ati07 {

	static double salario;
	static char grauDeInstrucao;

	public static void main(String[] args) {

		salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o Salario"));
		grauDeInstrucao = JOptionPane
				.showInputDialog(null, "Grau de instrução: " + "\nS - Ensino Supeior \nD - Doutorado \nM - Mestrado")
				.charAt(0);

		
		switch(grauDeInstrucao) {
		case 's':
			salario = salario * 1.08;
			JOptionPane.showMessageDialog(null, "valor do salario reajustado é: R$" + salario);
		break;
		case 'd':
			salario = salario * 1.12;
			JOptionPane.showMessageDialog(null, "valor do salario reajustado é: R$" + salario);
			break;
		case 'm':
			salario = salario * 1.15;
			JOptionPane.showMessageDialog(null, "valor do salario reajustado é: R$" + salario);
			break;
		default:
			JOptionPane.showMessageDialog(null, "--Grau de Instrução invalido--");
			break;
		}
		
	}

}
