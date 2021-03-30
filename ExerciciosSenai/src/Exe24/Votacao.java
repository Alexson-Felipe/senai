package Exe24;
import javax.swing.JOptionPane;

public class Votacao {
	
	static Double naoVotaram, numeroEleitores, votosValidos, brancos, nulos, totalVV, totalB, totalN;

	public static void main(String[] args) {
		
		numeroEleitores = Double.parseDouble(JOptionPane.showInputDialog("Numero de eleitores: "));
		votosValidos = Double.parseDouble(JOptionPane.showInputDialog("Digite os votos validos: "));
		brancos = Double.parseDouble(JOptionPane.showInputDialog("Votos Brancos: "));
		nulos = Double.parseDouble(JOptionPane.showInputDialog("Total de votos nulos: "));
		
		totalVV = (votosValidos * 100) / numeroEleitores;
		totalB = (brancos * 100) / numeroEleitores;
		totalN = (nulos * 100) / numeroEleitores;
		
		
		JOptionPane.showMessageDialog(null, "Validos: " + totalVV + "\nBrancos: " + totalB + "\nNulos: " + totalN);
		
		naoVotaram = numeroEleitores - (totalVV + totalB + totalN);
		
		JOptionPane.showMessageDialog(null, "Pessoas que não votaram: " + naoVotaram);

	}

}
