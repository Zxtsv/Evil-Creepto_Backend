package org.generation.creeptomonedasdb.service;

import java.util.Optional;


import org.generation.creeptomonedasdb.models.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UsuariosRepository extends JpaRepository<Usuarios, Long>{
	@Query("SELECT u FROM Usuarios u WHERE u.email=?1")//?-> parámetro
	Optional<Usuarios> findByEmail (String email);
	
}
