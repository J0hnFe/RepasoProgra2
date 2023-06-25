package com.example.demo;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Autor;
import com.example.demo.repository.modelo.Libro;
import com.example.demo.service.IAutorService;
import com.example.demo.service.ILibroService;


@SpringBootApplication
public class RepasoProgra2Application implements CommandLineRunner{
	
	@Autowired
	private IAutorService autorService;
	
	@Autowired
	private ILibroService libroService;

	public static void main(String[] args) {
		SpringApplication.run(RepasoProgra2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		//Autores
		Autor autor1 = new Autor();
		autor1.setNombre("Stephen.");
		autor1.setApellido("King");
		
		Autor autor2 = new Autor();
		autor2.setNombre("H. P");
		autor2.setApellido("Lovecraft");
		
		Autor autor3 = new Autor();
		autor3.setNombre("Robert");
		autor3.setApellido("Greene");
		
		Autor autor4 = new Autor();
		autor4.setNombre("Autor");
		autor4.setApellido("Cuatro");
		
		Autor autor5 = new Autor();
		autor5.setNombre("Autor");
		autor5.setApellido("Cinco");
		
		Autor autor6 = new Autor();
		autor6.setNombre("Autor");
		autor6.setApellido("Seis");
		
		//Libros SK
		Libro libro1 = new Libro();
		libro1.setTitulo("IT");
		libro1.setEditorial("DeBolsillo");
		
		Libro libro2 = new Libro();
		libro2.setTitulo("La Niebla");
		libro2.setEditorial("DeBolsillo");
		
		//Libros HPL
		Libro libro3 = new Libro();
		libro3.setTitulo("Gatos de Ulthar");
		libro3.setEditorial("Lumita");
		
		Libro libro4 = new Libro();
		libro4.setTitulo("Dago");
		libro4.setEditorial("Yerta");
		
		//Libro RG
		Libro libro5 = new Libro();
		libro5.setTitulo("48 Leyes del poder");
		libro5.setEditorial("EbookWorld");
		
		//Libros que tendran varios autores
		Libro libro6 = new Libro();
		libro6.setTitulo("LibroMix1");
		libro6.setEditorial("ABC");
		
		Libro libro7 = new Libro();
		libro7.setTitulo("LibroMix2");
		libro7.setEditorial("ZWY");
		
		//Lista de libros - una x autor
		Set<Libro> libros1 = new HashSet<>();
		Set<Libro> libros2 = new HashSet<>();
		Set<Libro> libros3 = new HashSet<>();
		//Libros con varios autores
		Set<Libro> libros4 = new HashSet<>();
		Set<Libro> libros5 = new HashSet<>();
		Set<Libro> libros6 = new HashSet<>();
		
		
		//Lista de autores
		Set<Autor> autores1 = new HashSet<>();
		Set<Autor> autores2 = new HashSet<>();
		Set<Autor> autores3 = new HashSet<>();
		Set<Autor> autores4 = new HashSet<>();
		Set<Autor> autores5 = new HashSet<>();
//		Set<Autor> autores6 = new HashSet<>();
//		Set<Autor> autores7 = new HashSet<>();
		
		autores1.add(autor1);
		autores2.add(autor2);
		autores3.add(autor3);
		
		autores4.add(autor5);
		autores4.add(autor4);
		
		autores5.add(autor6);
		autores5.add(autor4);
		
		//Lista de libros de SK
		libros1.add(libro1);
		libros1.add(libro2);

		//Lista de libros HPL
		libros2.add(libro3);
		libros2.add(libro4);

		//Lista de libros RG
		libros3.add(libro5);
		
		//Libros mix
		libros4.add(libro6);
		libros5.add(libro7);
			
		//Termino de setear autores y libros
		autor1.setLibros(libros1);
		autor2.setLibros(libros2);
		autor3.setLibros(libros3);
		autor4.setLibros(libros4);
		autor5.setLibros(libros5);
		
		libro1.setAutores(autores1);
		libro2.setAutores(autores1);
		libro3.setAutores(autores2);
		libro4.setAutores(autores2);
		libro5.setAutores(autores3);
		libro6.setAutores(autores4);
		libro7.setAutores(autores5);
		

		//Agrego a BD
//		this.libroService.agregar(libro1);
//		this.libroService.agregar(libro2);
//		this.libroService.agregar(libro3);
//		this.libroService.agregar(libro4);
//		this.libroService.agregar(libro5);
//		this.libroService.agregar(libro6);
//		this.libroService.agregar(libro7);
		
		this.autorService.agregar(autor1);
		this.autorService.agregar(autor2);
		this.autorService.agregar(autor3);
		this.autorService.agregar(autor4);
		this.autorService.agregar(autor5);
		
	}
}
