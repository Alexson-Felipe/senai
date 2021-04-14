package AtiRevTop;

import javax.swing.JOptionPane;

public class Ati02 {

	static String nomeFunc;
	static char sexo;
	static double salario, reajuste;

	public static void main(String[] args) {

		nomeFunc = JOptionPane.showInputDialog("Digite o nome");
		sexo = JOptionPane.showInputDialog("Sexo F ou M").charAt(0);
		salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario:"));

		reajuste = salario * 0.28;

		JOptionPane.showMessageDialog(null, "Nome: " + nomeFunc + "\nSexo = " + sexo + "\nValor do reajuste = " + reajuste
				+ "\nSalario Total = " + (reajuste + salario));

	}

}
