# Padrão Bridge

A intenção do padrão Bridge é desacoplar uma abstração da sua implementação, de modo que as duas possam variar independentemente.

## Resumindo

Esse padrão nos permite especializar não somente a implementação de um método como também sua classe, os exemplos criados acima demonstram situações em que uma classe abstrata tem suas especializações e implementações de métodos, mas estes mesmos métodos podem possuir especialiazções prórpias sem necessariamente depender da classe em que os mesmos estão sendo utilizados.

#

![](https://brizeno.files.wordpress.com/2011/10/classdiagram.png)


## Pontos positivos

* A capacidade de evitar uma ligação permanente entre uma abstração e a implementação.
* A propriedade de permitir a extensão de uma abstração.
* A proteção dos clientes com relação as alterações de implementação.
* A capacidade de esconder completamente a implementação do cliente.

## Fontes

* [brizeno](https://brizeno.wordpress.com/category/padroes-de-projeto/bridge/) - Bridge
* [fpierin](https://fpierin.wordpress.com/2011/08/02/explorando-os-beneficios-do-uso-do-design-pattern-bridge/) - Explorando os benefícios do uso do Design Pattern Bridge
* [refactoring.guru](https://refactoring.guru/design-patterns/bridge/java/example) - Bridge in Java
