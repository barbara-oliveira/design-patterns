# Padrão Strategy

Com esse padrão, é possível realizar a mesma operação de diferentes maneiras.
A solução proposta por ele consiste em delegar a execução do algoritmo para uma instância que compõe a classe principal. Dessa forma, quando a funcionalidade for invocada, no momento da execução do algoritmo será invocado um método da instância que o compõe.

## Resumindo

Por meio de polimorfismo, esse padrão nos permite adicionar/alterar implementações de um método em comum, deixando-as encapsuladas, sem que impacte as chamadas realizadas pelo cliente.

#

![](https://www.thiengo.com.br/img/post/normal/09j782i4d422a779bkf7907oi3950ab95fe613edf46f2c3cebb61d52d3.jpg)

## Pontos positivos

* O algoritmo pode ser alterado sem a modificação da classe. A partir dessa estrutura, novas implementações dele podem ser criadas e introduzidas posteriormente.
* A lógica condicional na classe principal é reduzida.
* A implementação pode ser trocada em tempo de execução, fazendo com que o comportamento da classe possa ser trocado dinamicamente.

## Fontes

* [thiengo](https://www.thiengo.com.br/padrao-de-projeto-strategy-estrategia) - Padrão de Projeto: Strategy (Estratégia)
* [brizeno](https://brizeno.wordpress.com/category/padroes-de-projeto/strategy/) - Mão na massa: Strategy
* [Livro - Design Patterns com Java](https://www.casadocodigo.com.br/products/livro-design-patterns) - Projeto orientado a objetos guiado por padrões
