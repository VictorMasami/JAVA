package util;

import java.util.Locale;

public class InterfaceUsuario {
    private static final java.util.Scanner SCANNER = new java.util.Scanner(System.in).useLocale(Locale.US);

    static {
        // fecha o scanner somente ao terminar a JVM — evita warnings de vazamento
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try { SCANNER.close(); } catch (Exception ignored) {}
        }));
    }

    public double pedirValorImovel() {
        while (true) {
            try {
                System.out.print("Digite o valor do imóvel (use ponto como separador decimal): R$ ");
                double valor = SCANNER.nextDouble();
                if (valor <= 0) {
                    System.out.println("Erro: O valor deve ser maior que zero.");
                    continue;
                }
                return valor;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Erro: Digite um número válido (use ponto como separador decimal).");
                SCANNER.nextLine(); // limpa o buffer
            }
        }
    }

    public int pedirPrazoFinanciamento() {
        while (true) {
            try {
                System.out.print("Digite o prazo do financiamento em anos: ");
                int prazo = SCANNER.nextInt();
                if (prazo <= 0) {
                    System.out.println("Erro: O prazo deve ser maior que zero.");
                    continue;
                }
                return prazo;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Erro: Digite um número inteiro válido.");
                SCANNER.nextLine(); // limpa o buffer
            }
        }
    }

    public double pedirTaxaJurosAnual() {
        while (true) {
            try {
                System.out.print("Digite a taxa de juros anual (exemplo: para 5%, digite 0.05): ");
                double taxa = SCANNER.nextDouble();
                if (taxa <= 0) {
                    System.out.println("Erro: A taxa deve ser maior que zero.");
                    continue;
                }
                return taxa;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Erro: Digite um número válido (use ponto como separador decimal).");
                SCANNER.nextLine(); // limpa o buffer
            }
        }
    }
}