package com.literAlura.catalogo_libros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import service.LibroService;

import java.util.Scanner;

@SpringBootApplication
@ComponentScan({"service", "LibroService"})
public class CatalogoLibrosApplication implements CommandLineRunner {

	@Autowired
	private LibroService libroService;

	public static void main(String[] args) {
		SpringApplication.run(CatalogoLibrosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		boolean exit = false;

		while (!exit) {
			System.out.println("Seleccione una opción:");
			System.out.println("1. Buscar libros por título");
			System.out.println("2. Buscar libros por autor");
			System.out.println("3. Listar los últimos libros");
			System.out.println("4. Salir");
			System.out.print("Ingrese su opción: ");
			int option = scanner.nextInt();
			scanner.nextLine(); // Consume the newline

			switch (option) {
				case 1:
					System.out.print("Ingrese el título del libro: ");
					String titulo = scanner.nextLine();
					libroService.buscarPorTitulo(titulo).forEach(System.out::println);
					break;
				case 2:
					System.out.print("Ingrese el nombre del autor: ");
					String autor = scanner.nextLine();
					libroService.buscarPorAutor(autor).forEach(System.out::println);
					break;
				case 3:
					libroService.listarUltimosLibros().forEach(System.out::println);
					break;
				case 4:
					exit = true;
					break;
				default:
					System.out.println("Opción no válida. Inténtelo de nuevo.");
					break;
			}
		}

		scanner.close();
	}
}

