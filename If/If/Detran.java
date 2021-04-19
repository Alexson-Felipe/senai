package If;

/*
 * 
 * Num determinado estado, para tranferencia de veiculos, o Detran cobra
 * uma taxa de 1% para carros fabricados antes de 1990 e uma taxa de 1.5%
 * para os fabricados de 1990 em diantre, tal taxa é aplicada sobre o valor
 * de tabela do carro. Faça um algoritmo que lê o ano e o preço do carro
 * e a seguir calcule e imprime imposto a ser pago.
 * 
 */

import javax.swing.JOptionPane;

public class Detran {
	
	static int anoFabricado;
	static double preco, calculo;

	public static void main(String[] args) {
		
		anoFabricado = Integer.parseInt(JOptionPane.showInputDialog("Qual o ano de fabricação"));
		preco = Double.parseDouble(JOptionPane.showInputDialog("Preço do veiculo"));
		
		if(anoFabricado <= 1990) {
			
			calculo = preco * 0.01;
			
		}else {
			
			calculo = preco * 0.015;
		}
		
		JOptionPane.showMessageDialog(null, "Preço da taxa do Detran " + calculo);

	}

}
