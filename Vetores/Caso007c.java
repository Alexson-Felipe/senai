import javax.swing.JOptionPane;

/**
 * 
 * Faça um Programa que leia o nome e a idade dos alunos. Depois mostre o nome e
 * idade dos alunos que têm a idade maior que 18 anos e os que são menores de
 * idade.
 *
 */
public class Caso007c {

	static String[] nomeAluno, nomeDMaior, nomeDMenor;
	static int[] idadeAluno, dMenor, dMaior;
	static int quantidadeAlunos;

	public static void main(String[] args) {
		quantidadeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Quantos alunos? "));
		nomeAluno = new String[quantidadeAlunos];
		nomeDMaior = new String[quantidadeAlunos];
		nomeDMenor = new String[quantidadeAlunos];
		idadeAluno = new int[quantidadeAlunos];
		dMaior = new int[quantidadeAlunos];
		dMenor = new int[quantidadeAlunos];

		for (int i = 0; i < idadeAluno.length; i++) {
			nomeAluno[i] = JOptionPane.showInputDialog("Nome aluno " + i);
			idadeAluno[i] = Integer.parseInt(JOptionPane.showInputDialog("Idade aluno " + i));

			if (idadeAluno[i] < 18) {
				dMenor[i] = idadeAluno[i];
				nomeDMenor[i] = nomeAluno[i];
			}

			if (idadeAluno[i] >= 18) {
				dMaior[i] = idadeAluno[i];
				nomeDMaior[i] = nomeAluno[i];
			}

		}

		for (int i = 0; i < idadeAluno.length; i++) {
			JOptionPane.showMessageDialog(null, "Aluno de Maior: " + nomeDMaior[i] + "\nIdade: " + dMaior[i]
					+ "\nAluno de Menor: " + nomeDMenor[i] + "\nIdade: " + dMenor[i]);
		}

	}

}
