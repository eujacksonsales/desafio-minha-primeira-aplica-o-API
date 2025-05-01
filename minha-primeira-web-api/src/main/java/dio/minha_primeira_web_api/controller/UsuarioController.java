//package dio.minha_primeira_web_api.controller;
//
//import dio.minha_primeira_web_api.model.SenhaDTO;
//import dio.minha_primeira_web_api.model.Usuario;
//import dio.minha_primeira_web_api.service.UsuarioService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/users")
//public class UsuarioController {
//    @Autowired
//    private UsuarioService usuarioService;
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deletePorId(@PathVariable("id") Long id){
//        usuarioService.deletar(id);
//        return ResponseEntity.ok().build();
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<Usuario> atualizarUsuario(@PathVariable Long id, @RequestBody Usuario usuario){
//        usuarioService.atualizar(id, usuario);
//        return ResponseEntity.ok(usuario);
//    }
//
//    @PutMapping("/{id}/password")
//    public ResponseEntity<Void> atualizarSenha(@PathVariable Long id, @RequestBody SenhaDTO senhaDTO) {
//        usuarioService.atualizarSenha(id, senhaDTO.getSenhaAntiga(), senhaDTO.getSenhaNova());
//        return ResponseEntity.ok().build();
//    }
//}
