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

        for (Status s : Status.values()) {
            System.out.println("\n--- STATUS: " + s + " ---");
            boolean temTarefa = false;
            for (int i = 0; i < tarefas.size(); i++) {
                if (tarefas.get(i).getStatus() == s) {
                    System.out.println(i + " - " + tarefas.get(i).getNome() + " - " + tarefas.get(i).getDescricao());
                    temTarefa = true;
                }
            }
            if (!temTarefa) {
                System.out.println("(Vazio)");
            } 
                
        }
    }
}
