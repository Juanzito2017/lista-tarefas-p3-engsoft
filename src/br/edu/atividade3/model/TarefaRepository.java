package br.edu.atividade3.model;

import java.util.ArrayList;
import java.util.List;

public class TarefaRepository {

    /*singleton para que o programa gerencie sempre a mesma lista de tarefas como uma array */
    private static TarefaRepository instance;
    private List<Tarefa> tarefas;

    private TarefaRepository(){
        tarefas = new ArrayList<>();
    }
}
