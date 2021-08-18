import javax.swing.JOptionPane;

public class Reajuste {
	
	static double salario, novoSalario;

	public static void main(String[] args) {
		
		salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario: "));
		
		if (salario >= 2301) {
			novoSalario = salario * 1.05;
			JOptionPane.showMessageDialog(null,"Salario antigo: " + salario +"\nCom 5%: " + (novoSalario - salario) + "\nSeu salario é: " + novoSalario);
		}else if(salario >= 1801 && salario <= 2301) {
			novoSalario = salario * 1.10;
			JOptionPane.showMessageDialog(null,"Salario antigo: " + salario +"\nCom 10%: " + (novoSalario - salario) + "\nSeu salario é: " + novoSalario);
		}else if(salario >= 1001 && salario <= 1800) {
			novoSalario = salario * 1.15;
			JOptionPane.showMessageDialog(null,"Salario antigo: " + salario +"\nCom 15%: " + (novoSalario - salario) + "\nSeu salario é: " + novoSalario);
		}else {
			novoSalario = salario * 1.20;
			JOptionPane.showMessageDialog(null,"Salario antigo: " + salario +"\nCom 20%: " + (novoSalario - salario) + "\nSeu salario é: " + novoSalario);
		}

	}

}
