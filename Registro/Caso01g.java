import javax.swing.JOptionPane;

/**
 * 
 * Construa um algoritmo que armazene em um registro os dados de um diario de
 * classe, sendo eles: disciplina, data de inicio e término, qtde de alunos
 * matriculados. Ao final mostre os dados do diario criado.
 * 
 */
public class Caso01g {

	static class DiarioClasse {

		String disciplina, dataInicio, dataTermino;
		int alunosMatriculados;

	}

	public static void main(String[] args) {

		DiarioClasse diario = new DiarioClasse();

		diario.disciplina = JOptionPane.showInputDialog("Digite a disciplina");
		diario.dataInicio = JOptionPane.showInputDialog("Data Inicial");
		diario.dataTermino = JOptionPane.showInputDialog("Dara Termino");

		diario.alunosMatriculados = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de alunos"));

		System.out.println("Disciplina: " + diario.disciplina + "\nData Inicial: " + diario.dataInicio
				+ "\nData Final: " + diario.dataTermino + "\nQuantida de Alunos: " + diario.alunosMatriculados);

	}

}
