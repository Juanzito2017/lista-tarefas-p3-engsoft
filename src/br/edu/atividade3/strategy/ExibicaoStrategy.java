package br.edu.atividade3.strategy;

import br.edu.atividade3.model.Tarefa;
import java.util.List;

//interface para aplicação do padrão Strategy
public interface ExibicaoStrategy {
    void exibir(List<Tarefa> tarefas);
}
