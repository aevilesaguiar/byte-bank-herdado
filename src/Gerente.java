
public class Gerente extends Funcionario {
	

	private int senha;
	

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	
	
	
	
	//construtor padr�o � aquele que n�o recebe nenhum parametro, se eu n�o incluir o compilador insere automaticamente
	public Gerente() {
		
	}
	
	
			
	//	criando o metodo bonifica��o para todos os funcionarios
	 public double getBonificacao() {
         System.out.println("Chamando o m�todo bonificacao do GERENTE");
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
