# Pacote `entities`

Contém as classes que representam as entidades do domínio da biblioteca universitária: o estudante, o livro e o empréstimo.

## `Estudante`

Representa o aluno que pode retirar livros emprestados.

**Atributos:**
- `nome` (`String`)
- `matricula` (`String`)
- `curso` (`String`)

**Comportamentos:** getters/setters e `toString()`, que formata a exibição dos dados do estudante. Fica aqui porque é a própria classe quem detém as informações necessárias para exibi-las.

## `Livro`

Representa um exemplar disponível no acervo da biblioteca.

**Atributos:**
- `titulo` (`String`)
- `autor` (`String`)
- `codigo` (`String`)
- `disponibilidadeLivro` (`DisponibilidadeLivro`, do pacote `enums`) — estado atual do livro.

**Comportamentos:** getters/setters e `toString()`, que formata a exibição dos dados do livro, incluindo sua disponibilidade.

## `Emprestimo`

Classe central do pacote: representa o empréstimo e associa um `Estudante` a um `Livro` (composição — `Emprestimo` *tem um* `Estudante` e *tem um* `Livro`, não herda deles).

**Atributos:**
- `estudante` (`Estudante`)
- `livro` (`Livro`)
- `diasDisponiveis` (`int`) — prazo de devolução.
- `diasAtraso` (`int`) — dias em atraso na devolução.

**Comportamentos:**
- `emprestar()` — muda `disponibilidadeLivro` do livro associado para `EMPRESTADO`. Fica em `Emprestimo` (e não em `Livro`) porque é o empréstimo quem representa a operação de retirada, ainda que quem sofra a mudança de estado seja o `Livro`.
- `devolver()` — muda `disponibilidadeLivro` do livro associado para `DEVOLVIDO`.
- `calcularMulta()` — calcula `diasAtraso * 0.50` usando a variável **local** `valorMulta`. É local porque é só um resultado de cálculo momentâneo, recalculável a qualquer momento a partir de `diasAtraso` — não há necessidade de guardá-lo permanentemente no objeto.
- `toString()` — monta a exibição completa reaproveitando os `toString()` de `Estudante` e `Livro`, e chamando `calcularMulta()`.

**Por que o valor da multa por dia (0.50) não é parâmetro do método:** no código atual ele está fixo dentro de `calcularMulta()`. O enunciado original pedia que esse valor fosse recebido como parâmetro do método — vale revisar se isso é esperado na correção.
