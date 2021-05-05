import javax.swing.JOptionPane;

public class Caso6 {

	static int produto, quant = 1;
	static double valor, somaValor;
	
	public static void main(String[] args) {
		
		produto = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de produtos"));
		
		
		while(quant <= produto) {
			
			valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do " + quant + "º produto"));
			
			somaValor += valor;
			
			quant++;
			
		}
		
		JOptionPane.showMessageDialog(null,"R$" + somaValor);

	}

}
