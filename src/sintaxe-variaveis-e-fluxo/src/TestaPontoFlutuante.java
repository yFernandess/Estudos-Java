public class TestaPontoFlutuante {
	
	public static void main(String[] args) {
	
		double salario = 1250.70;
		System.out.println("Meu sal�rio �: " + "R$" + salario);
		
		//Por mais que a variavel seja do tipo double o compilador ira cuspir o resultado 2.0
		double divisao = 5 / 2;
		System.out.println(divisao);
		
		//Um dos valores da opera��o deve estar no formato double: 5.0
		double divisao2 = 5.0 / 2;
		System.out.println(divisao2);
	}
}
