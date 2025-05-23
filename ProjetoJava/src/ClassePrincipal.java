
public class ClassePrincipal {

	// Método chamado main
	public static void main(String[] args) {
		
		String nome = "mikael";
		
		System.out.println(nome);
		
	// usar classePessoas
		classePessoas alunoObj = new classePessoas(); // criei um objeto
													  // instanciei classe pessoa
		
		alunoObj.nomeAT = "luiz";
		alunoObj.rendaAT = 15_000;
		
		System.out.println(alunoObj.nomeAT);
		System.out.println(alunoObj.rendaAT);
		
	}

}
