import javax.swing.JOptionPane;

/**
 * 
 * Desenvolva um programa que armazene em um registro as provas de um aluno,
 * sendo eles: data de realiza��o e nota. Crie tamb�m outro registro, s� que
 * armazenando os dados do aluno, sendo eles: nome, idade, primeira prova,
 * segunda prova e terceira prova. Ao final apresente a m�dia simples do aluno.
 * Uma fun��o deve ser utilizada para o calculo da m�dia
 *
 */
public class Caso02g {

	static double CalcularMedia;

	static class ProvasAluno {
		String dataRealizacao;
		double nota;

	}

	static class ArmazenaDados {
		String nome;
		ProvasAluno primeiraProva, segundaProva, terceiraProva;

		int idade;

	}

	public static void main(String[] args) {

		ProvasAluno prova = new ProvasAluno();
		ArmazenaDados dados = new ArmazenaDados();

		prova.dataRealizacao = JOptionPane.showInputDialog("Digite a data da realiza��o da prova");

		dados.nome = JOptionPane.showInputDialog("Nome do aluno");
		dados.idade = Integer.parseInt(JOptionPane.showInputDialog("Idade do aluno"));
		
//Rever isso -- ta errado
		dados.primeiraProva.nota = Double.parseDouble(JOptionPane.showInputDialog("Primeira nota"));
		dados.segundaProva.nota = Double.parseDouble(JOptionPane.showInputDialog("Segunda nota"));
		dados.terceiraProva.nota = Double.parseDouble(JOptionPane.showInputDialog("Terceira nota"));

		CalcularMedia = calculaMedia(dados.primeiraProva.nota, dados.segundaProva.nota, dados.terceiraProva.nota);

		System.out.println(CalcularMedia);
	}

	private static double calculaMedia(double nota, double nota2, double nota3) {
		// TODO Auto-generated method stub
		return ((nota + nota2 + nota3) / 3);
	}

}
