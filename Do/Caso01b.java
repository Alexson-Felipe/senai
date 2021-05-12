import javax.swing.JOptionPane;

public class Caso01b {

	static int numero, cont = 1;
	static double resto, resultado;
	
	public static void main(String[] args) {
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		
		do {
			
			resto = cont % 3;
			resultado += resto;
			
			cont++;
			
			System.out.println("Cont: " + cont + " Resto: " + resto + "Resultado" + resultado);
			
		}while(cont <= numero);
		

	}

}
