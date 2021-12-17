//gerente é um funcionario, ele herda da class funcionario, assina o contrato  autenticavel, é um autenticavel

//não existe herança multipla , mas eu posso assinar vários contratos
//no contrato não existe implementação
//só quem implementa é quem assina
public class Gerente extends  Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticador;
		
	//	criando o metodo bonificação para todos os funcionarios
	 public double getBonificacao() {
         System.out.println("Chamando o método bonificacao do GERENTE");
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
	
	