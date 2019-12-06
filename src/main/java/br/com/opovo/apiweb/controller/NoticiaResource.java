package br.com.opovo.apiweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.opovo.apiweb.model.Noticia;
import br.com.opovo.apiweb.repository.NoticiaRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
@Api(value = "APi Rest de Noticias")
@CrossOrigin(origins = "*")
public class NoticiaResource {
	
	@Autowired
	NoticiaRepository noticiaRepository;
	
	/**
	 * Lista as noticias pela api
	 *
	 * @param  Nenhum
	 * @return Retorna as noticias pela api, cadastradas no banco de dados
	 * @author Roberto Sousa
	 */
	@GetMapping("/noticias")
	@ApiOperation(value = "Retorna uma lista de noticias")
	public List<Noticia> listaNoticias(){
		return noticiaRepository.findAll();
	}
	
	
	
	
	@GetMapping("/noticia/{id}")
	@ApiOperation(value = "Retorna uma noticia pelo seu id")
	public Noticia listaNoticiaById(@PathVariable(value = "id") Long id){
		return noticiaRepository.findById(id);
	}
	
	@PostMapping("/noticia")
	@ApiOperation(value = "Salva uma noticia")
	public Noticia salvarNoticia(@RequestBody Noticia noticia) {
		return noticiaRepository.save(noticia);
	}
	
	@DeleteMapping("/noticia")
	@ApiOperation(value = "Deleta uma noticia")
	public void DeletaNoticia(@RequestBody Noticia noticia) {
		noticiaRepository.delete(noticia.getId() );
	}

	
	
	@PutMapping("/noticia")
	@ApiOperation(value = "Atualiza uma noticia")
	public Noticia atualizaNoticia(@RequestBody Noticia noticia) {
		return noticiaRepository.save(noticia);
	}
}
