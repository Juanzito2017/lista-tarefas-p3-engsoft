package br.edu.atividade3.strategy;

import br.edu.atividade3.model.Tarefa;
import java.util.List;

public class ExibicaoSimples implements ExibicaoStrategy {
    @Override
    public void exibir(List<Tarefa> tarefas) {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
            return;
        }
        for(int i = 0; i < tarefas.size(); i++) {
            System.out.println(i + " - " + tarefas.get(i).toString());
        }
    }

}
