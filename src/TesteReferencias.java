
public class TesteReferencias {

	public static void main(String[] args) {

		Gerente g1= new Gerente();//eu posso usar uma tipo mais generico "Funcionario" do que "Gerente"
										//AO CONTR�RIO N�O DARIA CERTO Gerente g1= new Funcionario(); , pois nem todo funcionario � gerente
										//Funcionario g1= new Gerente(); n�o permite chamar o m�todo autentica que est� em gerente
										//a referencia � do tipo Funcionario e ele s� permite chamar metodos que est�o em Funcion�rios
										
		g1.setNome("Marcos");		
		g1.setSalario(5000.00);
		
		
		Funcionario funcionario = new Funcionario();
		funcionario.setSalario(2000);
		
		
		EditorDeVideo eV=new EditorDeVideo();
		eV.setSalario(2500);
		
		Diretor d = new Diretor();
		d.setSalario(30000);
		
		Designer designer = new Designer();
		designer.setSalario(2000);
		
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(funcionario);
		controle.registra(eV);
		controle.registra(d);
		controle.registra(designer);
		
		
		
		System.out.println(controle.getSoma());
		
		
		
		
		
	}

}
