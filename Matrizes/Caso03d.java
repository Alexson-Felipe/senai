import javax.swing.JOptionPane;

public class Caso03d {
	
	static int[][] matriz;
	static int soma;

	public static void main(String[] args) {
		
		matriz = new int[4][4];
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite os valores " + i));
			}
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				soma += matriz[i][j];
				System.out.println(i + " " + j +"  : "+ soma);
			}
			
			
		}

	}

}
