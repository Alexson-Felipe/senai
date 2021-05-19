import javax.swing.JOptionPane;

public class Ativ04 {
	
	static double media;
	static int turma, quantidadeAlunos, somaAlunos, turmaMenor40;

	public static void main(String[] args) {
		
		turma = Integer.parseInt(JOptionPane.showInputDialog("Digite quantas turmas:"));
		
		for (int i = 0; i < turma; i++) {
			quantidadeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de Alunos"));
		
			if(quantidadeAlunos <= 40) {
				somaAlunos = quantidadeAlunos + somaAlunos;
				turmaMenor40++;
			}else {
				JOptionPane.showMessageDialog(null, "Quantidade de alunos é maior que 40");
			}
			
		}
		
		media = somaAlunos / turmaMenor40; 
		JOptionPane.showMessageDialog(null, "Media de alunos até 40 alunos é de: " + media);
		

	}

}
