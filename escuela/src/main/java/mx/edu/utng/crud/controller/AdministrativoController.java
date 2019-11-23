package mx.edu.utng.crud.controller;


/**
 *@author Jaqueline López Morales
 * 22 de noviembre de 2019
 * email: JaquiMorales2020@gmail.com
 */


import java.util.List;
import javax.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import mx.edu.utng.crud.entity.Administrativo;
import mx.edu.utng.crud.service.AdministrativoService;


@RestController
@RequestMapping("/administrativo") //Tabla de la BD en MySQL
public class AdministrativoController {
	private AdministrativoService service;
	
 public AdministrativoController(AdministrativoService service) {
	this.service = service;
}

/**
 * Método que agrega un administrativo
 * @param administrativo 
 * @return
 */
@PostMapping
public ResponseEntity create(@Valid @RequestBody Administrativo administrativo) {
	return ResponseEntity.ok(service.save(administrativo));
	
}

/**
 * Listando los administrativos
 * @return Lista de administrativos
 */
@GetMapping
public ResponseEntity<List<Administrativo>> findAll(){
	return ResponseEntity.ok(service.findAll());
	
}


/**
 * Método para eliminar un administrativo
 * @param id identificador de un administrativo
 * @return respuesta
 */
@DeleteMapping("/{id}")
public ResponseEntity delete(@PathVariable Long id) {
	if(!service.findById(id).isPresent()) {
		ResponseEntity.ok("El administrativo no existe");
	}
	service.deleteById(id);;
	return ResponseEntity.ok("El registro ha sido eliminado con éxito");
}

}
