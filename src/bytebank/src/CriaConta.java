public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.agencia = 123;
		primeiraConta.numero = 1111;
		primeiraConta.titular = "Yuri";
		primeiraConta.saldo = 200;
		
		Conta segundaConta = new Conta();
		segundaConta.agencia = 123;
		segundaConta.numero = 1111;
		segundaConta.titular = "Mayara";
		segundaConta.saldo = 500;
		
		System.out.println("Primeira conta tem R$" + primeiraConta.saldo);
		System.out.println("Segunda conta tem R$" + segundaConta.saldo);
		
		
		if(primeiraConta == segundaConta) {
			System.out.println("S�o as mesmas contas");
		} else {
			System.out.println("Contas diferentes");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}
