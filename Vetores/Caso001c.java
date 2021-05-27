import javax.swing.JOptionPane;

/**
 * 
 * Faça um Programa que leia 20 números inteiros e armazene-os num vetor.
 * Armazene os números pares no vetor PAR e os números ímpares no vetor IMPAR.
 * Mostre três vetores.
 *
 */
public class Caso001c {

	static int[] numerosPares, numerosImpares, valores;

	public static void main(String[] args) {

		valores = new int[20];
		numerosPares = new int[valores.length];
		numerosImpares = new int[valores.length];

		for (int i = 0; i < valores.length; i++) {
			valores[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor na posição " + i));
			
			if(valores[i] % 2 == 0) {
				numerosPares[i] = valores[i]; 
			}else {
				numerosImpares[i] = valores[i];
			}
			
		}
		
		for (int i = 0; i < valores.length; i++) {
			JOptionPane.showMessageDialog(null, "Valores: " + valores[i] + "\nNumeros Pares: " + numerosPares[i] + "\nNumeros Impares: " + numerosImpares[i]);
		}
		
	}

}
