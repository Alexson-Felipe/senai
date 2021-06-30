/**
 * 
 * Desenvolva um programa que simule a importação de um arquivo texto que contem
 * o nome e cidade de 10 pessoas. A formatação do texto esta dessa forma:
 * 
 * Pessoa 1-Tubarao/SC; Pessoa 2-Florianopolis/SC; Pessoa 3-Sao Paulo/SP; Pessoa
 * 4-Osasco/SP; Pessoa 5-Porto Alegre/RS; Pessoa 6- Rio de Janeiro/RJ; Pessoa
 * 7-Sao Paulo/SP Pessoa 8-Florianopolis/SC; Pessoa 9- Rio de Janeiro/RJ; Pessoa
 * 10-Tubarao/SC;
 *
 * Inserindo esses dados o programa deve formatar e apresentar a mensagem da
 * seguinte forma:
 *
 * Nome: Pessoa 1. Mora em: Tubarao/SC; Nome: Pessoa 2. Mora em:
 * Florianopolis/SC …… Nome: Pessoa 10; Mora em: Tubarao/SC;
 *
 * Considere que todo esse texto veio em uma variavel.
 *
 */

public class Ativ04e {

	static String lista;
	static String[] itensLista, nomesCidades;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		lista = "Pessoa 1-Tubarão/SC;\n" + "Pessoa 2-Florianópolis/SC;\n" + "Pessoa 3-São Paulo/SP;\n"
				+ "Pessoa 4-Osasco/SP;\n" + "Pessoa 5-Porto Alegre/RS;\n" + "Pessoa 6- Rio de Janeiro/RJ;\n"
				+ "Pessoa 7-São Paulo/SP\n" + "Pessoa 8-Florianópolis/SC;\n" + "Pessoa 9- Rio de Janeiro/RJ;\n"
				+ "Pessoa 10-Tubarão/SC\n" + "";

		itensLista = lista.split(";");

		for (int i = 0; i < itensLista.length; i++) {

			nomesCidades = itensLista[i].split("-");

			System.out.println("Nome: " + nomesCidades[0] + ". " + "Mora em: " + nomesCidades[1]);
		}

	}
}
