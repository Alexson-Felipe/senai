import javax.swing.JOptionPane;

/**
 * 
 * Dados os seguintes campos de um registro: nome, telefone, dia de aniversário
 * e mês de aniversário, desenvolver um programa que mostre em um dado mês do
 * ano, quem são as pessoas que fazem aniversário, exibir também o dia.
 * Considere um conjunto de 50 pessoas.
 *
 */
public class Caso03g {

	static Registro[] pessoa;
	static Registro novaPessoa;

	static class Registro {
		String nome;
		int telefone, diaAniversario, mesAniversario;
	}

	public static void main(String[] args) {
		pessoa = new Registro[2];

		for (int i = 0; i < pessoa.length; i++) {
			novaPessoa = new Registro();
			novaPessoa.nome = JOptionPane.showInputDialog("Digite o nome");
			novaPessoa.telefone = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de telefone"));
			novaPessoa.diaAniversario = Integer.parseInt(JOptionPane.showInputDialog("Dia do Aniversario"));
			novaPessoa.mesAniversario = Integer.parseInt(JOptionPane.showInputDialog("Mês Aniversario"));

			pessoa[i] = novaPessoa;

		}
		pesquisaPessoa();

	}

	private static void pesquisaPessoa() {

		int pesquisa = Integer.parseInt(JOptionPane.showInputDialog("Quem faz aniversario no mês? Digite o mês"));

		for (int i = 0; i < pessoa.length; i++) {
			if (novaPessoa.mesAniversario == pesquisa) {
				System.out.println("Pessoa: " + pessoa[i].nome + "\nNumero: " + pessoa[i].telefone
						+ "\nDia Aniversario: " + pessoa[i].diaAniversario + "\nMês Aniversario: " + pessoa[i].mesAniversario);
			}
		}

	}

}
