
public class ControleBonificacao {
	
	
	private double soma;
	
	//método que não retorna nada
	public void registra(Funcionario funcionario) {//nesse caso eu estou usando a referencia Funcionario que é genérica, ela abrange todos
		
		double boni=funcionario.getBonificacao();
		this.soma=this.soma+boni;
	}
	
	
	
	
	public double getSoma() {
		return soma;
	}
	
	

}
