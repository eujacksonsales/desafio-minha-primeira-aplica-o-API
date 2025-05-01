//package dio.minha_primeira_web_api.model;
//
//import jakarta.persistence.*;
//
//@Entity(name = "tb_usuario")
//public class Usuario {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
//    private String nome;
//    private String username;
//    private String senha;
//
//    @ManyToOne
//    private Endereco endereco;
//
//    private String role;
//
//    public String getRole() {
//        return role;
//    }
//
//    public void setRole(String role) {
//        this.role = role;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getNome() {
//        return nome;
//    }
//
//    public void setNome(String nome) {
//        this.nome = nome;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getSenha() {
//        return senha;
//    }
//
//    public void setSenha(String senha) {
//        this.senha = senha;
//    }
//
//    public Endereco getEndereco() {
//        return endereco;
//    }
//
//    public void setEndereco(Endereco endereco) {
//        this.endereco = endereco;
//    }
//
//    @Override
//    public String toString() {
//        return "Usuario{" +
//                "id=" + id +
//                ", nome='" + nome + '\'' +
//                ", username='" + username + '\'' +
//                ", senha='" + senha + '\'' +
//                ", endereco=" + endereco +
//                '}';
//    }
//}
