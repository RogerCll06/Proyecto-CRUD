package edu.pe.cibertec.service;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.pe.cibertec.model.Usuario;
import edu.pe.cibertec.repository.UsuarioRepository;
import edu.pe.cibertec.util.UsuarioReportGenerator;
import net.sf.jasperreports.engine.JRException;

@Service
public class UsuarioServiceImp implements IUsuarioService {
	@Autowired
	UsuarioRepository repositorio;

	@Override
	public List<Usuario> listarUsuario() {
		return repositorio.findAll();
	}

	@Override
	public Usuario guardarUsuario(Usuario usuario) {
		return this.repositorio.save(usuario);
	}

	@Override
	public Optional<Usuario> buscarUsuario(int codigo) {
	return repositorio.findById(codigo);
	}

	@Override
	public void eliminarUsuario(int codigo) {
		this.repositorio.deleteById(codigo);

	}

	@Override
	public byte[] exportPdf() throws JRException, FileNotFoundException {
		
		return UsuarioReportGenerator.exportToPdf(repositorio.findAll());
	}

}
