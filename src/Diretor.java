
public class Diretor extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("Chamando o m�todo de bonificacao do Diretor");
		return super.getBonificacao()+5000;
	}

}
