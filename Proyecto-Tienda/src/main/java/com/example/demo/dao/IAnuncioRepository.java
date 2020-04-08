package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Anuncio;

public interface IAnuncioRepository extends CrudRepository<Anuncio,Integer>{
	
	Anuncio findByTitulo(String titulo);
	@Query(value="SELECT * FROM ANUNCIOS WHERE ID_CATEGORIA = :ID_CATEGORIA", nativeQuery=true)
	public List<Anuncio> anuncios_by_categoria(@Param("ID_CATEGORIA")int id_categoria);
	@Query(value="SELECT * FROM ANUNCIOS ORDER BY prioridad DESC", nativeQuery=true)
	public List<Anuncio> anuncios_by_prioridad();
	@Query(value="SELECT * FROM ANUNCIOS WHERE ID_CATEGORIA = :ID_CATEGORIA AND PRECIO > :PRECIO", nativeQuery=true)
	public List<Anuncio> anuncios_by_categoria_precio(@Param("ID_CATEGORIA")int id_categoria,@Param("PRECIO")double precio);
	@Query(value="SELECT descripcion FROM ANUNCIOS WHERE ID_CATEGORIA = :ID_CATEGORIA AND PRECIO > :PRECIO", nativeQuery=true)
	public List<String> anuncios_by_categoria_precio2(@Param("ID_CATEGORIA")int id_categoria,@Param("PRECIO")double precio);
	@Query(value="FROM descripcion, titulo FROM ANUNCIO WHERE ID_CATEGORIA = :ID_CATEGORIA AND PRECIO > :PRECIO", nativeQuery=true)
	public List<String> anuncios_by_categoria_precio3(@Param("ID_CATEGORIA")int id_categoria,@Param("PRECIO")double precio);
}
