> Questão 2:

2.1 R: Os métodos sobrecarregados são:
calcularValor() - sem parâmetros, retorna o valor normal
calcularValor(double percentualDesconto) - recebe um percentual de desconto
calcularValor(double desconto, boolean descontoFixo)- recebe um valor de desconto e um booleano indicando se é fixo

2.2 R: Java consegue diferenciar os três métodos porque eles têm assinaturas diferentes. A assinatura é formada pelo nome do método e seus parâmetros, tipo e quantidade. Mesmo tendo o mesmo nome, cada um possui uma combinação única de parâmetros, o que permite que o compilador identifique qual método chamar em cada situação.

2.3 R: Não, a implementação não seria válida. Apenas alterar o nome do parâmetro, de "percentualDesconto" para "desconto", não cria uma sobrecarga válida se os tipos e quantidade de parâmetros continuarem iguais. Java diferencia métodos pela assinatura, nome do método e os tipos dos parâmetros, e não pelos nomes das variáveis. O compilador geraria um erro de método duplicado.

2.4 R: Os dois novos métodos propostos são:
calcularValor(double percentual) - recebe um percentual de desconto
calcularValor(double desconto) - recebe um valor fixo de desconto

Esses métodos são válidos pois possuem assinaturas diferentes dos existentes e um do outro, devido aos parâmetros, permitindo a sobrecarga correta.

2.5 R: Quando o parâmetro descontoFixo é false, o método ignora o parâmetro desconto e retorna calcularValor(), o que não é prático. Ao chamar esse método, precisaria saber dessa peculiaridade. Além disso, passa uma informação false para não aplicar o desconto, quando poderia existir um método específico para isso. O código compila, mas sua lógica é confusa.

2.6 R:
package atividade5model.entities;

public class Ingresso {
    private String filme;
    private double valor;

    public Ingresso(String filme, double valor) {
        this.filme = filme;
        this.valor = valor;
    }

    // Retorna o valor sem desconto
    public double calcularValor() {
        return valor;
    }

    // Retorna o valor com desconto percentual
    public double calcularValor(double percentualDesconto) {
        return valor - (valor * percentualDesconto / 100);
    }

    // Retorna o valor com desconto fixo
    public double calcularValor(double desconto, boolean descontoFixo) {
        if (descontoFixo) {
            return valor - desconto;
        }
        return valor;
    }

    public String getFilme() {
        return filme;
    }

    public double getValor() {
        return valor;
    }
}

2.7 R:
package atividade5model.principalatividade5;

import atividade5model.entities.Ingresso;

public class Main {
    public static void main(String[] args) {
        Ingresso ingresso = new Ingresso("Homem Aranha", 50.00);

        // Sem desconto
        System.out.println("Filme: " + ingresso.getFilme());
        System.out.println("Valor normal: R$ " + ingresso.calcularValor());

        // Com desconto percentual (10%)
        System.out.println("Valor com 10% de desconto: R$ " + ingresso.calcularValor(10));

        // Com desconto fixo
        System.out.println("Valor com desconto fixo de R$ 15: R$ " + ingresso.calcularValor(15, true));
    }
}

2.8 R: A vantagem de utilizar sobrecarga nesse caso é que o programador pode chamar o método pelo mesmo nome calcularValor() sem precisar utilizar nomes diferentes, como calcularValorSemDesconto(), calcularValorComPercentual(), etc. Isso deixa o código mais simples. O mesmo conceito, calcular valor, usa um único nome, facilitando a leitura e manutenção.

2.9 R: A desvantagem é que muitas versões sobrecarregadas podem deixar a classe difícil de manter. Se houver muitos métodos com o mesmo nome, o programador pode ficar em dúvida sobre qual usar. Além disso, se criar muitas sobrecargas com lógicas muito diferentes, o código fica complexo, dificultando o entendimento da classe no futuro.

2.10 R: Nem toda situação que envolve operações parecidas precisa de sobrecarga. Se os métodos fazem coisas muito diferentes ou se a lógica é muito complexa, é melhor criar métodos com nomes específicos. A sobrecarga é útil quando o conceito é o mesmo e apenas os parâmetros mudam. Se as operações são diferentes, é melhor usar nomes diferentes para deixar claro qual é a função de cada método.