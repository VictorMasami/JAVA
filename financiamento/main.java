// O ficheiro original `main.java` permanece por compatibilidade; não modificamos o conteúdo aqui — criámos `Main.java`.
public class Main {
    public static void main(String[] args) {
        InterfaceUsuario ui = new InterfaceUsuario();
        double valorImovel = ui.pedirValorImovel();
        int prazoFinanciamento = ui.pedirPrazoFinanciamento();
        double taxaJurosAnual = ui.pedirTaxaJurosAnual();
        Financiamento financiamento = new Financiamento(valorImovel, prazoFinanciamento, taxaJurosAnual);
        double pagamentoMensal = financiamento.calcularPagamentoMensal();
        double totalPagamento = financiamento.calcularTotalPagamento();
        System.out.printf("Pagamento Mensal: %.2f%n", pagamentoMensal);
        System.out.printf("Total do Pagamento: %.2f%n", totalPagamento);
    }
}

class Financiamento {

    double valorImovel;
    int prazoFinanciamento;
    double taxaJurosAnual;
    
   
    public Financiamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual) {
        this.valorImovel = valorImovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaJurosAnual = taxaJurosAnual;
    }
    
    public double calcularPagamentoMensal() {
        double pagamentoMensal = (valorImovel / (prazoFinanciamento * 12)) * (1 + (taxaJurosAnual / 12));
        return pagamentoMensal;
    }
    
    public double calcularTotalPagamento() {
        double pagamentoMensal = calcularPagamentoMensal();
        double totalPagamento = pagamentoMensal * prazoFinanciamento * 12;
        return totalPagamento;
    }

}

class InterfaceUsuario{
    private static final java.util.Scanner SCANNER = new java.util.Scanner(System.in);

    static {
        
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try { SCANNER.close(); } catch (Exception ignored) {}
        }));
    }

    public double pedirValorImovel() {
        System.out.print("Digite o valor do imóvel: ");
        return SCANNER.nextDouble();
    }

    public int pedirPrazoFinanciamento() {
        System.out.print("Digite o prazo do financiamento em anos: ");
        return SCANNER.nextInt();
    }

    public double pedirTaxaJurosAnual() {
        System.out.print("Digite a taxa de juros anual (em decimal, por exemplo, 0.05 para 5%): ");
        return SCANNER.nextDouble();
    }
}