import javax.swing.JOptionPane;

/**
 * 
 * Desenvolva um algoritmo que realize a leitura de salário e nome de 50
 * funcionários. Os nomes e salários devem ser armazenados nos devidos vetores
 * respeitando o tipo de cada dado. Ao final um terceiro vetor de salários
 * reajustados deve ser apresentado ao usuário. O algoritmo deve ser
 * modularizado para que o vetor resultante seja apresentado em um procedimento
 * espeficifico para mostrar;
 *
 */
public class Caso04f {

	static String[] nome;
	static double[] salario;
	
	public static void main(String[] args) {

		nome = new String[2];
		salario = new double[nome.length];
		
		for (int i = 0; i < nome.length; i++) {
			
			nome[i] = JOptionPane.showInputDialog("Nome do funcionario");
			salario[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario"));
			
			
		}
		
		reajuste(salario);
		
	}

	private static void reajuste(double[] salario2) {

		double[] salarioNovo;
		
		salarioNovo = new double[salario2.length];
		
		for (int i = 0; i < salario2.length; i++) {
			salarioNovo[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite um novo salario para o funcionario " + nome[i]));
			
		}
		
		mostrar(salarioNovo);
		
	}

	private static void mostrar(double[] salarioNovo2) {
		for (int i = 0; i < salarioNovo2.length; i++) {
			System.out.println("Funcionario: " + nome[i] + "\nAntigo salario: " + salario[i] + "\nNovo Salario: " + salarioNovo2[i]);
		}
		
	}

}
