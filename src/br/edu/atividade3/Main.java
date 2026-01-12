package br.edu.atividade3;

import br.edu.atividade3.model.*;
import br.edu.atividade3.repository.TarefaRepository;
import br.edu.atividade3.strategy.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            TarefaRepository repo = TarefaRepository.getInstance(); /*utilizacao do singleton */
            ExibicaoStrategy exibicao = new ExibicaoSimples(); /*utilizacao do stategy */

            /*exibicao do menu */
            while (true) {
                System.out.println("\n--- MENU APP TAREFAS ---");
                System.out.println("1. Adicionar Tarefa");
                System.out.println("2. Listar Tarefas");
                System.out.println("3. Remover Tarefa");
                System.out.println("4. Alterar Status");
                System.out.println("5. Sair");
                System.out.print("Escolha: ");
                
                /*tratamento de entrada vazia */
                if (!sc.hasNextInt()) {
                    System.out.println("Erro: Entrada inválida.");
                    sc.nextLine();
                    continue;
                }

                int opcao = sc.nextInt();
                sc.nextLine();
                
                /*processamento das acoes */
                try {
                    switch (opcao) {
                        case 1 -> {
                            /*controle de erro */
                            String nome;
                           do {
                                System.out.print("Nome: ");
                                nome = sc.nextLine().trim();
                                if (nome.isEmpty()){
                                    System.out.println("Erro: Nome da tarefa não pode ser vazio.");
                                }
                           } while (nome.isEmpty());

                           /*descricao pode ser vazia */
                            System.out.print("Descrição: ");
                            String desc = sc.nextLine();
                            repo.adicionar(new Tarefa(nome, desc));
                        }
                        case 2 -> exibicao.exibir(repo.listar());
                        case 3 -> {
                            System.out.print("Índice para remover: ");

                            /*tratamento de erro */
                            if (sc.hasNextInt()){
                                int idx = sc.nextInt();
                                if (idx >= 0 && idx < repo.listar().size()){
                                    repo.remover(idx);
                                } else {
                                    System.out.println("Erro. Tarefa não encontrada.");
                                    sc.nextLine();
                                }
                            }
    
                        }
                        case 4 -> {
                            System.out.print("Índice da tarefa: ");
                            /*mais tratamento de erro */
                            if (sc.hasNextInt()){
                                int idx = sc.nextInt();
                                if (idx >= 0 && idx < repo.listar().size()){
                                    System.out.println("Status: 1-DISPONIVEL, 2-FAZENDO, 3-FEITA");
                                    if (sc.hasNextInt()){
                                        int st = sc.nextInt();
                                        if (st >= 1 && st <= 3){
                                            repo.listar().get(idx).setStatus(Status.values()[st-1]);
                                            System.out.println("Status atualizado com sucesso.");
                                        } else {
                                            System.out.println("Erro: Opção inválida.");
                                            sc.nextLine();
                                        }
                                    } else {
                                        System.out.println("Erro: Entrada inválida.");
                                        sc.nextLine();
                                    }
                            } else {
                                System.out.println("Erro. Tarefa não encontrada.");
                                sc.nextLine();
                            }
                        } else {
                                System.out.println("Erro: Índice inválido.");
                                sc.nextLine();
                            }
                        }
                        case 5 -> {
                            System.out.println("Saindo...");
                            return;
                        }
                        default -> System.out.println("Erro: Opção inválida.");
                    }
                } catch (Exception e) { /*tratamento de erro */
                    System.out.println("Erro: Entrada inválida.");
                    sc.nextLine();
                }
            }
        }
    }
}