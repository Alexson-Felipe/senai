package AtiRevTop;

import javax.swing.JOptionPane;

public class Ati15 {

	static int idade;
	static double peso, calc;

	public static void main(String[] args) {


		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
		peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso"));

		if (idade >= 12 && peso >= 60) {
			JOptionPane.showMessageDialog(null, "Toma 1ml, o paciente toma 40 gotas");
		} else if (idade >= 12 && peso < 60) {
			// calc = 20 /500 = 0,04;
			calc = 750 * 0.04;
			JOptionPane.showMessageDialog(null, "Toma 750mg " + calc + " Gostas");
		} else if (idade < 12 && peso >= 5 && peso <= 9) {
			calc = 125 * 0.04;
			JOptionPane.showMessageDialog(null, "Toma 125mg " + calc + " Gostas" );
		} else if (idade < 12 && peso >= 9.1 && peso <= 16) {
			calc = 250 * 0.04;
			JOptionPane.showMessageDialog(null, "Toma 250mg " + calc + " Gostas");
		} else if (idade < 12 && peso >= 16.1 && peso <= 24) {
			calc = 375 * 0.04;
			JOptionPane.showMessageDialog(null, "Toma 375mg " + calc + " Gostas");
		} else {
			calc = 500 * 0.04;
			JOptionPane.showMessageDialog(null, " Peso acima de 24kg Toma 500mg " + calc + " Gostas");
		}

	}

}
