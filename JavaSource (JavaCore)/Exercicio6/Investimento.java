package Exercicio6;
//import package 7; 

public class Investimento implements Tributavel {

    private double valorAplicado;
    private double rendimentoMensal;
    private int meses;
    public static double taxaIR = 0.27; 
    
    public Investimento(double valorAplicado, double rendimentoMensal, int meses) {
        this.valorAplicado = valorAplicado;
        this.rendimentoMensal = rendimentoMensal;
        this.meses = meses;
    }
    
    public int getMeses() {
        return meses;
    }

    
    public double getRendimentoMensal() {
        return rendimentoMensal;
    }

    
    public double getValorAplicado() {
        return valorAplicado;
    }

    public double getRendimentoBruto() {
        double rendimentoAcumulado = Math.pow(1 + rendimentoMensal, meses);
        return valorAplicado * (rendimentoAcumulado - 1);
    }
    
    public double getRendimentoLiquido() {
        return getRendimentoBruto() * (1 - taxaIR);        
    }
    
    public String getDescricaoTributavel() {
        return "Fundo de Investimento";
    }

    public double calcularImpostos() {
        return getRendimentoBruto() * taxaIR;
    } 
}
