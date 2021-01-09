package net.amartinez.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.amartinez.model.Categoria;

public interface CategoriasRepository extends JpaRepository<Categoria, Integer> {
	
}
