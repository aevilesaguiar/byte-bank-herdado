
public class ControleBonificacao {
	
	
	private double soma;
	
	//m�todo que n�o retorna nada
	public void registra(Funcionario funcionario) {
		
		double boni=funcionario.getBonificacao();
		this.soma=this.soma+boni;
	}
	
	
	
	
	public double getSoma() {
		return soma;
	}
	
	

}
