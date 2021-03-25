import javax.swing.JOptionPane;

public class DecimoTerceiro {

	static String nome;
	static double salario, decimo;
	
	public static void main(String[] args) {
		
		nome = JOptionPane.showInputDialog("Digite o nome: ");
		salario = Double.parseDouble(JOptionPane.showInputDialog("Qual é seu salario: "));
		
		//Melhor forma sem muito processamento
		decimo = (salario * 2.15);
		
		JOptionPane.showMessageDialog(null, "O valor do seu décimo terceiro é: " + decimo);

	}

}
