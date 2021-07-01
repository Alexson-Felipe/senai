import javax.swing.JOptionPane;

/**
 * 
 * Construa um algoritmo que realize uma das quatro operações matemáticas sobre
 * dois números decimais positivos. O usuário deve fazer uso de um menu para
 * selecionar qual operação deseja realizar, e após informar os números, o
 * resultado deve ser apresentado. O algoritmo deve ser modularizado em 4
 * procedimentos além do algoritmo principal
 *
 */
public class Caso01f {
	
	static char opMat;
	static double valor1, valor2, resultado;

	public static void main(String[] args) {
		
		valor1 = Double.parseDouble(JOptionPane.showInputDialog("Valor 1"));
		valor2 = Double.parseDouble(JOptionPane.showInputDialog("Valor 2"));
		
		opMat = JOptionPane.showInputDialog("1 - Adição\n2 - Subtração\n3 - Multiplicação\n4 - Divisão").charAt(0);
		
		opMat();
		
	}

	private static void opMat() {
		

		switch (opMat) {
		case '1':
			resultado = valor1 + valor2;
			System.out.println("O Resultado da soma é: " + resultado);
			break;
		case '2':
			resultado = valor1 - valor2;
			System.out.println("O Resultado da subtração é: " + resultado);
			break;
		case '3':
			resultado = valor1 * valor2;
			System.out.println("O Resultado da multiplicação é: " + resultado);
			break;
		case '4':
			resultado = valor1 / valor2;
			System.out.println("O Resultado da divisão é: " + resultado);
			break;
		default:
			System.out.println("EQUAÇÃO INVALIDA");
			break;
		}
		
	}

}
