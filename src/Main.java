import java.util.Scanner;
ColaboradorService service = new ColaboradorService();

void main() {
    Scanner entrada = new Scanner(System.in);

    int escolha = -1;
    int tipoEscolhido = -1;

    do {
        System.out.println("=================================================");
        System.out.println("=== Bem-vindo ao sistema de colaboradores! ===");
        System.out.println("=================================================");
        System.out.println("  1 - Cadastrar colaborador");
        System.out.println("  2 - Listar colaboradores");
        System.out.println("  0 - Sair");
        System.out.println("=================================================");
        System.out.print("Escolha uma opção: ");
        escolha = entrada.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Escolha seu tipo de colaborador:");
                System.out.println("  1 - PADRÃO");
                System.out.println("  2 - COMISSIONADO");
                System.out.println("  3 - PRODUÇÃO");
                tipoEscolhido = entrada.nextInt();

                switch (tipoEscolhido) {
                    case 1:
                        TipoColaborador tipo = TipoColaborador.PADRAO;

                        System.out.println("Informe o número de registro:");
                        int registro = entrada.nextInt();
                        entrada.nextLine();
                        System.out.println("Informe o nome para cadastro:");
                        String nome = entrada.nextLine();
                        Colaborador colaborador = new Colaborador(registro, nome, tipo, 0, 0, 0, 0);
                        service.cadastrar(colaborador);

                        break;

                    case 2:
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
                        Colaborador colaborador2 = new Colaborador(registro2, nome2, tipo2, vendas, percentualComissao, 0, 0);
                        service.cadastrar(colaborador2);

                        break;

                    case 3:
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
                        Colaborador colaborador3 = new Colaborador(registro3, nome3, tipo3, 0, 0, valorPorPeca, quantidadeProduzida);
                        service.cadastrar(colaborador3);

                        break;

                    default:
                        System.out.println("Opção inválida!");
            }
                break;

            case 2:
                if (service.checarListaVazia()) {
                    System.out.println("Nenhum colaborador cadastrado!");
                } else {
                    service.listar();
                }

                break;
            case 0:
                //
                System.out.println("O sistema será encerrado!");
                break;

            default:
                System.out.println("Opção inválida!");
        }
    } while (escolha != 0);

    entrada.close();
}
