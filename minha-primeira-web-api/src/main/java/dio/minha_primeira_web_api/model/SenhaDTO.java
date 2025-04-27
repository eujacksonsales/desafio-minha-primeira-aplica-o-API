package dio.minha_primeira_web_api.model;

public class SenhaDTO {
    private String senhaAntiga;
    private String senhaNova;

    // Getters e Setters
    public String getSenhaAntiga() {
        return senhaAntiga;
    }

    public void setSenhaAntiga(String senhaAntiga) {
        this.senhaAntiga = senhaAntiga;
    }

    public String getSenhaNova() {
        return senhaNova;
    }

    public void setSenhaNova(String senhaNova) {
        this.senhaNova = senhaNova;
    }
}

