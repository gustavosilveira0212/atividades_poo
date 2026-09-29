# Atividades POO 5 - Variáveis de Referência e Sobrecarga

## Questão 1: Variáveis de Referência e Relacionamento TEM-UM

### `Cliente`

Representa um cliente do sistema de entregas.

**Atributos:**
- `nome` (`String`)
- `cpf` (`String`)
- `endereco` (`Endereco`) — objeto que representa o endereço do cliente.

**Comportamentos:** construtor, getters/setters e `toString()` que exibe os dados do cliente junto com o endereço completo.

**Por que `endereco` é um objeto separado:** ao invés de copiar os atributos de endereço (rua, número, cidade) diretamente na classe `Cliente`, a gente cria uma referência para um objeto `Endereco`. Isso evita duplicação de código se outras classes também precisarem de endereço (como fornecedor, funcionário, etc.). Mudanças no endereço são feitas em um único lugar.

### `Endereco`

Representa um endereço que pode ser reutilizado por diferentes classes.

**Atributos:**
- `rua` (`String`)
- `numero` (`int`)
- `cidade` (`String`)

**Comportamentos:** construtor, getters/setters e `toString()` que formata a exibição do endereço.

**Por que existe como classe separada:** permite que qualquer entidade que tenha endereço (Cliente, Fornecedor, Funcionário, etc.) reutilize a mesma classe sem duplicação. Além disso, se for necessário adicionar novos atributos ao endereço (CEP, bairro, complemento), basta alterar uma única classe.

---

## Questão 2: Sobrecarga de Métodos

### `Ingresso`

Representa um ingresso de cinema com diferentes formas de calcular o valor final dependendo de desconto.

**Atributos:**
- `filme` (`String`)
- `valor` (`double`) — valor base do ingresso.

**Comportamentos:** construtor e três versões sobrecarregadas de `calcularValor()`:

- `calcularValor()` — sem parâmetros, retorna o valor normal do ingresso. Usado quando não há desconto.

- `calcularValor(double percentualDesconto)` — recebe um percentual (ex: 10 para 10%), calcula e retorna o valor com desconto percentual aplicado.

- `calcularValor(double desconto, boolean descontoFixo)` — recebe um valor de desconto e um booleano. Se `descontoFixo` é true, subtrai o valor fixo; se é false, retorna o valor normal. Usado para descontos em valores fixos (ex: R$ 15).

**Por que sobrecarga ao invés de nomes diferentes:** se usássemos nomes diferentes como `calcularValorSemDesconto()`, `calcularValorComPercentual()`, `calcularValorComFixo()`, o código fica mais confuso. Com sobrecarga, quem usa a classe chama sempre `calcularValor()` e o Java escolhe qual método usar baseado nos parâmetros. É mais intuitivo porque o conceito é o mesmo — calcular valor — só muda *como* calcular.

**Desvantagem:** se existissem muitas versões sobrecarregadas, ficaria difícil saber qual usar. Nesse caso com três versões está tranquilo.

---

## Como rodar

Compile:
```bash
javac -d bin src/atividade5model/**/*.java
```

Execute:
```bash
java -cp bin atividade5model.principalatividade5.Main
```

Isso mostra na tela o valor do ingresso em três situações diferentes: sem desconto, com desconto percentual e com desconto fixo.

---

## Documentação das respostas

- `justify1.md` — respostas detalhadas das questões 1.1 a 1.9
- `justify2.md` — respostas detalhadas das questões 2.1 a 2.10
