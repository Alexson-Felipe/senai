package Exe23;
import javax.swing.JOptionPane;

public class Gasolina {

	public static void main(String[] args) {
		
		double preco, valorAbastecido, calculo;
		
		preco = Double.parseDouble(JOptionPane.showInputDialog("Preço da gasolina:"));
		valorAbastecido = Double.parseDouble(JOptionPane.showInputDialog("Valor abastecido:"));
		
		calculo = valorAbastecido / preco;
		
		JOptionPane.showMessageDialog(null, String.format("%.2f lt Quantidades", calculo));

	}

}
