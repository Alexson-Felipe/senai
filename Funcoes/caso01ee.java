import javax.swing.JOptionPane;

public class caso01ee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double n1, n2, resultado = 0;

		n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do numero 1"));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do numero 2"));

		int menu = Integer.parseInt(JOptionPane.showInputDialog(
				"Digite: \n" + "1 - Adição \n" + "2 - Subtração \n"
						+ "" + "3 - Divisão \n" + "4 - Multiplicação"));

		switch (menu) {
		case 1:
			resultado = adicao(n1, n2);
			break;
		case 2:
			resultado = subtracao(n1, n2);
			break;
		case 3:
			resultado = divisao(n1, n2);
			break;
		case 4:
			resultado = multiplicacao(n1, n2);
			break;
		}

		JOptionPane.showMessageDialog(null, "resultado: " + resultado);
	}

	/*
	 *Função utilizada para multplicacao  
	 */
	private static double multiplicacao(double n1, double n2) {
		// TODO Auto-generated method stub
		double retorno = n1 * n2;
		return retorno;
	}

	private static double divisao(double n1, double n2) {
		// TODO Auto-generated method stub
		double retorno = n1 / n2;
		return retorno;
	}

	private static double subtracao(double n1, double n2) {
		// TODO Auto-generated method stub
		double retorno = n1 - n2;

		return retorno;
	}

	private static double adicao(double n1, double n2) {

		double retorno = n1 + n2;

		return retorno;
	}

}
