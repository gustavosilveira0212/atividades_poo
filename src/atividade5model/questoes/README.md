<!-- Maria Fernanda Peres Gonçalves
Gustavo Silveira Prado -->

# Atividades POO 5 - Variáveis de Referência e Sobrecarga

## Questão 1: Variáveis de Referência e Relacionamento TEM-UM

### Conceito

Quando você precisa que uma classe use dados de outra classe, você pode copiar os atributos ou criar uma referência para o objeto. Aqui a gente explorou por que usar um objeto separado é melhor.

### Classes Implementadas

#### Cliente

Representa um cliente que possui um endereço.

**Atributos:**
- `nome` (String)
- `cpf` (String)
- `endereco` (Endereco) — referência para um objeto de endereço

**Comportamentos:** construtor que recebe nome, CPF e endereço; getters/setters; toString() que exibe os dados do cliente junto com o endereço.

#### Endereco

Representa um endereço que pode ser usado por qualquer entidade do sistema.

**Atributos:**
- `rua` (String)
- `numero` (int)
- `cidade` (String)

**Comportamentos:** construtor, getters/setters, toString() que formata a exibição do endereço.

### Por que usar uma referência para Endereco

Ao invés de copiar `rua`, `numero` e `cidade` diretamente na classe Cliente, a gente cria um objeto Endereco separado. Isso evita duplicação: se depois precisar que Fornecedor, Funcionário ou outro tenha endereço também, reutiliza a mesma classe. Se precisar adicionar CEP ou bairro, altera em um só lugar.

### Pontos-chave

1. **Variáveis de referência** não armazenam o objeto em si, armazenam o endereço dele na memória
2. **Stack** guarda a referência; **Heap** guarda o objeto de verdade
3. **Null** significa que a referência não aponta para nenhum objeto
4. **Reutilização** fica mais fácil quando as coisas são separadas em classes

---

## Questão 2: Sobrecarga de Métodos

### Conceito

Sobrecarga permite criar vários métodos com o mesmo nome mas com parâmetros diferentes. Java sabe qual usar baseado nos parâmetros que você passa.

### Classe Implementada

#### Ingresso

Representa um ingresso de cinema com diferentes formas de calcular o preço final.

**Atributos:**
- `filme` (String)
- `valor` (double) — preço base do ingresso

**Comportamentos:** construtor e três versões de calcularValor():

1. `calcularValor()` — sem parâmetros, retorna o valor normal
2. `calcularValor(double percentualDesconto)` — recebe percentual (tipo 10 para 10%), retorna com desconto percentual
3. `calcularValor(double desconto, boolean descontoFixo)` — se descontoFixo for true, subtrai o valor fixo; senão retorna o valor normal

### Por que sobrecarga aqui

Se usássemos nomes diferentes como `calcularValorNormal()`, `calcularValorComPercentual()`, `calcularValorComFixo()`, o código fica confuso. Com sobrecarga, sempre usa `calcularValor()` e o Java escolhe qual chamar. É mais intuitivo porque o conceito é o mesmo — calcular o preço — só muda *como*.

### Vantagem

O código fica mais limpo e fácil de usar. Quem está usando a classe não precisa memorizar nomes diferentes de métodos.

### Desvantagem

Se tiver muitas versões sobrecarregadas, fica difícil saber qual usar. Precisa documentar bem ou o código fica confuso.

---

## Como Rodar

**Compilar:**
```bash
javac -d bin src/atividade5model/**/*.java
```

**Executar:**
```bash
java -cp bin atividade5model.principalatividade5.Main
```

Vai mostrar o valor do ingresso em três situações: sem desconto, com percentual e com fixo.

---

## Documentação das Respostas

- `justify1.md` — respostas completas das questões 1.1 a 1.9
- `justify2.md` — respostas completas das questões 2.1 a 2.10