
public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario func = new Gerente();
		func.setNome("Yuri Fernandes");
		func.setCpf("394.106.758-39");
		func.setSalario(5000.00);
		
		System.out.println(func.getNome());
		System.out.println(func.getBonificacao());
	}

}
