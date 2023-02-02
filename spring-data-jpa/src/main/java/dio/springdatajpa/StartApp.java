package dio.springdatajpa;

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
        Usuario usuario = new Usuario();
        usuario.setNome("Gabriel");
        usuario.setLogin("Gabr");
        usuario.setSenha("senha");

        repository.save(usuario);

        for(Usuario u: repository.findAll()){
            System.out.println("Impressao dos usuarios");
            System.out.println(u);
        }
    }
    
}
