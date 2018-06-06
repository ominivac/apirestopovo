package br.com.apiweb.ws.controller;

import java.util.Date;

import javax.servlet.ServletException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.apiweb.ws.model.Usuario;
import br.com.apiweb.ws.service.UsuarioService;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;


@RestController
public class LoginController {
	
	@Autowired
	UsuarioService  usuarioService;
	
	
	private class LoginResponse{
		public String token;
		
		public LoginResponse(String token){
			this.token = token;
		}
		
		
		
	}
	

	@RequestMapping(value="/autenticar", consumes=MediaType.APPLICATION_JSON_VALUE, method= RequestMethod.POST)
	public LoginResponse autenticar(@RequestBody Usuario usuario) throws ServletException {
		//System.out.println("usuario " + usuario.getNome() + " " + usuario.getSenha());
		
		if(usuario.getNome() == null || usuario.getSenha() == null) {
			throw new ServletException("nome e senha são necessários");
		}
		
		Usuario usuarioAutenticado = usuarioService.buscarPorNome(usuario.getNome() );
		//return new ResponseEntity<Usuario>(usuarioAutenticado, HttpStatus.OK) ;
		
		if(usuarioAutenticado  ==  null) {
			throw new ServletException("usuário não encontrado");
		}
		
		if(!usuarioAutenticado.getSenha().equals(usuario.getSenha() ) ) {
			throw new ServletException("usuário ou senha inválidos");
		}
		
		
		String token = Jwts.builder()
				.setSubject(usuarioAutenticado.getNome())
				.signWith(SignatureAlgorithm.HS512, "banana")
				.setExpiration(new Date(System.currentTimeMillis() + 3 * 60  * 1000))
				.compact() ;
		
		return new LoginResponse(token);
		
	}
	
	
	
	
}
