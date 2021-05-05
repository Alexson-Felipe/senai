import javax.swing.JOptionPane;

public class Caso5 {
	
	static int pessoasDeMaior, deMaior, cont = 1;

	public static void main(String[] args) {
		
		while(cont <= 10) {
			
			pessoasDeMaior = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da " + cont +"º Pessoa"));
			
			if(pessoasDeMaior >= 18) {
				deMaior++;
			}
			
			cont++;
			
		}
		
		JOptionPane.showMessageDialog(null, deMaior + " Pessoa(s) apena(s) de Maior ");

	}

}
