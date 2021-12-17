//gerente é um funcionario, ele herda da class funcionario, assina o contrato  autenticavel, é um autenticavel

//não existe herança multipla , mas eu posso assinar vários contratos
//no contrato não existe implementação
//só quem implementa é quem assina
public class Gerente extends  Funcionario implements Autenticavel {
	private int senha;
		
	//	criando o metodo bonificação para todos os funcionarios
	 public double getBonificacao() {
         System.out.println("Chamando o método bonificacao do GERENTE");
         return 50;
     }

	@Override
	public void setSenha(int senha) {
		this.senha=senha;
		
	}

	@Override
	public boolean autentica(int senha) {

		if(this.senha==senha) {
			return true;
		}else {
		return false;
	}}


	
	
		}
	
	