// Criar um Switch com 2 opções se deseja cadastrar um colaborador ou listar eles // Colocar um verificador caso o usuário tenha escolhido outra opção sem ser 1 - 2 ou 0

import java.util.Scanner;

void main() {
    Scanner entrada = new Scanner(System.in);

    int escolha = -1;

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
                //...
                break;
            case 2:
                //...
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
