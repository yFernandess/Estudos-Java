public class Gerente  extends FuncionarioAutenticavel {
	
	public Gerente() {
		
	}
	
	public double getBonificacao() {
		System.out.println("Chamando o m�todo de bonifica��o do Gerente");
		return super.getSalario();
	}
		
}
