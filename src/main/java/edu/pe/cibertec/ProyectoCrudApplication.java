package edu.pe.cibertec;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import edu.pe.cibertec.model.Usuario;
import edu.pe.cibertec.repository.UsuarioRepository;

@SpringBootApplication
public class ProyectoCrudApplication {

	public static void main(String[] args) {
	ApplicationContext context = SpringApplication.run(ProyectoCrudApplication.class, args);
	UsuarioRepository repository = context.getBean(UsuarioRepository.class);
	
	List<Usuario> usuarios = List.of(
			
			new Usuario(0, "Usuario1", "Prueba1", "email1.com"),
			new Usuario(0, "Usuario2", "Prueba2", "email2.com"),
			new Usuario(0, "Usuario3", "Prueba3", "email3.com"),
			new Usuario(0, "Usuario4", "Prueba4", "email4.com"),
			new Usuario(0, "Usuario5", "Prueba5", "email5.com"),
			new Usuario(0, "Usuario6", "Prueba6", "email6.com"),
			new Usuario(0, "Usuario7", "Prueba7", "email7.com")
		
			);
	repository.saveAll(usuarios);
	
	
		System.out.println("Hola Mundo desde  Spring");
	}

}
