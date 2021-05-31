import javax.swing.JOptionPane;

/**
 * 
 * Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um
 * vetor C, onde cada elemento de C é a multiplicação dos respectivos elementos
 * em A e B
 *
 */
public class Caso004c {

	static int[] vetorA, vetorB, vetorC;

	public static void main(String[] args) {
		
		vetorA = new int[10];
		vetorB = new int[vetorA.length];
		vetorC = new int[vetorA.length];
		
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de A na posição: " + i));
			vetorB[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de B na posição: " + i));
			vetorC[i] = vetorA[i] * vetorB[i];
			
			JOptionPane.showMessageDialog(null, "O valor de A é: " + vetorA[i] + "\nO valor de B é: " + vetorB[i] + "\n O valor de C é: " + vetorC[i]);
		}
		
	}

}
