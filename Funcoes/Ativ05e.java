import javax.swing.JOptionPane;

public class Ativ05e {
	
	static double[] vendas;

	public static void main(String[] args) {
		
		vendas = new double[5];
		
		for (int i = 0; i < vendas.length; i++) {
			
			vendas[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor dessa venda"));
			
			verificaTroco(vendas[i]);
				
		}

	}

	private static void verificaTroco(double valor) {
		
		double valorParaCima =  Math.ceil(valor);
		double troco = valorParaCima - valor;
		
		System.out.println("A venda foi: " + valor + " Troco de moedas " + troco);
		
	}

}
