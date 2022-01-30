package principal;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
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
	}

}
