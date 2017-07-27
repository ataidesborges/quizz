
package model;

public class Resposta {
    private int id;
    private String descricao;
    private int id_pergunta;

    public Resposta(int id, String descricao, int id_pergunta) {
        this.id = id;
        this.descricao = descricao;
        this.id_pergunta = id_pergunta;
    }

    public Resposta(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public Resposta() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getId_pergunta() {
        return id_pergunta;
    }

    public void setId_pergunta(int id_pergunta) {
        this.id_pergunta = id_pergunta;
    }
    
    
}
