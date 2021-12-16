
public class TesteGerente {

	public static void main(String[] args) {

		Gerente gerente = new Gerente();
		gerente.setNome("Flávio Tavares");
		gerente.setCpf("123456789-23");
		gerente.setSalario(5000.00);
		gerente.setSenha(123456);
		
		System.out.println(gerente.getNome());
		System.out.println(gerente.getCpf());
		System.out.println(gerente.getSalario());
		System.out.println(gerente.getSenha());
		
		
		boolean autenticou = gerente.autentica(123456);
		System.out.println(autenticou);
		
		System.out.println(gerente.getBonificacao());
		
	}

}
