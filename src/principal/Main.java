package principal;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {	
	 
	 Curso curso1 = new Curso();
     curso1.setTitulo("curso Java");
	 curso1.setDescricao("descricao curso java");
	 curso1.setCargaHoraria(8);
		 
	 Curso curso2 = new Curso();
     curso2.setTitulo("curso Js");
	 curso2.setDescricao("descricao curso js");
	 curso2.setCargaHoraria(4);
	 	 
	 Mentoria mentoria = new Mentoria();
	 mentoria.setTitulo("mentoria de Java");
	 mentoria.setDescricao("descricao mentoria Java");
	 mentoria.setData(LocalDate.now());
	 
	 System.out.println(curso1);
	 System.out.println(curso2);
	 System.out.println(mentoria);;
	 
	 Bootcamp bootcamp = new Bootcamp();
     bootcamp.setNome("Bootcamp Java Developer");
     bootcamp.setDescricao("Descrição Bootcamp Java Developer");
     bootcamp.getConteudos().add(curso1);
     bootcamp.getConteudos().add(curso2);
     bootcamp.getConteudos().add(mentoria);

     Dev devLohrann = new Dev();
     devLohrann.setNome("Lohrann");
     devLohrann.inscreverBootcamp(bootcamp);
     System.out.println("Conteúdos Inscritos Lohrann:" + devLohrann.getConteudoInscritos());
     devLohrann.progredir();
     devLohrann.progredir();
     System.out.println("-");
     System.out.println("Conteúdos Inscritos Lohrann:" + devLohrann.getConteudoInscritos());
     System.out.println("Conteúdos Concluídos Lohrann:" + devLohrann.getConteudoConcluidos());
     System.out.println("XP:" + devLohrann.calcularTotalXp());

     System.out.println("-------");

     Dev devMoacir = new Dev();
     devMoacir.setNome("Moacir");
     devMoacir.inscreverBootcamp(bootcamp);
     System.out.println("Conteúdos Inscritos Moacir:" + devMoacir.getConteudoInscritos());
     devMoacir.progredir();
     devMoacir.progredir();
     devMoacir.progredir();
     System.out.println("-");
     System.out.println("Conteúdos Inscritos Moacir:" + devMoacir.getConteudoInscritos());
     System.out.println("Conteúdos Concluidos Moacir:" + devMoacir.getConteudoConcluidos());
     System.out.println("XP:" + devMoacir.calcularTotalXp());
	}

}
