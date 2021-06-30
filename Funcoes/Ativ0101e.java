import javax.swing.JOptionPane;

/**
 * 
 * Escreva um programa que leia as medidas dos lados de um triângulo e retorne
 * se ele é: Equilátero, Isósceles ou Escaleno. Os tamanhos dos lados devem ser
 * passados por parâmetro e a função deve retornar o tipo de triângulo. Regras:
 * 
 * Triângulo Equilátero: possui os 3 lados iguais. 
 * Triângulo Isóscele: possui 2 lados iguais. 
 * Triângulo Escaleno: possui 3 lados diferentes.
 *
 */


//duvida de como retornar valor

public class Ativ0101e {
	
	static int[][] ladosTriangulo;
	static String triangulo; 

	public static void main(String[] args) {

		ladosTriangulo = new int[1][3];
		
		
		for (int i = 0; i < ladosTriangulo.length; i++) {
			
			ladosTriangulo[i][0] = Integer.parseInt(JOptionPane.showInputDialog("Digite o lado A triangulo"));
			ladosTriangulo[i][1] = Integer.parseInt(JOptionPane.showInputDialog("Digite o lado B triangulo"));
			ladosTriangulo[i][2] = Integer.parseInt(JOptionPane.showInputDialog("Digite o lado C triangulo"));
			
			triangulo = tipoTringulo(ladosTriangulo[i][0], ladosTriangulo[i][1], ladosTriangulo[i][2]); 
			
		}
		
		System.out.println(triangulo);
		
	}

	private static String tipoTringulo(int a, int b, int c) {
		
		String tipo;
		
		if(a == b && a == c) {
			tipo = "Equilátero";
		}else if(a != b && a != c){
			tipo = "Escaleno";
		}else {
			tipo = "Isóscele";
		}
		return tipo;
	}

}
