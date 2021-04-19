package JOp;
import javax.swing.JOptionPane;

public class Aras {
	
	static int quantidadeCavalos;
	static int ferradurasTotal;

	public static void main(String[] args) {
		
		quantidadeCavalos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de Cavalos:"));
		
		ferradurasTotal = quantidadeCavalos * 4;
		
		JOptionPane.showMessageDialog(null, "A quantidade de ferraduras utilizada, será: " + ferradurasTotal);

	}

}
