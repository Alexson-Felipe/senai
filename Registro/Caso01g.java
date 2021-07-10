
import javax.swing.JOptionPane;

public class Caso01g {
	static class DiarioClasse {

		String disciplina;
		String dataInicio;
		String dataFinal;
		int quantidadeAlunos;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DiarioClasse diario = new DiarioClasse();

		diario.disciplina = JOptionPane.showInputDialog("Disciplina");
		diario.dataInicio = JOptionPane.showInputDialog("Data Inicio");
		diario.dataFinal = JOptionPane.showInputDialog("Data Final");
		diario.quantidadeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de alunos"));

		System.out.println("Dados do diario");
		System.out.println("Disciplina: " + diario.disciplina);
		System.out.println("Data Inicio: " + diario.dataInicio);
		System.out.println("Data Final: " + diario.dataFinal);
		System.out.println("Quantidade de Alunos: " + diario.quantidadeAlunos);

	}

}
