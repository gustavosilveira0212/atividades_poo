# Pacote `entities`

Contém as classes que representam as entidades do domínio da assistência técnica: o cliente, o equipamento e o serviço (ordem de serviço).

## `Cliente`

Representa a pessoa dona do equipamento.

**Atributos:**
- `nome` (`String`) — nome do cliente.
- `telefone` (`String`) — telefone de contato.

**Comportamentos:** getters/setters e `toString()`, que formata a exibição dos dados do cliente. Esse comportamento fica na própria classe porque é ela quem detém as informações necessárias para exibi-las.

## `Equipamento`

Representa o aparelho que deu entrada na assistência.

**Atributos:**
- `tipoEquipamento` (`String`) — ex: notebook, computador.
- `marcaEquipamento` (`String`) — ex: Dell, Pichau.
- `modelo` (`String`) — modelo específico do aparelho.

**Comportamentos:** getters/setters e `toString()`, que formata a exibição dos dados do equipamento, pelo mesmo motivo da classe `Cliente`.

## `Servico`

Classe central do pacote: representa a ordem de serviço e associa um `Cliente` a um `Equipamento` (composição — `Servico` *tem um* `Cliente` e *tem um* `Equipamento`, não herda deles).

**Atributos:**
- `cliente` (`Cliente`)
- `equipamento` (`Equipamento`)
- `valorServico` (`Double`) — valor da mão de obra.
- `descricaoServico` (`String`) — defeito informado.
- `situacaoServico` (`SituacaoServico`, do pacote `enums`) — estado atual do serviço.
- `precoPeca` (`Double`) — valor de peça usada no reparo.

**Comportamentos:**
- `finalizarServico()` — muda `situacaoServico` para `CONCLUIDO`.
- `calcularValorFinal()` — soma `valorServico` + `precoPeca` usando a variável **local** `valorFinal` (local porque é só um resultado momentâneo, recalculável a qualquer momento a partir dos atributos existentes — não precisa ser guardado no objeto).
- `toString()` — monta a exibição completa reaproveitando os `toString()` de `Cliente` e `Equipamento`.

> Atenção: `getValorServico()` está retornando `situacaoServico` em vez de `valorServico` — parece um erro de nome ao gerar o getter, vale corrigir.
