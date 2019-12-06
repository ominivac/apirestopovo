package br.com.opovo.apiweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.opovo.apiweb.model.Noticia;


@Repository
public interface NoticiaRepository extends JpaRepository<Noticia, Long> {
	
	/**
	 * Pesquisa uma Notícia na api pelo seu id.
	 *
	 * @param  Long id.
	 * @return Retorna uma notícia em formato JSON, pesquisada pelo seu id.
	 * @author Roberto Sousa
	 */
	@Query
	Noticia findById(long id);
	

}