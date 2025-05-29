# Exercícios de Padrões de Projeto em Java

Este repositório contém 7 exercícios práticos que abordam padrões de projeto em Java. Cada exercício é focado em um padrão específico e está organizado em sua própria pasta, contendo o código-fonte e o enunciado detalhado para facilitar o aprendizado e a compreensão.

## Padrões de Projeto Abordados

---

### **State (2 exercícios)**

O padrão **State** permite que um objeto altere seu comportamento quando seu estado interno muda. Isso faz com que o objeto pareça mudar sua classe. É útil para sistemas onde o comportamento de um objeto depende de seu estado atual, evitando grandes condicionais (`if/else` ou `switch`) e tornando o código mais flexível e fácil de manter. Permite a um objeto alterar seu comportamento quando seu estado interno muda. O objeto parecerá ter mudado de classe.

---

### **Chain of Responsibility (1 exercício)**

O padrão **Chain of Responsibility** permite que você passe requisições ao longo de uma cadeia de manipuladores. Ao receber uma requisição, cada manipulador decide se a processa ou se a passa para o próximo manipulador na cadeia. Esse padrão é ideal para desacoplar o remetente de uma requisição de seu receptor, permitindo que múltiplos objetos tenham a chance de processar a requisição sem acoplar o cliente a um manipulador específico.

---

### **Decorator (1 exercício)**

O padrão Decorator permite estender as funcionalidades de um objeto em tempo de execução usando uma forma de composição de objetos. A ideia central é modificar o comportamento de um método em um objeto, adicionando-lhe processamento adicional.

---

### **Observer (1 exercício)**

O padrão **Observer** define uma dependência um-para-muitos entre objetos, de modo que quando um objeto muda de estado, todos os seus dependentes são notificados e atualizados automaticamente. É amplamente utilizado em sistemas baseados em eventos, como interfaces gráficas de usuário (GUIs), onde várias partes da aplicação precisam reagir a mudanças em um único objeto.

---

### **Composite (1 exercício)**

O padrão **Composite** permite que você componha objetos em estruturas de árvore para representar hierarquias de "parte-todo". Ele permite que os clientes tratem objetos individuais e composições de objetos de forma uniforme. 

---

### **Strategy (1 exercício)**

O padrão Strategy permite que você defina uma família de algoritmos, coloque cada um deles em uma classe separada e torne seus objetos intercambiáveis. Ele permite que o algoritmo varie independentemente dos clientes que o utilizam. Isso é útil quando você tem várias maneiras de executar uma tarefa específica e deseja que o cliente possa escolher qual algoritmo usar em tempo de execução, ou que o comportamento seja facilmente alterável.
