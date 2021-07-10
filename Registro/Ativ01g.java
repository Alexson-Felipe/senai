import javax.swing.JOptionPane;

/**
 * 
 * Desenvolva um programa para ler os seguintes dados do registro dos
 * funcionários: matrícula(valor inteiro), nome e o turno que ele trabalha
 * (matutino, vespertino e noturno). O programa deve permitir o cadastro de 10
 * funcionários. Após o cadastro monte um procedimento que vai ser responsável
 * em realizar a pesquisa pelo nome da pessoa, o termo pesquisado deve ser
 * passado por parâmetro. A pesquisa deve ser feita pela inicio do nome do
 * funcionário, apresentando todos os registros que iniciam com o termo
 * pesquisado.
 *
 */
public class Ativ01g {

	static Registro[] funcionario;
	static Registro novoFuncionario;
	static String pesquisa;

	static class Registro {
		int matricula;
		String nome;
		char turno;
	}

	public static void main(String[] args) {

		funcionario = new Registro[1];

		for (int i = 0; i < funcionario.length; i++) {

			novoFuncionario = new Registro();

			novoFuncionario.matricula = Integer.parseInt(JOptionPane.showInputDialog("Digite o nº da matricula"));
			novoFuncionario.nome = JOptionPane.showInputDialog("Digite o nome do funcionario");
			novoFuncionario.turno = JOptionPane.showInputDialog("M = Matutino\nV = Vespertino\nN = Noturno")
					.toUpperCase().charAt(0);
			
			funcionario[i] = novoFuncionario;
			
			if (i == funcionario.length - 1) {
				
				pesquisa = JOptionPane.showInputDialog("Digite o inicio de um nome para pesquisar");
				String pes = pesquisando(funcionario);
				System.out.println(pes);
				
			}

		}

	}

	private static String pesquisando(Registro[] nome) {
		String nomeFunc = "NÃO EXISTE PESSOA COM ESSE NOME";
		
		for (int i = 0; i < funcionario.length; i++) {
			if (nome[i].nome.startsWith(pesquisa)) {
				nomeFunc = nome[i].nome;
			}
		}
		
		return nomeFunc;
	}

}
