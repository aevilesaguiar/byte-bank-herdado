
public class TesteFuncionario {

	public static void main(String[] args) {

		Gerente funcionario = new Gerente();
		
		funcionario.setNome("Nico da Silva");
		funcionario.setCpf("123.456.789-85");
		funcionario.setSalario(15000.00);
		
		System.out.println("Nome: "+funcionario.getNome());
		System.out.println("Bonificação: "+funcionario.getBonificacao());
		
		
	
	
	}

}
