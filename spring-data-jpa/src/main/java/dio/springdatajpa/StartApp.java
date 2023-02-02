package dio.springdatajpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dio.springdatajpa.model.Usuario;
import dio.springdatajpa.repository.UsuarioRepository;

@Component
public class StartApp implements CommandLineRunner{
    @Autowired
    private UsuarioRepository repository;

    @Override
    public void run(String... args) throws Exception {
        List<Usuario> usuarios = repository.findByNomeContaining("Gabriel");
        for(Usuario u: usuarios){
            System.out.println(u);
        }
    }

    private void inserirUsuario(){
        Usuario usuario = new Usuario();
        usuario.setNome("Gabriel R. S.");
        usuario.setLogin("Gab");
        usuario.setSenha("1234");
        repository.save(usuario);

        for(Usuario u: repository.findAll()){
            System.out.println(u);
        }
    }
    
}
