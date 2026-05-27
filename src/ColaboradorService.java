import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ColaboradorService {
    private List<Colaborador> colaboradores = new ArrayList<>();

    public boolean checarListaVazia() {
        return colaboradores.isEmpty();
    }

    public void cadastrar (Colaborador colaborador) {
        colaboradores.add(colaborador);
    }

    public String cadastroSucesso() {
        return "Colaborador cadastrado com sucesso!";
    }

    public void cadastrarPadrao(Scanner entrada) {
        TipoColaborador tipo = TipoColaborador.PADRAO;

        System.out.println("Informe o número de registro:");
        int registro = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Informe o nome para cadastro:");
        String nome = entrada.nextLine();
        Colaborador colaborador = new Colaborador(registro, nome, tipo);
        cadastrar(colaborador);
        System.out.println(cadastroSucesso());
    }

    public void cadastrarComissionado(Scanner entrada) {
        TipoColaborador tipo2 = TipoColaborador.COMISSIONADO;

        System.out.println("Informe o número de registro:");
        int registro2 = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Informe o nome para cadastro:");
        String nome2 = entrada.nextLine();
        System.out.println("Informe o número de vendas do colaborador:");
        double vendas = entrada.nextDouble();
        System.out.println("Informe o percentual na comissão:");
        double percentualComissao = entrada.nextDouble();
        Colaborador colaborador2 = new Colaborador(registro2, nome2, tipo2, vendas, percentualComissao);
        cadastrar(colaborador2);
        System.out.println(cadastroSucesso());
    }

    public void cadastrarProducao(Scanner entrada) {
        TipoColaborador tipo3 = TipoColaborador.PRODUCAO;

        System.out.println("Informe o número de registro:");
        int registro3 = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Informe o nome para cadastro:");
        String nome3 = entrada.nextLine();
        System.out.println("Informe o valor por peça:");
        double valorPorPeca = entrada.nextDouble();
        System.out.println("Informe a quantidade produzida pelo colaborador:");
        int quantidadeProduzida = entrada.nextInt();
        entrada.nextLine();
        Colaborador colaborador3 = new Colaborador(registro3, nome3, tipo3, valorPorPeca, quantidadeProduzida);
        cadastrar(colaborador3);
        System.out.println(cadastroSucesso());
    }

    public void listar () {
        for (Colaborador colaborador : colaboradores) {

            if (colaborador.getTipo() == TipoColaborador.PADRAO) {
                System.out.println(
                                "\n Registro do colaborador:" + colaborador.getRegistro() +
                                "\n Nome do colaborador:" + colaborador.getNome() +
                                "\n Tipo do colaborador:" + colaborador.getTipo() +
                                "\n Salário: " + colaborador.calcularSalarioFinal()
                );
            }  else if (colaborador.getTipo() == TipoColaborador.COMISSIONADO) {
                        System.out.println(
                            "\n Registro do colaborador:" + colaborador.getRegistro() +
                                    "\n Nome do colaborador:" + colaborador.getNome() +
                                    "\n Tipo do colaborador:" + colaborador.getTipo() +
                                    "\n Quantidade de vendas do colaborador:" + colaborador.getVendas() +
                                    "\n Percentual de comissão do colaborador:" + colaborador.getPercentualComissao() +
                                    "\n Salário final: " + colaborador.calcularSalarioFinal()
                        );
            }  else if (colaborador.getTipo() == TipoColaborador.PRODUCAO) {
                        System.out.println(
                        "\n Registro do colaborador:" + colaborador.getRegistro() +
                                "\n Nome do colaborador:" + colaborador.getNome() +
                                "\n Tipo do colaborador:" + colaborador.getTipo() +
                                "\n Valor de peças vendidas:" + colaborador.getValorPorPeca() +
                                "\n Quantidade de peças produzidas:" + colaborador.getQuantidadeProduzida() +
                                "\n Salário final: " + colaborador.calcularSalarioFinal()
                        );
            }
        }
    }
}




