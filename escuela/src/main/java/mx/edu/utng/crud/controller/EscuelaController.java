package mx.edu.utng.crud.controller;

/**
 *@author Jaqueline López Morales
 * 22 de noviembre de 2019
 * email: JaquiMorales2020@gmail.com
 */


import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import mx.edu.utng.crud.entity.Escuela;
import mx.edu.utng.crud.service.EscuelaService;

@RestController
@RequestMapping("/escuela") //Tabla de la BD en MySQL
public class EscuelaController {
	private EscuelaService service;
	
public EscuelaController(EscuelaService ser) {
	this.service = ser;
}

/**
 * Método que agrega una escuela
 * @param escuela objeto de tipo escuela
 * @return
 */
@PostMapping
public ResponseEntity create(@Valid @RequestBody Escuela escuela) {
	return ResponseEntity.ok(service.save(escuela));
	
}

/**
 * Listando las escuelas
 * @return Lista de escuelas
 */
@GetMapping
public ResponseEntity<List<Escuela>> list(){
	return ResponseEntity.ok(service.list());
	
}

/**
 * Método que busca una escuela en especifíco
 * @param id Identificador de la escuela
 * @return Regresa la escuela
 */

@GetMapping("/{id}")
public ResponseEntity<Escuela> findById(@PathVariable Long id){
	Optional<Escuela> escuela = service.encontrarId(id);
	if(!escuela.isPresent()) {
		ResponseEntity.badRequest().build();
		
	}
	
	return ResponseEntity.ok(escuela.get());
}

/**
 * Método para eliminar una escuela
 * @param id identificador de la escuela
 * @return respuesta
 */
@DeleteMapping("/{id}")
public ResponseEntity delete(@PathVariable Long id) {
	if(!service.encontrarId(id).isPresent()) {
		ResponseEntity.badRequest().build();
	}
	service.eliminar(id);
	return ResponseEntity.ok().build();
}


}


