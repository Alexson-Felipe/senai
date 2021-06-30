import javax.swing.JOptionPane;

public class Ativ0105e {

	static double[] vendas;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		vendas = new double[5];

		for (int i = 0; i < vendas.length; i++) {

			vendas[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o total dessa venda"));

			verificaTroco(vendas[i]);
		}

	}

	private static void verificaTroco(double valor) {
		// TODO Auto-generated method stub

		double valorParaCima = Math.ceil(valor);

		double troco = valorParaCima - valor;

		System.out.println("Venda: " + valor + ". Troco de moedas: " + troco);

	}

}
