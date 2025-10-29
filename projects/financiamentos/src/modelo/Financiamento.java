package modelo;

public class Financiamento {
    private double valorImovel;
    private int prazoFinanciamento; // em anos
    private double taxaJurosAnual;
    
    public Financiamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual) {
        this.valorImovel = valorImovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaJurosAnual = taxaJurosAnual;
    }
    
    public double calcularPagamentoMensal() {
        double taxaMensal = taxaJurosAnual / 12.0;
        int totalMeses = prazoFinanciamento * 12;
        
        // Fórmula de prestação com juros compostos: PMT = PV * (r * (1 + r)^n) / ((1 + r)^n - 1)
        double numerador = taxaMensal * Math.pow(1 + taxaMensal, totalMeses);
        double denominador = Math.pow(1 + taxaMensal, totalMeses) - 1;
        
        return valorImovel * (numerador / denominador);
    }
    
    public double calcularTotalPagamento() {
        double pagamentoMensal = calcularPagamentoMensal();
        return pagamentoMensal * prazoFinanciamento * 12;
    }

    // Getters para acessar os valores privados
    public double getValorImovel() {
        return valorImovel;
    }

    public int getPrazoFinanciamento() {
        return prazoFinanciamento;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }
}