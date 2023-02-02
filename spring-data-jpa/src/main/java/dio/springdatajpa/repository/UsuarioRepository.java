package dio.springdatajpa.repository;

import dio.springdatajpa.model.Usuario;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;;


public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
    //Query Method
    List<Usuario> findByNomeContaining(String nome);

    //Query Method
    Usuario findByLogin(String login);

    //Query Override
    @Query("SELECT u FROM Usuario u WHERE u.nome LIKE %:nome%")
    List<Usuario> filtrarPorNome(@Param("nome") String nome);
}
