
public class TestaValores {

	public static void main(String[] args) {
		int primeiro = 5;
		int segundo = 7;
		segundo = primeiro;
		primeiro = 10;
		System.out.println(segundo);
		
		String saudacao = "Olá, meu nome é ";
		String nome = "Yuri ";
		String continuacao = "e minha idade é ";
		int idade = 100;
		System.out.println(saudacao+nome+continuacao+idade);
	}

}
