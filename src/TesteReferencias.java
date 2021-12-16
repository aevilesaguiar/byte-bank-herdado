
public class TesteReferencias {

	public static void main(String[] args) {

		Gerente g1= new Gerente();//eu posso usar uma tipo mais generico "Funcionario" do que "Gerente"
										//AO CONTRÁRIO NÃO DARIA CERTO Gerente g1= new Funcionario(); , pois nem todo funcionario é gerente
										//Funcionario g1= new Gerente(); não permite chamar o método autentica que está em gerente
										//a referencia é do tipo Funcionario e ele só permite chamar metodos que estão em Funcionários
										
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
