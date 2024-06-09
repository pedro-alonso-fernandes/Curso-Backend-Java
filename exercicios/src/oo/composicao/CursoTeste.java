package oo.composicao;

public class CursoTeste {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Carlos Leitão");
		Aluno aluno2 = new Aluno("Vinícius do Brasil");
		Aluno aluno3 = new Aluno("Luiz");
		
		Curso curso1 = new Curso("Java Completo");
		Curso curso2 = new Curso("Python");
		Curso curso3 = new Curso("Inteligência Artificial");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno3);
		
		aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);
		
		
		
		
		
		System.out.println("Alunos do Curso 1:");
		for(Aluno aluno: curso1.alunos) {
			System.out.println(aluno.nome);
		}
		System.out.println();
		
		System.out.println("Alunos do Curso 2:");
		for(Aluno aluno: curso2.alunos) {
			System.out.println(aluno.nome);
		}
		System.out.println();
		
		System.out.println("Alunos do Curso 3:");
		for(Aluno aluno: curso3.alunos) {
			System.out.println(aluno.nome);
		}
		
		
		
		
		
		
		
		
		
		System.out.println("---------------------------------------------");
		
		// Relação bidirecional
		System.out.println(aluno1.cursos.get(0).alunos);
		
		Curso cursoEncontrado = aluno1.obterCursoPorNome("Python");
		
		if(cursoEncontrado != null) {
			System.out.println("---------------------------------------------");
			System.out.println(cursoEncontrado.nome);
			System.out.println(cursoEncontrado.alunos);
		}
		
	}
}
