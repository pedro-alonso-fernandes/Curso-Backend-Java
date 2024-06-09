package oo.composicao;

import java.util.ArrayList;

public class Aluno {

	String nome;
	// Um aluno pode ter vários cursos
	ArrayList<Curso> cursos = new ArrayList<Curso>();
	
	Aluno(String nome){
		this.nome = nome;
	}
	
	void adicionarCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}
	
	public String toString() {
		return nome;
	}
	
	Curso obterCursoPorNome(String nome) {
		for(Curso curso: cursos) {
			if(curso.nome.equalsIgnoreCase(nome)) {
				return curso;
			}
		}
		return null;
	}
}
