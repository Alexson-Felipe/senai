
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

	static class Prova {
		String dataRealizacao;
		double nota;
	}

	static class Aluno {
		String nome;
		int idade;
		Prova p1;
		
		Prova p2;
		Prova p3;

	}

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		Prova prova1 = new Prova();
		Prova prova2 = new Prova();
		Prova prova3 = new Prova();

		aluno.nome = JOptionPane.showInputDialog("Digite seu nome");
		aluno.idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade"));

		prova1.dataRealizacao = JOptionPane.showInputDialog("Digite quando a PRIMEIRA prova foi feita");
		prova1.nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da sua PRIMEIRA prova"));

		aluno.p1 = prova1;

		prova2.dataRealizacao = JOptionPane.showInputDialog("Digite quando a SEGUNDA prova foi feita");
		prova2.nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da sua SEGUNDA prova"));

		aluno.p2 = prova2;

		prova3.dataRealizacao = JOptionPane.showInputDialog("Digite quando a TERCEIRA prova foi feita");
		prova3.nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da sua TERCEIRA prova"));

		aluno.p3 = prova3;

		double mediaFinal = calculaMedia(aluno.p1.nota, aluno.p2.nota, aluno.p3.nota);

		System.out.println("Media do " + aluno.nome + " foi: " + mediaFinal);

	}

	private static double calculaMedia(double nota, double nota2, double nota3) {
		// TODO Auto-generated method stub

		double retornaMedia = (nota + nota2 + nota3) / 3;

		return retornaMedia;
	}

}
