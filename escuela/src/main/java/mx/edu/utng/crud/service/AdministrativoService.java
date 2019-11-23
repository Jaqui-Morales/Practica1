package mx.edu.utng.crud.service;

/**
 *@author Jaqueline López Morales
 * 22 de noviembre de 2019
 * email: JaquiMorales2020@gmail.com
 */


import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import mx.edu.utng.crud.entity.Administrativo;
import mx.edu.utng.crud.repository.IAdministrativoRepository;




@Service
public class AdministrativoService {

	//Objeto que hace conexión con MySQL
		private IAdministrativoRepository rep;
		
		//Constructor que inyecta objeto al Spring
		public AdministrativoService(IAdministrativoRepository rep) {
			this.rep = rep;
		}

		/**
		 * Método para guardar un administrativo
		 * @param admin Objeto administratuvo
		 * @return El administrativo guardado
		 */
		public Administrativo save(Administrativo admin) {
			return rep.save(admin);
		}
		
		/**
		 * Método que lista todos los administrativos
		 * @return Lista de administrativos
		 */
		public List<Administrativo> findAll(){
			//Irá y regresará de la BD
			return rep.findAll();
			
		}
		
		/**
		 * Método para eliminar un administrativo
		 * @param id identificador de un administrativo
		 */
		public void deleteById(Long id) {
			rep.deleteById(id);
		}
		
		
		/**
		 * Método que encuentra un administrativo
		 * @param id identificador de un administrativo
		 * @return Administrativo
		 */
		public Optional<Administrativo> findById(Long id){
			return rep.findById(id);
			
		}
}
