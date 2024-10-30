package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("curso Java");
		curso1.setDescricao("Descrição do curso Java");
		curso1.setCargaHoraria(8);

		Curso curso2 = new Curso();
		curso2.setTitulo("curso Js");
		curso2.setDescricao("Descrição do curso Js");
		curso2.setCargaHoraria(10);

		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria Java");
		mentoria.setDescricao("descrição mentoria Java");
		mentoria.setData(LocalDate.now());
		
		/*System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devMatheus = new Dev();
		devMatheus.setNome("Matheus");
		devMatheus.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Matheus: " + devMatheus.getConteudosInscritos());
		System.out.println("-");
		devMatheus.progredir();
		System.out.println("Conteúdos Concluidos Matheus: " + devMatheus.getConteudosConcluidos());
		System.out.println("XP: " +devMatheus.calcularXP());
		
		System.out.println("----------------");
		
		Dev devCamila = new Dev();
		devMatheus.setNome("Camila");
		devCamila.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Camila: " + devCamila.getConteudosInscritos());
		System.out.println("-");
		devCamila.progredir();
		System.out.println("Conteúdos Concluidos Camila: " + devCamila.getConteudosConcluidos());
		System.out.println("XP: " +devCamila.calcularXP());
		
		
	}

}
