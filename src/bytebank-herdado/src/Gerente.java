public class Gerente  extends FuncionarioAutenticavel {
	
	public Gerente() {
		
	}
	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do Gerente");
		return super.getSalario();
	}
		
}
