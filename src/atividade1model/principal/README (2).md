# Pacote `principal`

Contém o ponto de entrada da aplicação.

## `Main`

Não representa nenhuma entidade do domínio — sua única responsabilidade é orquestrar os objetos das outras classes:

1. Cria dois objetos `Cliente` (`cliente1`, `cliente2`) com dados diferentes.
2. Cria dois objetos `Equipamento` (`equipamento1`, `equipamento2`) com dados diferentes.
3. Cria dois objetos `Servico` (`ordemServico1`, `ordemServico2`), cada um associando um cliente e um equipamento diferentes, com valores e situações diferentes (via `SituacaoServico`, do pacote `enums`).
4. Imprime os dois serviços com `System.out.println()`, o que aciona o `toString()` de cada `Servico`.

Como cada `Servico` referencia objetos `Cliente` e `Equipamento` próprios, alterar o estado de um serviço não afeta o outro — o que demonstra que cada objeto instanciado a partir da mesma classe mantém seu próprio estado, independente dos demais.
