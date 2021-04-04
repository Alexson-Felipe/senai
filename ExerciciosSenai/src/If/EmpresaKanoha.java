package If;

import javax.swing.JOptionPane;

public class EmpresaKanoha {

	static double horasTrabalhadas, horas, salarioBruto, salarioLiquido;
	static int gerente;

	public static void main(String[] args) {

		horas = Double.parseDouble(JOptionPane.showInputDialog("Quantas horas trabalhou"));
		gerente = Integer.parseInt(JOptionPane.showInputDialog("É gerente? 1 = Sim 0 = Não"));

		// Verifica se o funionario fez hora extra.

		if (horasTrabalhadas > 8) {

			salarioBruto = ((horasTrabalhadas - 8) * 15) + 80;

		} else {

			salarioBruto = horasTrabalhadas * 10;
		}

		// Verifica se é gerente

		if (gerente == 1) {
			salarioBruto = salarioBruto * 1.25;
		}

		salarioLiquido = salarioBruto - (salarioBruto * 0.10);

		JOptionPane.showMessageDialog(null,
				"Seu salario bruto é: " + salarioBruto + "\nSalario Liquido: " + salarioLiquido);

	}
}