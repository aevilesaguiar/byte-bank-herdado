
//Contrata autenticavel
//quem assinar esse contrato precisa implemetar
	//m�tdo setsenha
//metodo autentica

public abstract interface Autenticavel  {
	
	//interface � uma classe abstrata com todos os m�todos abstratos
	//dentro de uma classe n�o tem nada concreto

    public abstract void setSenha(int senha);

    public abstract boolean autentica(int senha); 
}
