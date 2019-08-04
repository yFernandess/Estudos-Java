public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente yuri = new Cliente();
		yuri.setNome("Yuri Fernandes");
		yuri.setCpf("394.106.758-39");
		yuri.setProfissao("Desenvolvedor");
		conta.setTitular(yuri);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("DEV");
		
		System.out.println(titularDaConta);
		System.out.println(yuri);
		System.out.println(conta.getTitular());
	}
}
