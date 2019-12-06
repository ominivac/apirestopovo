package br.com.opovo.apiweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.opovo.apiweb.model.Noticia;


@Repository
public interface NoticiaRepository extends JpaRepository<Noticia, Long> {
	
	@Query
	Noticia findById(long id);
	

}