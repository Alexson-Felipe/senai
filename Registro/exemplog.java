
import javax.swing.JOptionPane;

public class exemplog {

	static class Conta {

		String numero;
		double saldo;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
			Conta conta = new Conta();
			
			conta.numero = JOptionPane.showInputDialog("Digite o numero da sua conta");

			conta.saldo = Double.parseDouble(JOptionPane.showInputDialog("Digite seu saldo"));

	
		System.out.println("Numero da conta: " + "" + conta.numero + ". Seu saldo é: " + conta.saldo);

	}

}
