package br.com.alura;

import br.com.alura.client.ClientHttpConfiguration;
import br.com.alura.command.*;
import br.com.alura.service.PetService;

import java.util.Scanner;

public class AdopetConsoleApplication {

    public static void main(String[] args) {
        CommandExecutor executor = new CommandExecutor();
        System.out.println("##### BOAS VINDAS AO SISTEMA ADOPET CONSOLE #####");

        int opcaoEscolhida = 0;
        while (opcaoEscolhida != 5) {
            exibeMenu();
            String textoDigitado = new Scanner(System.in).nextLine();
            opcaoEscolhida = Integer.parseInt(textoDigitado);

            switch (opcaoEscolhida) {
                case 1 -> executor.executeCommand(new ListarAbrigoCommand());
                case 2 -> executor.executeCommand(new CadastrarAbrigoCommand());
                case 3 -> executor.executeCommand(new br.com.alura.ListarPetsDoAbrigoCommand());
                case 4 -> executor.executeCommand(new br.com.alura.ImportarPetsDoAbrigoCommand());
                case 5 -> System.exit(0);
                default -> opcaoEscolhida = 0;
            }

            System.out.println("Finalizando o programa...");
        }
    }

    private static void exibeMenu() {
        System.out.println("\nDIGITE O NÚMERO DA OPERAÇÃO DESEJADA:");
        System.out.println("1 -> Listar abrigos cadastrados");
        System.out.println("2 -> Cadastrar novo abrigo");
        System.out.println("3 -> Listar pets do abrigo");
        System.out.println("4 -> Importar pets do abrigo");
        System.out.println("5 -> Sair");
    }
}
