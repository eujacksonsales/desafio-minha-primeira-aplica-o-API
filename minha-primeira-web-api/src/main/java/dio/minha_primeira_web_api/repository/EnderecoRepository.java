package dio.minha_primeira_web_api.repository;

import dio.minha_primeira_web_api.model.Endereco;
import org.springframework.data.repository.CrudRepository;

public interface EnderecoRepository extends CrudRepository<Endereco, String> {

}
