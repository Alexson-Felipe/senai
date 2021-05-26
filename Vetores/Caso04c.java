import javax.swing.JOptionPane;

/**
 * 
 * Crie um algoritmo que leia dois vetores de números inteiros de 5 posições e
 * some o seu conteúdo armazenando. Ao final mostre o vetor resultante.
 *
 */

public class Caso04c {
	
	static int soma;
	static int[] valor1, valor2;

	public static void main(String[] args) {

		valor1 = new int[5];
		valor2 = new int[5];
		
		for (int i = 0; i < valor1.length; i++) {
				
			valor1[i] = Integer.parseInt(JOptionPane.showInputDialog("[Valor1] Digite o " + i + " º"));
			
		}
		
		for (int i = 0; i < valor2.length; i++) {
			
			valor2[i] = Integer.parseInt(JOptionPane.showInputDialog("[Valor2] Digite o " + i + " º"));
			 
		}
		
		for (int i = 0; i < valor1.length; i++) {
			soma += valor1[i] + valor2[i]; 
		}
		
		JOptionPane.showMessageDialog(null, "O valor total soma é de: " + soma);
		
		
	}

}
