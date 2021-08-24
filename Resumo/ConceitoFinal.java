import javax.swing.JOptionPane;

public class ConceitoFinal {

	public static void main(String[] args) {
		
		char opcao = JOptionPane.showInputDialog("Digite - A B C D E F O I").toUpperCase().charAt(0);
		
		switch (opcao) {
		case 'A':
			System.out.println("Desempenho excepcional");
			break;
		case 'B':	
			System.out.println("Bom desempenho");
			break;
		case 'C':	
			System.out.println("Desempenho adequado");
			break;
		case 'D':	
			System.out.println("Aproveitamento minimo");
			break;
		case 'F':	
			System.out.println("Reprovado");
			break;
		case 'O':	
			System.out.println("Reprovado por falta");
			break;
		case 'I':	
			System.out.println("Incopleto");
			break;
		default:
			break;
	
		}

	}

}
