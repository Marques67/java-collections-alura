package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {
		Set<String> alunos = new HashSet<String>();
		alunos.add("Lucas Marques");
		alunos.add("Lara Correia");
		alunos.add("Denise Marques");
		alunos.add("Paulo Ferreira");
		alunos.add("Ana Paula Marques");
		alunos.add("Augusto Camillo");
		
		System.out.println(alunos);
	}

}
