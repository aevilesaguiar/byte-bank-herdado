//gerente ? um funcionario, ele herda da class funcionario, assina o contrato  autenticavel, ? um autenticavel

//n?o existe heran?a multipla , mas eu posso assinar v?rios contratos
//no contrato n?o existe implementa??o
//s? quem implementa ? quem assina
public class Gerente extends  Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticador;
		
	//	criando o metodo bonifica??o para todos os funcionarios
	 public double getBonificacao() {
         System.out.println("Chamando o m?todo bonificacao do GERENTE");
         return 50;
     }

	//construtor

		public Gerente() {
			this.autenticador=new AutenticacaoUtil();
			
			
		}
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	 
	 
	 


	
	
		}
	
	