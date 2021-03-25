import javax.swing.JOptionPane;

public class ConversorDinheiro {
	
	static double real, dolar, euro;

	public static void main(String[] args) {
		
		real = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em reais: "));
		
		dolar = real / 5.64;
		euro = real / 6.66;
		
		JOptionPane.showMessageDialog(null, "Reais para Dolar: " + dolar + "\nReais para Euro: " + euro);

	}

}
