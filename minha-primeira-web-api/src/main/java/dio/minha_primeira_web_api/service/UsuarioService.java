package dio.minha_primeira_web_api.service;

import dio.minha_primeira_web_api.model.Usuario;
import org.springframework.stereotype.Service;


public interface UsuarioService {
    Iterable<Usuario> buscarTodos();

    Usuario buscarPorId(Long id);

    void inserir(Usuario usuario);

    void atualizar(Long id, Usuario usuario);

    void atualizarSenha(Long id, String senhaAntiga, String senhaNova);

    void deletar(Long id);

}
