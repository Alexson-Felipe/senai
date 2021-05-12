import javax.swing.JOptionPane;

//Faça um algoritmo que some o total
//de uma compra. O usuário deverá
//informar a quantidade de produtos
//e o sistema deverá realizar a soma
//desses produtos.

public class Caso06b {
	
	static int quantidade, cont = 1;
	static double valor, soma;

	public static void main(String[] args) {
		
		quantidade = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade de produtos?"));
		
		do {
			valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor o produto"));
			soma += valor;
			cont++;
		}while(cont <= quantidade);
		
		JOptionPane.showMessageDialog(null, String.format("A quantidade de produtos é: " + quantidade + "\nO valor total é de: R$%.2f", soma));
	   
	}

}
