
public class FuncionarioTeste {
	
	private String nome;
	private String cpf;
	private double salario;
	private int tipo=0;//0funcionario comum, 1 - gerente, 2 - diretor
	
	//construtor padrão é aquele que não recebe nenhum parametro, se eu não incluir o compilador insere automaticamente
	public FuncionarioTeste() {
		
	}
	
	//criando o metodo bonificação para cada cargo
	public double getBonificaçao() {
		
		if(this.tipo==0) {//funcionario comum
		return this.salario*0.1;
		}else if(this.tipo==1) {//gerente
			return this.salario;
		}else {//diretor
			return this.salario+1000.00;
		}
		
	}
	
	
	
	public void setTipo(int tipo) {
		this.tipo=tipo;
	}
	
	public int getTipo() {
		return this.tipo;
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
