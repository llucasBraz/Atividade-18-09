public class Contribuinte {
    private int idade;
    private char sexo; // 'M' para masculino, 'F' para feminino
    private int tempoContribuicao;
    private int tempoContribuicaoPrecaria;

    public Contribuinte(int idade, char sexo, int tempoContribuicao, int tempoContribuicaoPrecaria) {
        this.idade = idade;
        this.sexo = sexo;
        this.tempoContribuicao = tempoContribuicao;
        this.tempoContribuicaoPrecaria = tempoContribuicaoPrecaria;
    }

    public boolean podeAposentar() {
        // Calcula o tempo total de contribuição, considerando os anos em condições precárias.
        double tempoTotalContribuicao = tempoContribuicao + (tempoContribuicaoPrecaria * 1.1);

        if (sexo == 'F') {
            return idade >= 62 && tempoTotalContribuicao >= 15;
        } else if (sexo == 'M') {
            return idade >= 65 && tempoTotalContribuicao >= 20;
        }
        return false;
    }

    // Getters e setters podem ser adicionados conforme necessário
}
