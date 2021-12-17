
//Não pode criar/instanciar objetos dessa classe, por que é abstrata

public abstract class  Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;//o modificador protected está no meio de public e private- protected é publico para os meus filhos
	
	//construtor padrão é aquele que não recebe nenhum parametro, se eu não incluir o compilador insere automaticamente
	public Funcionario() {
		
	}
	
	//método sem corpo, não há implementação do método, para ser utilizado o filho precisa implementar
	
	  public abstract double getBonificacao();
	 
	
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
