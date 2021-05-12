import javax.swing.JOptionPane;

//Faça um programa que imprima na
//tela apenas os números ímpares
//entre 1 e 50.

public class Caso08b {

	static int cont;
	public static void main(String[] args) {

		do {
			
			if(cont % 2 == 1) {
				JOptionPane.showMessageDialog(null, cont + " é impar");
			}
			cont++;
		}while(cont <= 50);
		

	}

}
