import javax.swing.JOptionPane;

/**
 * 
 * Desenvolva um programa que armazene em um registro as provas de um aluno,
 * sendo eles: data de realização e nota. Crie também outro registro, só que
 * armazenando os dados do aluno, sendo eles: nome, idade, primeira prova,
 * segunda prova e terceira prova. Ao final apresente a média simples do aluno.
 * Uma função deve ser utilizada para o calculo da média
 *
 */
public class Caso02g {

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
		ProvasAluno prova2 = new ProvasAluno();
		ProvasAluno prova3 = new ProvasAluno();

		ArmazenaDados armazena = new ArmazenaDados();

		prova.dataRealizacao = JOptionPane.showInputDialog("Digite a data da realização da prova");

		armazena.nome = JOptionPane.showInputDialog("Nome do aluno");
		armazena.idade = Integer.parseInt(JOptionPane.showInputDialog("Idade do aluno"));

		prova.nota = Double.parseDouble(JOptionPane.showInputDialog("Primeira nota"));
		prova2.nota = Double.parseDouble(JOptionPane.showInputDialog("Segunda nota"));
		prova3.nota = Double.parseDouble(JOptionPane.showInputDialog("Terceira nota"));

		armazena.primeiraProva = prova;
		armazena.segundaProva = prova2;
		armazena.terceiraProva = prova3;

		double CalcularMedia = calculaMedia(armazena.primeiraProva.nota, armazena.segundaProva.nota,
				armazena.terceiraProva.nota);

		System.out.println(CalcularMedia);
	}

	private static double calculaMedia(double nota, double nota2, double nota3) {
		return ((nota + nota2 + nota3) / 3);
	}

}
