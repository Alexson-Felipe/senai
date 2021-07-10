
import javax.swing.JOptionPane;

public class GerenciadordeRegistros {

	static Conta[] contas;

	static class Conta {
		String numero;
		double saldo;
		double limiteCartao;
		
	}

	public static void main(String[] args) {
		contas = new Conta[2];
		Conta novaConta;

		for (int i = 0; i < contas.length; i++) {
			novaConta = new Conta();

			novaConta.numero = JOptionPane.showInputDialog("Digite o numero da sua conta");
			novaConta.saldo = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo da conta"));

			novaConta.limiteCartao = Double.parseDouble(JOptionPane.showInputDialog("Digite o limite do cartão"));

			contas[i] = novaConta;
		}

		for (int i = 0; i < contas.length; i++) {

			System.out.println("Conta: " + "" + contas[i].numero + " seu saldo é: " + contas[i].saldo + ". "
					+ "Seu limite é: " + "" + contas[i].limiteCartao);
		}

	}
}
