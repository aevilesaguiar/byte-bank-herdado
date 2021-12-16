
public class ControleBonificacao {
	
	
	private double soma;
	
	//método que não retorna nada
	public void registra(Funcionario funcionario) {
		
		double boni=funcionario.getBonificacao();
		this.soma=this.soma+boni;
	}
	
	
	
	
	public double getSoma() {
		return soma;
	}
	
	

}
