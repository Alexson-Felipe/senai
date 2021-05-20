
public class Ativ10 {

	static double salario = 1000, salarioFinal, percentual = 1.5;
	
	public static void main(String[] args) {
		
		for(int i = 1996; i <= 2021; i++) {
			
			if(i == 1996) {
				salarioFinal = salario * 1.05;
			}else {
				percentual = percentual * 2;
				
				//salarioFinal = salarioFinal * percentual;
				System.out.println(percentual);
			}
		}
		
	}

}
