package JOp;
import javax.swing.JOptionPane;

public class GastosSemanais {

	static double seg, ter, qua, qui, sexta, media;
	
	public static void main(String[] args) {
		
		seg = Double.parseDouble(JOptionPane.showInputDialog("Quanto gastou na Segunda: "));
		ter = Double.parseDouble(JOptionPane.showInputDialog("Quanto gastou na terça: "));
		qua = Double.parseDouble(JOptionPane.showInputDialog("Quanto gastou na quarta: "));
		qui = Double.parseDouble(JOptionPane.showInputDialog("Quanto gastou na quinta: "));
		sexta = Double.parseDouble(JOptionPane.showInputDialog("Quanto gastou na sexta: "));
		
		media = (seg + ter + qua + qui + sexta) / 5;
		
		JOptionPane.showMessageDialog(null, "Sua média de gastos na semana, foi: " + " R$" + media);
		
	}

}


