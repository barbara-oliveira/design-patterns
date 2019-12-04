# Padrão Null Object

O padrão Objeto Nulo permite que possamos trabalhar nossos códigos utilizando objetos que não têm ação (vazios) ou têm ações padrões, com isso sempre teremos um objeto e então a não utilização da verificação do valor null em trechos de código onde a lógica não precisa trabalhar com valores null.

## Resumindo

Com esse padrão, é possível evitar os excesso de verificações de objetos nulos, e ainda garantir um valor default para objetos vazios, o exemplo no pacote *geeskforgeeks* é mais explícito e mostra essa vantagem.

#

![](https://media.geeksforgeeks.org/wp-content/uploads/NullObject.png)

## Pontos positivos

* Remove a necessidade de ter lógica especial para verificação de valor null, consequentemente não inflando o projeto de software.
* Fornece um comportamento padrão caso os dados não estejam disponíveis
* Simplifica o código cliente. Os clientes podem tratar colaboradores reais e colaboradores nulos de maneira uniforme. 

## Ponto de atenção

* Não devemos implementar esse padrão apenas para evitar verificações nulas e tornar o código mais legível. Na verdade, é mais difícil ler o código que é movido para outro local, como a classe de objeto nulo.

## Fontes

* [thiengo](https://www.thiengo.com.br/padrao-de-projeto-objeto-nulo) - Padrão de Projeto: Objeto Nulo
* [geeksforgeeks](https://www.geeksforgeeks.org/null-object-design-pattern/) - Null object Design Pattern
* [dzone](https://dzone.com/articles/null-object-pattern-in-java) - Null Object Pattern in Java
* [guj](https://respostas.guj.com.br/11858-padrao-null-object) - Padrão Null Object
