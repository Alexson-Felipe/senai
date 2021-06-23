import java.util.Iterator;

import javax.swing.JOptionPane;

/**
 * 
 * Construa um algoritmo que realize a leitura de um vetor de nomes de 5
 * posições e apresente ao final quantos nomes começam com um vogal. O algoritmo
 * deve ser modularizado para que a contagem de nomes começando com vogal seja
 * retornada ao algoritmo principal por meio de uma função.
 *
 */

public class Caso03e {

	static String[] nomes;

	public static void main(String[] args) {

		nomes = new String[5];

		for (int i = 0; i < nomes.length; i++) {
			nomes[i] = JOptionPane.showInputDialog("Digite o nome " + i);
		}

		int nomesVogais = nomes(nomes);
		
		System.out.println(nomesVogais);
		

	}

	private static int nomes(String[] nomes2) {
		int cont = 0;
		
		for (int i = 0; i < nomes2.length; i++) {
			
			if (nomes2[i].charAt(0) == 'A' || nomes2[i].charAt(0) == 'E'  || nomes2[i].charAt(0) == 'I'  || nomes2[i].charAt(0) == 'O'  || nomes2[i].charAt(0) == 'U') {

				 cont++;
				
			}
		}
		
		return cont;
	}

}
