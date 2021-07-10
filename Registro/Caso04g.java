import javax.swing.JOptionPane;

/**
 * 
 * Uma pessoa cadastrou um conjunto de 15 registros contendo o nome da loja,
 * telefone e preço de um eletrodoméstico. Desenvolver um algoritmo que permita
 * exibir qual foi a média dos preços cadastrados e uma relação contendo o nome
 * e o telefone das lojas cujo preço estava abaixo da média.
 *
 */
public class Caso04g {

	static Registro[] loja;
	static Registro novaLoja;
	static double media;

	static class Registro {
		String nomeLoja;
		int telefone;
		double precoEletro;
	}

	public static void main(String[] args) {

		loja = new Registro[3];

		for (int i = 0; i < loja.length; i++) {
			novaLoja = new Registro();

			novaLoja.nomeLoja = JOptionPane.showInputDialog("Digite o nome da loja");
			novaLoja.telefone = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de telefone"));
			novaLoja.precoEletro = Double.parseDouble(JOptionPane.showInputDialog("Preço de um produto"));

			loja[i] = novaLoja;

			media += novaLoja.precoEletro;
			if (i == loja.length - 1) {
				mediaPreco();
			}

		}
	}

	private static void mediaPreco() {
		media /= loja.length;

		for (int i = 0; i < loja.length; i++) {

			if (media > loja[i].precoEletro) {
				System.out.println("A média é: " + media + "\nA loja: " + loja[i].nomeLoja
						+ "\n Está abaixo da média: " + loja[i].precoEletro);
			}
		}

	}

}
