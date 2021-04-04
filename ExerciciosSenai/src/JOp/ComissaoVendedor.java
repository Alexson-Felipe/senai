package JOp;
import javax.swing.JOptionPane;

public class ComissaoVendedor {

	static String nome;
	static int total;
	static double calculo;
	
	public static void main(String[] args) {
		
		nome = JOptionPane.showInputDialog("Digite o nome: ");
		total = Integer.parseInt(JOptionPane.showInputDialog("Total de vendas: "));
		
		calculo = total * 0.05;
		
		JOptionPane.showMessageDialog(null, "Olá " + nome + ", " + "sua comissão nesse mês foi de: R$ " + calculo);
	}

}
