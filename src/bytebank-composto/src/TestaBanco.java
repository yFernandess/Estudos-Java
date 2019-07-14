public class TestaBanco {
	public static void main(String[] args) {
		Cliente yuri = new Cliente();
		yuri.nome = "Yuri Fernandes";
		yuri.cpf = "394.106.758-39";
		yuri.profissao = "Desenvolvedor";
		
		Conta contaDoYuri = new Conta();
		contaDoYuri.titular = yuri;
		System.out.println(contaDoYuri.titular.nome);
		contaDoYuri.depositar(100);
	}
}
