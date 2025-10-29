package main;

import modelo.Financiamento;
import util.InterfaceUsuario;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n=== Calculadora de Financiamento Imobiliário ===\n");
        
        List<Financiamento> financiamentos = new ArrayList<>();
        InterfaceUsuario ui = new InterfaceUsuario();
        
        // Criando 4 financiamentos
        for (int i = 1; i <= 4; i++) {
            System.out.printf("\n=== Financiamento %d ===\n", i);
            double valorImovel = ui.pedirValorImovel();
            int prazoFinanciamento = ui.pedirPrazoFinanciamento();
            double taxaJurosAnual = ui.pedirTaxaJurosAnual();
            
            Financiamento financiamento = new Financiamento(valorImovel, prazoFinanciamento, taxaJurosAnual);
            financiamentos.add(financiamento);
            
            // Mostra o resumo individual do financiamento
            mostrarResumoFinanciamento(i, financiamento);
        }
        
        // Calcula e mostra os totais
        mostrarTotais(financiamentos);
    }
    
    private static void mostrarResumoFinanciamento(int numero, Financiamento financiamento) {
        double valorImovel = financiamento.getValorImovel();
        double totalPagamento = financiamento.calcularTotalPagamento();
        
        System.out.printf("\nFinanciamento %d - valor do imóvel: R$ %,.2f, valor do financiamento: R$ %,.2f\n",
            numero, valorImovel, totalPagamento);
    }
    
    private static void mostrarTotais(List<Financiamento> financiamentos) {
        double totalImoveis = 0;
        double totalFinanciamentos = 0;
        
        for (Financiamento fin : financiamentos) {
            totalImoveis += fin.getValorImovel();
            totalFinanciamentos += fin.calcularTotalPagamento();
        }
        
        System.out.println("\n=== Totais ===");
        System.out.printf("Total de todos os imóveis: R$ %,.2f\n", totalImoveis);
        System.out.printf("Total de todos os financiamentos: R$ %,.2f\n", totalFinanciamentos);
        System.out.printf("Total de juros de todos os financiamentos: R$ %,.2f\n", 
            totalFinanciamentos - totalImoveis);
    }
}