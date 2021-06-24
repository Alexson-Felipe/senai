import javax.swing.JOptionPane;

/**
 * 
 * Desenvolva um programa que leia o nome de 10 alunos, após ler esses nomes
 * você deve mostrar a quantidade de nomes que iniciam com vogais e quantos
 * iniciam com consoantes. Os nomes solicitados devem ser armazenados em um
 * vetor.
 * 
 */
public class Ativ02e {

	static String[] nomeAluno;
	static String vogaisOuConsoantes;

	public static void main(String[] args) {

		nomeAluno = new String[10];

		for (int i = 0; i < nomeAluno.length; i++) {

			nomeAluno[i] = JOptionPane.showInputDialog("Digite o nome do Aluno " + i);

		}

		vogaisOuConsoantes = vOuCon(nomeAluno);

		System.out.println(vogaisOuConsoantes);

	}

	private static String vOuCon(String[] nomeAluno2) {

		int contVo = 0;
		int contCo = 0;

		for (int i = 0; i < nomeAluno2.length; i++) {
			nomeAluno2[i] = nomeAluno2[i].toUpperCase();
			switch (nomeAluno2[i].charAt(0)) {
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				contVo++;
				break;

			default:
				contCo++;
				break;
			}
		}

		String quantidade = ("Começa Com Vogal: " + contVo + "\nComeça Com Consoante: " + contCo);

		return quantidade;
	}

}
