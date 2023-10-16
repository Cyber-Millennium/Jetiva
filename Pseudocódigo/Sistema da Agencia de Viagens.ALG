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
   vazio: logico // Declara uma variável booleana para verificar se os vetores estão vazios

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
         escreva("Digite o nome do cliente:")
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
         escreva("Digite o destino:")
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
         vazio <- verdadeiro // Atribui verdadeiro a vazio antes de percorrer o vetor clientes
         para i de 1 ate 100 faca
            se clientes[i] <> "" entao
               escreval(clientes[i])
               vazio <- falso // Muda o valor de vazio para falso se encontrar algum elemento não vazio
            fimse
         fimpara

         // Verifica se vazio ainda é verdadeiro depois do laço e exibe a mensagem correspondente
         se vazio entao
            escreval("Nenhum cliente cadastrado.")
         senao
            escreval("Fim da lista de clientes.")
         fimse

         // Adiciona uma pausa antes de limpar a tela
         escreval("Pressione Enter para continuar...")
         leia(nome) // Usa a variável 'nome' como uma variável temporária para armazenar o valor lido pelo comando 'leia'
      caso 4
         escreval("Destinos cadastrados:")
         vazio <- verdadeiro // Atribui verdadeiro a vazio antes de percorrer o vetor destinos
         para i de 1 ate 100 faca
            se destinos[i] <> "" entao
               escreval(destinos[i])
               vazio <- falso // Muda o valor de vazio para falso se encontrar algum elemento não vazio
            fimse
         fimpara

         // Verifica se vazio ainda é verdadeiro depois do laço e exibe a mensagem correspondente
         se vazio entao
            escreval("Nenhum destino cadastrado.")
         senao
            escreval("Fim da lista de destinos.")
         fimse

         // Adiciona uma pausa antes de limpar a tela
         escreval("Pressione Enter para continuar...")
         leia(destino) // Usa a variável 'destino' como uma variável temporária para armazenar o valor lido pelo comando 'leia'
      outrocaso
         se opcao <> 5 entao
            escreval("Opção inválida!")
         fimse

      fimescolha

      // Limpa a tela antes de exibir o menu novamente, mas somente se o usuário não escolheu sair do programa.
      se opcao <> 5 entao
         limpatela
      fimse

   ate opcao = 5

fimalgoritmo