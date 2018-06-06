package br.com.apiweb.ws.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.apiweb.ws.model.Usuario;
import br.com.apiweb.ws.repository.ClienteRepository;
import br.com.apiweb.ws.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	public Usuario cadastrarUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	
	public Usuario buscarPorNome(String nome) {
		return usuarioRepository.buscarPorNome(nome);
	}
}
