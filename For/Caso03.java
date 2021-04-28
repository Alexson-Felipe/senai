import javax.swing.JOptionPane;

public class Caso03 {

	//Isso faz eu perder cabelo.
	
	/*
	 * Construa um algoritmo para calcular
	 * um VALOR e um EXPOENTE. Os valores de VALOR e EXPOENTE
	 * devem ser lidos do usuario. Ao final apresentar o seu valor.
	 * 
	 * Não utilizar Math.pow
	 * 
	 */
	static double valor, expoente, resultado;

	public static void main(String[] args) {

		valor = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor"));
		expoente = Double.parseDouble(JOptionPane.showInputDialog("Digite um expoente"));

		resultado = 1;
		for (int i = 1; i <= expoente; i++) {

			resultado = valor * resultado;

			JOptionPane.showMessageDialog(null, resultado);

		}

	}

}
