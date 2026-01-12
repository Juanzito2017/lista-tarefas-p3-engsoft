# Atividade 3 - App "Lista de Tarefas" 📝

Este projeto consiste no desenvolvimento de um programa de Lista de Tarefas em Java. O objetivo é permitir que o usuário gerencie suas atividades.

## 🚀 Funcionalidades

O programa implementa as seguintes operações:
* **Adicionar Tarefa:** O usuário pode cadastrar uma tarefa contendo nome, descrição e status.
* **Listar Tarefas:** O programa exibe todas as tarefas e seus respectivos status.
* **Remover Tarefa:** Permite selecionar uma tarefa específica para exclusão da lista.
* **Alterar Status:** O usuário pode escolher uma tarefa e atualizar seu status.
  * **Status suportados:** Disponível, Fazendo e Feita.

## 🏗️ Padrões de Projeto Utilizados

Foram aplicados dois padrões de projeto:

### 1. Singleton
* **Onde:** Aplicado na classe `TarefaRepository`.
* **Como:** Garante uma única instância do repositório para centralizar o armazenamento e a manipulação dos dados da lista.

### 2. Strategy
* **Onde:**  Na interface `ExibicaoStrategy`.
* **Como:** Implementa estratégias concretas para exibir a lista trocando o comportamento de exibição ao atribuir uma nova implementação quando desejado. As implementações criadas foram `ExibicaoSimples` e `ExibicaoPorStatus`.

## 👥 Colaboradores
O projeto foi desenvolvido por:
* Gabriel Cândido Pereira Marinho ([gabrielmarinho1](https://github.com/gabrielmarinho1))
* Juan Carlos Leite da Silva ([Juanzito2017](https://github.com/Juanzito2017))

---
*Trabalho apresentado para a disciplina de Engenharia de Software da UFMA 2025.2.*