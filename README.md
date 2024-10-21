# POO2-Padroes-de-Projetos
---

### Padrões de Projeto - Programação Orientada a Objetos 2

Este repositório foi criado para armazenar os exercícios práticos realizados na disciplina de Programação Orientada a Objetos 2 (POO2), com foco no estudo e aplicação de padrões de projeto. Esses padrões são soluções comprovadas e reutilizáveis para desafios comuns no desenvolvimento de software orientado a objetos, promovendo manutenção, escalabilidade e flexibilidade dos sistemas.

A seguir, estão listados os laboratórios desenvolvidos ao longo da disciplina, destacando os padrões de projeto abordados.

#### Laboratório 2 - Singleton e Factory

Neste laboratório, foi explorada a implementação de dois padrões de criação: Singleton e Factory. Ambos são utilizados para controlar e flexibilizar o processo de criação de objetos.

**Padrões de Projeto:**
- **Singleton:** Garante que uma classe tenha apenas uma instância e fornece um ponto de acesso global a essa instância.
- **Factory:** Define uma interface para a criação de objetos, delegando às subclasses a decisão de quais classes instanciar.

**Exercícios:**
- Implementação de fábricas de celulares utilizando os padrões Singleton e Factory.
- Simulação de fábricas de veículos, com as fabricantes Toyota e Honda, aplicando os padrões mencionados.

#### Laboratório 3 - Adapter (Wrapper)

O foco deste laboratório foi a implementação do padrão estrutural Adapter, que permite a compatibilidade entre interfaces incompatíveis.

**Padrão de Projeto:**
- **Adapter (Wrapper):** Transforma a interface de uma classe em uma outra interface esperada pelos clientes, permitindo que classes com interfaces diferentes possam trabalhar juntas.

**Exercícios:**
- Implementação de habilidades de aves, como Pato e Pavão, utilizando Adapter para unificar comportamentos.
- Desenvolvimento de uma calculadora capaz de operar com números binários e decimais, usando o padrão Adapter para padronizar operações.
- Proposta e implementação de um sistema de pagamento, utilizando o padrão Adapter. Foram usadas classes como AdaptadorPayPal.java, AdaptadorStripe.java, Pagamento.java, entre outras.

#### Laboratório 4 - Decorator

Este laboratório abordou o padrão Decorator, que adiciona responsabilidades a objetos de forma dinâmica, sem modificar a classe original.

**Padrão de Projeto:**
- **Decorator:** Acrescenta funcionalidades extras a um objeto de maneira dinâmica. É uma alternativa flexível à herança para estender comportamentos.

**Exercícios:**
- Implementação do padrão Decorator em uma pizzaria, onde massas e ingredientes são combinados para criar pizzas personalizadas.
- Criação de uma aplicação de cafeteria, onde diferentes tipos de café podem ser complementados com ingredientes como leite, canela e chocolate, usando o padrão Decorator.

#### Laboratório 5 - Fachada e Proxy

Neste laboratório, foram estudados dois padrões estruturais: Fachada e Proxy. Ambos facilitam a interação com sistemas complexos e o controle de acesso a objetos.

**Padrões de Projeto:**
- **Fachada:** Fornece uma interface simplificada para interagir com subsistemas complexos, escondendo detalhes internos e facilitando o uso por parte do cliente.
- **Proxy:** Atua como intermediário de outro objeto, controlando o acesso a ele e adicionando funcionalidades extras, como controle de acesso ou criação retardada.

**Exercícios:**
- Desenvolvimento de um sistema de home theater utilizando o padrão Fachada para simplificar o controle de vários dispositivos eletrônicos ao assistir filmes.
- Implementação de um sistema de carro em que o padrão Fachada automatiza as ações necessárias para iniciar e desligar o carro.
- Uso do padrão Proxy para implementar uma máquina de lavar, garantindo que o ciclo de lavagem só seja iniciado se a porta estiver corretamente fechada.

Este repositório reflete o aprendizado sobre padrões de projeto, oferecendo exemplos práticos que podem ser aplicados em diferentes cenários de desenvolvimento de software.
