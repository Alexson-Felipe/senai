import javax.swing.JOptionPane;

/**
 * 
 * Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo
 * tipo e tamanho, sendo que cada elemento do vetor B deverá ser o quadrado do
 * respectivo elemento de A.
 *
 */

public class Caso002c {
	
	static int[] elementoA, elementoB;

	public static void main(String[] args) {

		elementoA = new int[15];
		elementoB = new int[elementoA.length];
		
		for (int i = 0; i < elementoA.length; i++) {
			elementoA[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor na posição " + i));
			elementoB[i] = elementoA[i] * elementoA[i]; 
		}
		
		for (int i = 0; i < elementoA.length; i++) {
			JOptionPane.showMessageDialog(null, "Elemento A: " + elementoA[i] + "\nElementoB ao quadrado: " + elementoB[i]);
		}
		
	}

}
