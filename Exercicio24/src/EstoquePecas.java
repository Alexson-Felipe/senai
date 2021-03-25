import javax.swing.JOptionPane;

public class EstoquePecas {
	
	static double quantidadeMinima, quantidadeMaxima, estoque;

	public static void main(String[] args) {
		
		quantidadeMaxima = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade maxima"));
		quantidadeMinima = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade minima"));
		
		estoque = (quantidadeMinima + quantidadeMaxima) / 2;
		
		JOptionPane.showMessageDialog(null, estoque);

	}

}
