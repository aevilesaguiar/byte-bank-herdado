
public class Gerente extends Funcionario {
	

	private int senha;
	

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	
	
	
	
	//construtor padrão é aquele que não recebe nenhum parametro, se eu não incluir o compilador insere automaticamente
	public Gerente() {
		
	}
	
	
			
	//	criando o metodo bonificação para todos os funcionarios
	 public double getBonificacao() {
         System.out.println("Chamando o método bonificacao do GERENTE");
         return 50;
     }
	
	
	
	public boolean autentica(int senha) {
		if(this.senha==senha) {
			return true;
		}else {
		return false;
	}
		}
	
	
	

	

}
