
public class TesteGerente {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setNome("Mayara Fernandes");
		gerente.setCpf("383.247.058-13");
		gerente.setSalario(6000.00);
		
		System.out.println(gerente.getNome());
		System.out.println(gerente.getCpf());
		System.out.println(gerente.getSalario());
		
		gerente.setSenha(111);
		boolean autenticou = gerente.autentica(111);
		System.out.println(autenticou);
		
		System.out.println("Bonificação: " + gerente.getBonificacao());
	}

}
