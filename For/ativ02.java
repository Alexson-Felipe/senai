import javax.swing.JOptionPane;

public class Ativ02 {

	static int numero, cont1, cont2;

	public static void main(String[] args) {
		
		for (int i = 0; i < 4; i++) {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
			
			if (numero >= 0 && numero <= 50) {
				cont1++;
			}else if(numero >= 51 && numero <= 100) {
				cont2++;
			}
			 
			JOptionPane.showMessageDialog(null, "Numero intervalo 0 a 50  = " + cont1 + "\nNumero intervalo 51 a 100 = " + cont2);

		}

	}

}
