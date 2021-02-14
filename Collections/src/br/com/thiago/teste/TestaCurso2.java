package br.com.thiago.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.thiago.dominio.Aula;
import br.com.thiago.dominio.Curso;

public class TestaCurso2 {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as cole��es do Java",
				"Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com cole��es", 24));
		
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		System.out.println(aulasImutaveis);
		
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		
		Collections.sort(aulas);
		System.out.println(aulas);
		System.out.println(javaColecoes.getTempoTotal());
		
		System.out.println(javaColecoes);
	}
}
