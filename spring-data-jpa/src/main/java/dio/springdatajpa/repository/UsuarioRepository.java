package dio.springdatajpa.repository;

import dio.springdatajpa.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;;


public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
    
}
