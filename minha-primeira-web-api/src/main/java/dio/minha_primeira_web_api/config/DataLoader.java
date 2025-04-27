package dio.minha_primeira_web_api.config;

import dio.minha_primeira_web_api.model.Endereco;
import dio.minha_primeira_web_api.model.Usuario;
import dio.minha_primeira_web_api.repository.EnderecoRepository;
import dio.minha_primeira_web_api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
        if (usuarioRepository.findByUsername("admin").isEmpty()) {
            Endereco endereco = new Endereco();
            endereco.setCep("01001000"); // CEP fixo só pra teste
            endereco.setLogradouro("Praça da Sé");
            endereco.setLocalidade("São Paulo");
            endereco.setUf("SP");

            enderecoRepository.save(endereco);

            Usuario admin = new Usuario();
            admin.setNome("Administrador");
            admin.setUsername("admin");
            admin.setSenha(passwordEncoder.encode("admin123")); // senha criptografada
            admin.setRole("MANAGERS");
            admin.setEndereco(endereco);

            usuarioRepository.save(admin);

            System.out.println("✅ Usuário administrador criado com sucesso!");
        } else {
            System.out.println("⚠️ Usuário admin já existe, não foi recriado.");
        }
    }
}

