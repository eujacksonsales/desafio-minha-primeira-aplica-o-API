//package dio.minha_primeira_web_api.service.impl;
//
//import dio.minha_primeira_web_api.handler.BusinessException;
//import dio.minha_primeira_web_api.model.Endereco;
//import dio.minha_primeira_web_api.model.Usuario;
//import dio.minha_primeira_web_api.repository.EnderecoRepository;
//import dio.minha_primeira_web_api.repository.UsuarioRepository;
//import dio.minha_primeira_web_api.service.UsuarioService;
//import dio.minha_primeira_web_api.service.ViaCepService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.Optional;
//
//@Service
//public class UsuarioServiceImpl implements UsuarioService {
//
//    @Autowired
//    private UsuarioRepository usuarioRepository;
//
//    @Autowired
//    private EnderecoRepository enderecoRepository;
//
//    @Autowired
//    private ViaCepService viaCepService;
////
////    @Autowired
////    private PasswordEncoder passwordEncoder;
//
//
//    @Override
//    public Iterable<Usuario> buscarTodos() {
//        return usuarioRepository.findAll();
//    }
//
//    @Override
//    public Usuario buscarPorId(Long id) {
//        if(usuarioRepository.findById(id).isPresent()) {
//            Optional<Usuario> usuario = usuarioRepository.findById(id);
//            return usuario.get();
//        }else{
//            throw new BusinessException("Usuário não encontrado");
//        }
//    }
//
//    @Override
//    public void inserir(Usuario usuario) {
//        String cep = usuario.getEndereco().getCep();
//        Endereco enderecoUsuario = enderecoRepository.findById(cep).orElseGet(() ->{
//           Endereco novoEndereco = viaCepService.consultarCep(cep);
//           enderecoRepository.save(novoEndereco);
//           return novoEndereco;
//        });
//        if (usuario.getRole() == null) {
//            usuario.setRole("USERS"); // Se não passar role, vira user normal
//        }
//        usuario.setEndereco(enderecoUsuario);
//        usuarioRepository.save(usuario);
//    }
//
//    @Override
//    @Transactional
//    public void atualizar(Long id, Usuario usuario) {
//        Optional<Usuario> usuarioBdOptional = usuarioRepository.findById(id);
//
//        if (usuarioBdOptional.isPresent()) {
//            Usuario usuarioBd = usuarioBdOptional.get();
//
//            // Preservar a senha atual
//            usuario.setSenha(usuarioBd.getSenha());
//
//            // Atualizar o endereço
//            String cep = usuario.getEndereco().getCep();
//            Endereco enderecoUsuario = enderecoRepository.findById(cep).orElseGet(() -> {
//                Endereco novoEndereco = viaCepService.consultarCep(cep);
//                enderecoRepository.save(novoEndereco);
//                return novoEndereco;
//            });
//            usuario.setEndereco(enderecoUsuario);
//
//            usuario.setId(id); // garantir que o id é o mesmo
//            usuarioRepository.save(usuario);
//
//        } else {
//            throw new BusinessException("Usuário não encontrado");
//        }
//    }
//
//    public void atualizarSenha(Long id, String senhaAntiga, String senhaNova){
//        Usuario usuario = usuarioRepository.findById(id)
//                .orElseThrow(() -> new BusinessException("Usuário não encontrado"));
//
////        // Comparar senha fornecida com a senha criptografada no banco
////        if (!passwordEncoder.matches(senhaAntiga, usuario.getSenha())) {
////            throw new BusinessException("Senha antiga incorreta");
////        }
////
////        // Criptografar a nova senha antes de salvar
////        usuario.setSenha(passwordEncoder.encode(senhaNova));
//        usuarioRepository.save(usuario);
//    }
//
//
//    @Override
//    public void deletar(Long id) {
//        usuarioRepository.deleteById(id);
//    }
//}
