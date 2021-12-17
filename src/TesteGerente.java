
public class TesteGerente {

	public static void main(String[] args) {
		
		
		Autenticavel g1=new Cliente();
		g1.autentica(1234);
	

		Gerente gerente = new Gerente();
		gerente.setNome("Flávio Tavares");
		gerente.setCpf("123456789-23");
		gerente.setSalario(5000.00);

		
		System.out.println(gerente.getNome());
		System.out.println(gerente.getCpf());
		System.out.println(gerente.getSalario());

		
		gerente.setSenha(2222);
		boolean autenticou = gerente.autentica(2222);
		System.out.println(autenticou);

		
		System.out.println(gerente.getBonificacao());
		
	}

}
