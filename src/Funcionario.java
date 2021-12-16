
public class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;
	
	//construtor padrão é aquele que não recebe nenhum parametro, se eu não incluir o compilador insere automaticamente
	public Funcionario() {
		
	}
	
	//criando o metodo bonificação para todos os funcionarios
	public double getBonificaçao() {
		return this.salario*0.1;
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
