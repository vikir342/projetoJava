
public class ClassePrincipal {

	// Método chamado main
	public static void main(String[] args) {
		
		ClasseAlunos mikaelObj = new ClasseAlunos();
		ClasseAlunos abraaaolObj = new ClasseAlunos();
		
		mikaelObj.nomeAt = "mikael";
		mikaelObj.cursoAt = "informatica";
		mikaelObj.notaAt = 8.5F;
		
		System.out.println(mikaelObj.nomeAt);
		System.out.println(mikaelObj.cursoAt);
		System.out.println(mikaelObj.notaAt);
		
}
}
