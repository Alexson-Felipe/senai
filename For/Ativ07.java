import javax.swing.JOptionPane;

public class Ativ07 {
	
	static int primo, contRest;
	static double resto;

	public static void main(String[] args) {
		
		primo = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para ver se ele é primo: "));
		
		for (int i = 1; i <= primo; i++) {
			
			resto = primo % i;
			
			if(resto == 0) {
				System.out.println("Entrou");
				contRest++;
			}
			
			//System.out.println(primo + "/" + "= " +resto);
		}
		
		if(contRest == 2) {
			System.out.println("O numero " + primo + "é PRIMO");
		}else {
			System.out.println("O numero " + primo + "não é PRIMO");
		}

	}

}
