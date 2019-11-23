package mx.edu.utng.crud.repository;

/**
 *@author Jaqueline López Morales
 * 22 de noviembre de 2019
 * email: JaquiMorales2020@gmail.com
 */


import org.springframework.data.jpa.repository.JpaRepository;

import mx.edu.utng.crud.entity.Escuela;

public interface IEscuelaRepository extends JpaRepository<Escuela, Long> {
	

}
