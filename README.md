Estruturas de Dados – Pilha e Fila em Java

Aluno
Davi Antônio Galeano Lazzaroto

Descrição do Projeto

Este projeto tem como objetivo demonstrar, na prática, o funcionamento de duas estruturas de dados fundamentais:

- Pilha (Stack)
- Fila (Queue)

As duas estruturas foram implementadas manualmente em Java, utilizando arrays como base, sem o uso de classes prontas da linguagem como `Stack`, `Queue`, `ArrayList` ou similares.

O sistema possui um menu interativo no console, permitindo ao usuário testar todas as operações disponíveis em cada estrutura.


Conceitos Utilizados

Pilha (Stack)

A pilha segue o modelo LIFO (Last In, First Out), ou seja:

> O último elemento que entra é o primeiro que sai.

Exemplo: pilha de pratos.

Operações implementadas:
- `push()` → adiciona elemento
- `pop()` → remove elemento
- `peek()` → visualiza o topo
- `isEmpty()` → verifica se está vazia
- `isFull()` → verifica se está cheia
- `display()` → exibe os elementos


Fila (Queue)

A fila segue o modelo FIFO (First In, First Out), ou seja:

> O primeiro elemento que entra é o primeiro que sai.

Exemplo: fila de mercado.

Operações implementadas:
- `enqueue()` → adiciona elemento
- `dequeue()` → remove elemento
- `front()` → visualiza o primeiro
- `isEmpty()` → verifica se está vazia
- `isFull()` → verifica se está cheia
- `display()` → exibe os elementos

Funcionamento Interno

- Os dados são armazenados em arrays
- O controle é feito por variáveis:

Pilha:
- `topo` → controla a posição do último elemento

Fila:
- `fim` → controla onde inserir novos elementos
- remoção feita na posição `0`, com deslocamento dos elementos

Menu Interativo:

O programa possui um menu no terminal com as opções:

1 - Pilha
2 - Fila
3 - Sair


Dentro de cada opção, o usuário pode executar todas as operações disponíveis.

exemplo de Uso

Pilha:
- Inserir produtos
- Exibir pilha
- Visualizar topo
- Remover elemento

- Fila:
- Inserir produtos
- Exibir fila
- Visualizar primeiro elemento
- Remover elemento

Estrutura do Projeto

Main.java
Produto.java
PilhaArray.java
FilaArray.java

Como Executar

1. Abra o projeto em uma IDE (ex: IntelliJ ou Eclipse)
2. Compile os arquivos `.java`
3. Execute a classe `Main`
4. Utilize o menu no console

Tratamento de Erros

O sistema trata situações como:

- Inserção em estrutura cheia
- Remoção em estrutura vazia

Vídeo de Apresentação
--> https://youtu.be/yxDMjW9TSzY

Considerações Finais

Este projeto permitiu compreender na prática:

- O funcionamento das estruturas de dados
- A lógica de controle usando arrays
- Diferença entre LIFO e FIFO
- Manipulação manual de dados sem estruturas prontas

