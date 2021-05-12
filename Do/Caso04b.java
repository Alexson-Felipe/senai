import javax.swing.JOptionPane;

/*	
	Faça um programa que, para um
	número indeterminado de
	pessoas: leia a idade de cada
	uma, sendo que a idade 0 (zero)
	indica o fim da leitura e não deve
	ser considerada. A seguir calcule:
	• o número de pessoas;
	• a idade média do grupo;
	• a menor idade e a maior idade.
*/

public class Caso04b {

	static int idade, pessoas, idadeMaior, idadeMenor, controle;
	static double media, somaIdade;

	public static void main(String[] args) {

		do {
			idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));

			if (idade > idadeMaior) {
				idadeMaior = idade;
			}

			if (controle == 0) {
				idadeMenor = idade;
				controle++;
			}

			if (idade < idadeMenor && idade > 0) {
				idadeMenor = idade;
			}

			pessoas++;
			somaIdade += idade;
		} while (idade != 0);

		media = somaIdade / pessoas;
		JOptionPane.showMessageDialog(null, "O numero de pessoas foi: " + pessoas + "\nIdade Média: " + media
				+ "\nMenor Idade: " + idadeMenor + "\nMaior Idade: " + idadeMaior);
	}

}
