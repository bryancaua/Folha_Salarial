import java.util.ArrayList;
import java.util.List;

public class ColaboradorService {
    private List<Colaborador> colaboradores = new ArrayList<>();

    public void cadastrar (Colaborador colaborador) {
        colaboradores.add(colaborador);
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




