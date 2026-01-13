package br.edu.atividade3.model;

public class Tarefa {
    private String nome;
    private String descricao;
    private Status status;

    //método construtor
    public Tarefa(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.status = Status.DISPONIVEL; //esse atributo sempre inicializará com o Status disponível
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return String.format("[%s] %s - %s", status, nome, descricao);
    }


}
