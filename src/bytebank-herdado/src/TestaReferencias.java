
public class TestaReferencias {

	public static void main(String[] args) {
		Funcionario gerente = new Gerente();
		gerente.setNome("Yuri");
		gerente.setSalario(5000.0);
		
		//Funcionario funcionario = new Funcionario();
		//funcionario.setSalario(2000.0);
		
		Funcionario editorVideo = new EditorVideo();
		editorVideo.setSalario(2500.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(gerente);
		//controle.registra(funcionario);
		controle.registra(editorVideo);
		
		System.out.println(controle.getSoma());

	}

}
