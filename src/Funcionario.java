
//N�o pode criar/instanciar objetos dessa classe, por que � abstrata

public abstract class  Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;//o modificador protected est� no meio de public e private- protected � publico para os meus filhos
	
	//construtor padr�o � aquele que n�o recebe nenhum parametro, se eu n�o incluir o compilador insere automaticamente
	public Funcionario() {
		
	}
	
	//m�todo sem corpo, n�o h� implementa��o do m�todo, para ser utilizado o filho precisa implementar
	
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
