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
                        service.cadastrarPadrao(entrada);
                        break;

                    case 2:
                        service.cadastrarComissionado(entrada);
                        break;

                    case 3:
                        service.cadastrarProducao(entrada);
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
