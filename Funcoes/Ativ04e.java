/**
 * 
 * Desenvolva um programa que simule a importação de um arquivo texto que contem
 * o nome e cidade de 10 pessoas. A formatação do texto esta dessa forma:
 * 
 * Pessoa 1-Tubarao/SC; 
 * Pessoa 2-Florianopolis/SC; 
 * Pessoa 3-Sao Paulo/SP; 
 * Pessoa 4-Osasco/SP; 
 * Pessoa 5-Porto Alegre/RS; 
 * Pessoa 6- Rio de Janeiro/RJ; 
 * Pessoa 7-Sao Paulo/SP 
 * Pessoa 8-Florianopolis/SC; 
 * Pessoa 9- Rio de Janeiro/RJ; 
 * Pessoa 10-Tubarao/SC;
 *
 *Inserindo esses dados o programa deve formatar e apresentar a mensagem da seguinte forma:
 *
 *Nome: Pessoa 1. Mora em: Tubarao/SC; 
 *Nome: Pessoa 2. Mora em: Florianopolis/SC 
 *…… 
 *Nome: Pessoa 10; Mora em: Tubarao/SC;
 *
 *Considere que todo esse texto veio em uma variavel.
 *
 */

public class Ativ04e {

	static String cidades = " 1-Tubarao/SC; \r\n"
			+ " 2-Florianopolis/SC; \r\n"
			+ " 3-Sao Paulo/SP; \r\n"
			+ " 4-Osasco/SP; \r\n"
			+ " 5-Porto Alegre/RS; \r\n"
			+ " 6-Rio de Janeiro/RJ; \r\n"
			+ " 7-Sao Paulo/SP \r\n"
			+ " 8-Florianopolis/SC; \r\n"
			+ " 9-Rio de Janeiro/RJ; \r\n"
			+ " 10-Tubarao/SC;"; 
	
	static String[] nomes;
	
	public static void main(String[] args) {
		
		System.out.println(cidades);
	}

}
