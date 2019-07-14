public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoYuri = new Conta();
		contaDoYuri.saldo = 100;
		contaDoYuri.titular = "Yuri Fernandes";
		contaDoYuri.depositar(200);
		System.out.println(contaDoYuri.saldo);
		
		boolean sacou = contaDoYuri.sacar(20);
		System.out.println(contaDoYuri.saldo);
		System.out.println(sacou + "\r\n");
		
		Conta contaDaMayara = new Conta();
		contaDaMayara.titular = "Mayara Fernandes";
		double valor = 500;
		contaDaMayara.depositar(1000);
		
		boolean trasferiu = contaDaMayara.transferir(valor, contaDoYuri);
		
		if(trasferiu) {
			System.out.println("Valor transferido: R$" + contaDaMayara.saldo);
		} else {
			System.out.println("Saldo insuficiente. Saldo atual: R$" + contaDaMayara.saldo + 
					" Valor para depósito: R$" + valor);
		}
		
		System.out.println("Saldo conta da May: R$" + contaDaMayara.saldo);
		System.out.println("Saldo conta do Yuri: R$" + contaDoYuri.saldo);
	}
}
