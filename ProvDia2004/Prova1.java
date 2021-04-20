import javax.swing.JOptionPane;

public class Prova1 {
	
	static String nome;
	static char sexo;
	static double salario, calcValorAcres, calcAposAcres;

	public static void main(String[] args) {
		
		nome = JOptionPane.showInputDialog("Digite o nome");
		sexo = JOptionPane.showInputDialog("M para Masculino \nF para Feminino").charAt(0);
		salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario"));
		
		calcValorAcres = salario * 0.08;
		calcAposAcres = salario * 1.08;
		
		JOptionPane.showMessageDialog(null,"Nome: " + nome + "\nSexo: " + sexo + "\nSalário Atual: " + salario + "\nValor do acréscimo: " + calcValorAcres + "\nSalário após o acréscimo: " + calcAposAcres);
		

	}

}
