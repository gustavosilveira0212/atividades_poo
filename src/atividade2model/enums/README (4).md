# Pacote `enums`

Contém os tipos enumerados usados pelo domínio da biblioteca.

## `DisponibilidadeLivro`

```java
public enum DisponibilidadeLivro {
    EMPRESTADO,
    DISPONIVEL,
    ATRASADO,
    DEVOLVIDO,
    NAO_DEVOLVIDO;
}
```

Define os estados possíveis de um livro (usado no atributo `disponibilidadeLivro` da classe `Livro`, do pacote `entities`). Usar um `enum` em vez de uma `String` impede que a disponibilidade receba um valor inválido — o compilador só aceita um dos valores listados.
