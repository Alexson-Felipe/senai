import javax.swing.JOptionPane;

public class Ativ08 {

	static int primo, contRest;
	static double resto;

	public static void main(String[] args) {

		primo = Integer.parseInt(JOptionPane.showInputDialog("Quais numeros são primos, entre: "));

		for (int i = 1; i <= primo; i++) {
			for (int j = 1; j <= i; j++) {
				resto = i % j;

				if (resto == 0) {
					//System.out.println("Entrou");
					contRest++;
				}
			
			
			}
			
			if(contRest == 2) {
				System.out.println(i + " é Primo");
			}else {
				System.out.println(i + " não é Primo");
			}
			
			contRest = 0;
		}

	}
}
