# Pacote `enums`

Contém os tipos enumerados usados pelo domínio.

## `SituacaoServico`

```java
public enum SituacaoServico {
    PENDENTE,
    ABERTO,
    CONCLUIDO,
    EM_SERVIÇO;
}
```

Define os únicos estados possíveis para um serviço (usado no atributo `situacaoServico` da classe `Servico`, do pacote `entities`). Usar um `enum` em vez de uma `String` impede que a situação receba um valor inválido — o compilador só aceita um dos quatro valores listados.
