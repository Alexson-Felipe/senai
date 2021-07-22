import javax.swing.JOptionPane;

public class funcao1 {

	
	private static double somar(double n1, double n2) {
		// TODO Auto-generated method stub
		
		double resultadoSoma = n1 + n2;
		
		return resultadoSoma;
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o nº 1"));
  		double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o nº 2"));

  		//Exemplo Função
		double resultado = somar(n1, n2);
		
		//Exemplo Procedimento
		mostraMensagem(resultado);
		
	}

	private static void mostraMensagem(double n1) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Retorno da função foi: "+n1);
	}


}
