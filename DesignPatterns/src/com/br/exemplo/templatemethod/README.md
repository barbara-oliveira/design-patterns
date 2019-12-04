# Padrão Template Method

O Padrão de Projeto Template Method define os passos de um algoritmo e permite que a implementação de um ou mais desses passos seja fornecida por subclasses. Assim, o Template Method protege o algoritmo e fornece métodos abstratos para que as subclasses possam implementá-los.

## Resumindo

O padrão Template Method basicamente oferece um método que define um algoritmo (uma sequência de passos) que pode, por sua vez, ser definido como abstrato para posteriormente ser implementado por uma subclasse.

![](https://sourcemaking.com/files/v2/content/patterns/Template_method_example.png)

## Pontos positivos

* Reutilizar código sem perder o controle dos algoritmos.
* Permite que os clientes substituam apenas certas partes de um algoritmo grande, tornando-os menos afetados pelas alterações que acontecem com outras partes do algoritmo.
* Colocar o código duplicado em uma superclasse.

## Fontes

* [thiengo](https://www.thiengo.com.br/padrao-de-projeto-strategy-estrategia) - Template Method
* [sourcemaking](https://sourcemaking.com/design_patterns/template_method) - Template Method Design Pattern
* [geeksforgeeks](https://www.geeksforgeeks.org/template-method-design-pattern/) - Template Method Design Pattern
* [devmedia](https://www.devmedia.com.br/padrao-de-projeto-template-method-em-java/26656) - Padrão de Projeto Template Method em Java
