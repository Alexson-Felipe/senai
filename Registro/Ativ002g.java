import javax.swing.JOptionPane;

/**
 * 
 * Desenvolva um programa que gerencie as notas de uma disciplina. O registro de
 * disciplina precisa armazenar os seguintes dados: nome do aluno, frequencia do
 * aluno (numero inteiro), media da nota na disciplina. O programa deve permitir
 * o cadastro de 10 alunos. Depois do cadastro o sistema deve apresentar um menu
 * com as seguintes opcoes.
 * 
 * 1 - Relatorio de todos os alunos com seus respectivos dados;
 * 2 - Relatorio de alunos aprovados; 
 * 			Regra: media da nota maior ou igual 7 e frequencia maior ou igual a 70%;
 * 
 * 3 - Relatorio de alunos reprovados por nota; 
 * 			Regra: media da nota menor que 7 e frequencia maior ou igual a 70%;
 * 
 * 4 - Relatorio de alunos reprovados por frequencia; 
 * 			Regra: media da nota maior ou igual 7 e frequencia menor que 70%;
 * 
 * 5 - Relatorio com a quantidade de alunos aprovados e reprovados; 
 * 			Mostrar o total arrecadado com o valor das entregas
 * 
 * 6 - Fechar programa Essas opcoes devem ser realizadas atraves de procedimentos.
 *
 */
public class Ativ002g {
	
	static Disciplina[] nota;
	static Disciplina novaNota;
	static int menu;
	
	static class Disciplina{
		
		String nomeAluno;
		int freqAluno;
		double mediaDisc;
		
	}

	public static void main(String[] args) {
		nota = new Disciplina[1];
		
		for (int i = 0; i < nota.length; i++) {
			novaNota = new Disciplina();
			
			novaNota.nomeAluno =  JOptionPane.showInputDialog("Digite o nome do Aluno");
			novaNota.freqAluno = Integer.parseInt(JOptionPane.showInputDialog("Qual e a frequencia"));
			novaNota.mediaDisc = Double.parseDouble(JOptionPane.showInputDialog("Media da nota na disciplina"));
			
		}
		
		do {
			
			menu = 0;
			
			int menu = Integer.parseInt(JOptionPane.showInputDialog("1 - Relatorio de todos os alunos com seus respectivos dados"
					+ "\n2 - Relatorio de alunos aprovados"
					+ "\n3 - Relatorio de alunos reprovados por nota"
					+ "\n4 - Relatorio de alunos reprovados por frequencia"
					+ "\n5 - Relatorio com a quantidade de alunos aprovados e reprovados"
					+ "\n6 - Sair"));
			
			if (menu >= 1 && menu <= 6) {
				relatorio(menu);
			}else {
				menu = 1;
			}
			
		} while (menu > 0 && menu != 6);
		
		
	}

	private static void relatorio(int menu2) {
		// TODO Auto-generated method stub
		
	}

}
