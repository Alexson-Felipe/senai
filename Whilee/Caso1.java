import javax.swing.JOptionPane;

public class Caso1 {
	
	static int n, cont = 1;
	static double resto, result;

	public static void main(String[] args) {
		
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));
		
		
		//comparação
		while(cont <= n) {
			
			//faz o calculo para pegar o resto da divisão
			resto = n % 3;
			result += resto;
			
			//incrementa a variavel cont para que uma hora saia do loop
			cont++;
			System.out.println(result);
		
		}
		
		JOptionPane.showMessageDialog(null, "Resultado da soma do resto da divisão 3 é: " + result);

	}

}
