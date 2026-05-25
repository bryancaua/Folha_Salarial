void main() {

}

public class Colaborador {

    // Constante
    static final double SALARIO_BASE = 2000.0;

    // Atributos
    private int registro;
    private String nome;
    private TipoColaborador tipo;
    private double vendas;
    private double percentualComissao;
    private double valorPorPeca;
    private int quantidadeProduzida;

    // Construtor
    public Colaborador(int registro, String nome, TipoColaborador tipo, double vendas, double percentualComissao, double valorPorPeca, int quantidadeProduzida) {
        this.registro = registro;
        this.nome = nome;
        this.tipo = tipo;
        this.vendas = vendas;
        this.percentualComissao = percentualComissao;
        this.valorPorPeca = valorPorPeca;
        this.quantidadeProduzida = quantidadeProduzida;
    }

    public double calcularSalarioFinal() {
        if (tipo == TipoColaborador.PADRAO) {
            return SALARIO_BASE;
        } else if (tipo == TipoColaborador.COMISSIONADO) {
            double comissao = vendas * percentualComissao / 100;
            return SALARIO_BASE + comissao;
        } else if (tipo == TipoColaborador.PRODUCAO) {
            double bonus = valorPorPeca*quantidadeProduzida;
            return SALARIO_BASE + bonus;
        } else {
            System.out.println("Por favor insira um dos tipos válidos de colaborador.");
            return 0.0;
        }
    }

}