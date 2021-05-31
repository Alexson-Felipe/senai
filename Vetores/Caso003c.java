import javax.swing.JOptionPane;

/**
 * 
 * Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo
 * tipo e tamanho, sendo que cada elemento do vetor B deverá ser o respectivo
 * elemento de A multiplicado por sua posição
 *
 */
public class Caso003c {
	
	static int[] elementoA, elementoB;
 
	public static void main(String[] args) {
		
		elementoA = new int[10];
		elementoB = new int[elementoA.length];
		
		for (int i = 0; i < elementoA.length; i++) {
			elementoA[i] = Integer.parseInt(JOptionPane.showInputDialog("Valor do elemento A na posição: " + i));
			elementoB[i] = elementoA[i] * i;	
			
			JOptionPane.showMessageDialog(null, "O valor de A é: " + elementoA[i] + "\nO valor de B é: " + elementoB[i]);
		}

	}

}
