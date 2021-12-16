
public class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;//o modificador protected est� no meio de public e private- protected � publico para os meus filhos
	
	//construtor padr�o � aquele que n�o recebe nenhum parametro, se eu n�o incluir o compilador insere automaticamente
	public Funcionario() {
		
	}
	
	//criando o metodo bonifica��o para todos os funcionarios
	public double getBonificacao() {
		return this.salario*0.05;
	}
	
	
	//getter e setter
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	

	
	

}
