
public class Cliente  implements Autenticavel{
	
	private AutenticacaoUtil autenticador;
	
	
	//construtor
	public Cliente() {
		this.autenticador=new AutenticacaoUtil();
		
		
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}

	@Override
	public boolean autentica(int senha) { // boolean true or false
		return  this.autenticador.autentica(senha);
		
	
	}

}
