
public class ControleBonificacao {
	
	
	private double soma;
	
	//m�todo que n�o retorna nada
	public void registra(Funcionario funcionario) {//nesse caso eu estou usando a referencia Funcionario que � gen�rica, ela abrange todos
		
		double boni=funcionario.getBonificacao();
		this.soma=this.soma+boni;
	}
	
	
	
	
	public double getSoma() {
		return soma;
	}
	
	

}
