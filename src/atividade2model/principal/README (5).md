# Pacote `principal`

Contém o ponto de entrada da aplicação.

## `Main`

Não representa nenhuma entidade do domínio — sua única responsabilidade é orquestrar os objetos das outras classes:

1. Cria dois objetos `Estudante` (`estudante1`, `estudante2`) com dados diferentes.
2. Cria dois objetos `Livro` (`livro1`, `livro2`) com dados e disponibilidades diferentes (via `DisponibilidadeLivro`, do pacote `enums`).
3. Cria dois objetos `Emprestimo` (`emprestimo1`, `emprestimo2`), cada um associando um estudante e um livro diferentes, com quantidades de dias de atraso diferentes.
4. Imprime os dois empréstimos com `System.out.println()`, o que aciona o `toString()` de cada `Emprestimo`.

Como cada `Emprestimo` referencia objetos `Estudante` e `Livro` próprios, cada objeto criado a partir da mesma classe mantém seu próprio estado, independente dos demais — é possível notar isso pelos livros `livro1` e `livro2`, que têm disponibilidades diferentes mesmo sendo instâncias da mesma classe `Livro`.
