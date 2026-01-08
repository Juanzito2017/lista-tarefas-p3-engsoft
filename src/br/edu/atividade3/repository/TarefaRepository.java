package br.edu.atividade3.repository;

import java.util.ArrayList;
import java.util.List;

import br.edu.atividade3.model.Tarefa;

public class TarefaRepository {

    /*singleton para que o programa gerencie sempre a mesma lista de tarefas como uma array */
    private static TarefaRepository instance;
    private List<Tarefa> tarefas;

    private TarefaRepository(){
        tarefas = new ArrayList<>();
    }

    /*cria lista se nao existir e retorna se ja existir*/

    public static synchronized TarefaRepository getInstance(){
        if(instance == null){
            instance = new TarefaRepository();
        }
        return instance;
    }

    /* cria tarefa*/
    public void adicionar(Tarefa t){
        tarefas.add(t);
    }

    /*remove tarefa pelo index */
    public void remover(int index){
        tarefas.remove(index);
    }

    /*retorna lista atualizada */
    public List<Tarefa> listar(){
        return tarefas;
    }
}
