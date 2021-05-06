import javax.swing.JOptionPane;

/**
 * 
 * Faça um programa que peça um número inteiro e determine se ele é ou não um
 * número primo. Obs. Um número primo é aquele que é divisível somente por ele
 * mesmo e por 1.
 *
 */
public class Caso11 {
	//Falta terminar 
	static double n, nPrimo,  cont = 1;

	public static void main(String[] args) {
		
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de N"));
		
		while(cont <= n) {
			
			if(n % cont == 0){
				
				if (!(cont == 1) || !(cont == n)) {
					//
				}else {
				//	System.out.println("não é primo");
					nPrimo++;
				}
				
			}
			
			cont++;
			
		}
		
		if(nPrimo == 0) {
			System.out.println("O numero é primo");
		}
		
	}

}
