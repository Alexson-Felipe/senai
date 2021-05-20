import javax.swing.JOptionPane;

public class Ativ09 {
	
	//programa tem que sair do loop quando digitar numero ngativo
	
	static double numero;
	static int g25, g50, g75, g100;

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			
			numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero"));
			
			if (numero == 0 && numero <= 25) {
				g25++;
			}else if(numero > 25 && numero <= 50){
				g50++;
			}else if(numero > 50 && numero <= 75){
				g75++;
			}else if(numero > 75 && numero <= 100){
				g100++;
			}
			
			//Falta terminar
			
		}

	}

}
