import javax.swing.JOptionPane;

public class Caso4 {

	static int numeroPessoas, idade, maiorIdade, menorIdade;
	static double somaIdade, idadeMedia;

	public static void main(String[] args) {
		
		//falta terminar

		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade de cada pessoa: "));
		menorIdade = idade;

		while (idade > 0) {

			numeroPessoas++;
			somaIdade = somaIdade + idade;

			if (idade > maiorIdade) {
				maiorIdade = idade;
			} 
			if (idade < menorIdade) {
				menorIdade = idade;
			}
			idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade de cada pessoa: "));

		}

		idadeMedia = somaIdade / numeroPessoas;

		JOptionPane.showMessageDialog(null, "Numero de pessaos");

	}

}
