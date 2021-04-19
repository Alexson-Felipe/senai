package If;

import javax.swing.JOptionPane;

public class VendaProdutos {
	
	static double precoProduto, lucro;

	public static void main(String[] args) {
		
		precoProduto = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto"));
		
		if ((precoProduto > 0) && (precoProduto <=30)) {
			lucro = precoProduto * 0.2;
		}else if((precoProduto > 30) && (precoProduto <= 40)) {
			lucro = precoProduto * 0.15;
		}else {
			lucro = precoProduto * 0.1;
		}
		JOptionPane.showMessageDialog(null, "O lucro é de " + lucro);
	}

}
