
//Contrata autenticavel
//quem assinar esse contrato precisa implemetar
	//métdo setsenha
//metodo autentica

public abstract interface Autenticavel  {
	
	//interface é uma classe abstrata com todos os métodos abstratos
	//dentro de uma classe não tem nada concreto

    public abstract void setSenha(int senha);

    public abstract boolean autentica(int senha); 
}
