public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaDaMayara = new Conta();
		System.out.println(contaDaMayara.getSaldo() + "\r\n");
		
		contaDaMayara.titular = new Cliente();
		System.out.println(contaDaMayara.titular);
		contaDaMayara.titular.nome = "Mayara";
		System.out.println(contaDaMayara.titular.nome);
	}
}
