algoritmo "Agencia De Viagens"
// Disciplina   : Módulo 2 - Iniciação ao Mundo da Computação,
//                Programação de Computadores e Front-end Fundamentos

// Professor: Marcelo Vasques

// Description : Menu para registrar dados sobre clientes e destinos de viagem.

// Author: Jonnathan Ribeiro dos Santos

var
   clientes: vetor[1..100] de caractere
   destinos: vetor[1..100] de caractere
   opcao, i: inteiro
   nome, destino: caractere
   
inicio
   repita
      escreval("Menu:")
      escreval("1. Cadastrar cliente")
      escreval("2. Cadastrar destino")
      escreval("3. Consultar clientes")
      escreval("4. Consultar destinos")
      escreval("5. Sair")
      leia(opcao)
      escolha opcao
         caso 1
            escreval("Digite o nome do cliente:")
            leia(nome)
            i <- 1
            enquanto (clientes[i] <> "") e (i <= 100) faca
               i <- i + 1
            fimenquanto
            se i <= 100 entao
               clientes[i] <- nome
               escreval("Cliente cadastrado com sucesso!")
            senao
               escreval("Erro: limite de clientes atingido!")
            fimse
         caso 2
            escreval("Digite o destino:")
            leia(destino)
            i <- 1
            enquanto (destinos[i] <> "") e (i <= 100) faca
               i <- i + 1
            fimenquanto
            se i <= 100 entao
               destinos[i] <- destino
               escreval("Destino cadastrado com sucesso!")
            senao
               escreval("Erro: limite de destinos atingido!")
            fimse
         caso 3
            escreval("Clientes cadastrados:")
            para i de 1 ate 100 faca
               se clientes[i] <> "" entao
                  escreval(clientes[i])
               fimse
            fimpara
         caso 4
            escreval("Destinos cadastrados:")
            para i de 1 ate 100 faca
               se destinos[i] <> "" entao
                  escreval(destinos[i])
               fimse
            fimpara
         caso contrario
            se opcao <> 5 entao
               escreval("Opção inválida!")
            fimse
      fimescolha
   ate opcao = 5

fimalgoritmo