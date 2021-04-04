package JOp;
import javax.swing.JOptionPane;

public class rendimento {

	static String nome;
	static double salario, caixa, bb;
	
	public static void main(String[] args) {
		
		nome = JOptionPane.showInputDialog("Digite o nome");
		salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salrio"));
		caixa = salario * 0.02 + salario;
		bb = salario * 0.03 + salario;
		
		JOptionPane.showMessageDialog(null, "Rendimentos na caixa: " + caixa + "\nRendimentos no BB: " + bb);

	}

}
