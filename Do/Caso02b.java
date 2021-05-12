import javax.swing.JOptionPane;

/*
 * Construa um algoritmo que apresente um menu de opções ao usuário de acordo com a imagem abaixo
 * Escreva o algoritmo dessa calculadora, Caso a opção seja inválida, o menu deve ser fechado.
 */
public class Caso02b {

	static int cont, numero, eq, calc;

	public static void main(String[] args) {

		do {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
			eq = Integer.parseInt(JOptionPane.showInputDialog("Selecione a operação automatica" + "\n1 - Adição"
					+ "\n2 - Subtração" + "\n3 - Multiplicação" + "\n4 - Divisão"));

			switch (eq) {
			case 1:
				calc = numero + numero;
				JOptionPane.showMessageDialog(null, "A soma de " + numero + " mais ele mesmo é igual " + calc);
				break;
			case 2:
				calc = numero - numero;
				JOptionPane.showMessageDialog(null, "A subtração de " + numero + " menos ele mesmo é igual " + calc);
				break;
			case 3:
				calc = numero * numero;
				JOptionPane.showMessageDialog(null, "A multiplicação de " + numero + " vezes ele mesmo é igual " + calc);
				break;
			case 4:
				calc = numero / numero;
				JOptionPane.showMessageDialog(null, "A divisão de " + numero + " dividio por ele mesmo é igual " + calc);
				break;
			default:

				JOptionPane.showMessageDialog(null, "Opção Invalida");
				break;
			}

		} while (eq > 0 && eq <= 4);
	}

}
