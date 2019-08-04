public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		//System.out.println("O total de contas é: " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		//System.out.println("Estou criando uma conta " + this.numero);
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public boolean sacar(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
	public boolean transferir(double valor, Conta destino) {
		boolean sacou = this.sacar(valor);
		if(sacou) {
			destino.depositar(valor);
			return true;
		}
		return false;
	}
	
	public double getSaldo(){
		return this.saldo;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
		
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
}

