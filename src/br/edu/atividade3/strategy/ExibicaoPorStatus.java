package br.edu.atividade3.strategy;

import br.edu.atividade3.model.Status;
import br.edu.atividade3.model.Tarefa;
import java.util.List;

public class ExibicaoPorStatus implements ExibicaoStrategy {
    @Override
    public void exibir(List<Tarefa> tarefas) {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa para exibir.");
            return;
        }
    }
}
