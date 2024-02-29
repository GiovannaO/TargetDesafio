package ex4;

/**
 *
 * @author Giovanna de Oliveira Justino
 */

public class Percentual {
    public static void main(String[] args) {
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double outros = 19849.53;
        double totalMensal  = 0;
        double percentualSP, percentualRJ, percentualMG, percentualOutros;
        String resultadoSP, resultadoRJ, resultadoMG, resultadoOutros;
        
        totalMensal = sp + rj + mg + outros;
        percentualSP = (sp / totalMensal) * 100;
        percentualRJ = (rj/ totalMensal) * 100;
        percentualMG = (mg / totalMensal) * 100;
        percentualOutros = (outros / totalMensal) * 100;
        
        resultadoSP = String.format("\nSP: %.2f", percentualSP);
        resultadoRJ = String.format("\nSP: %.2f", percentualRJ);
        resultadoMG = String.format("\nSP: %.2f", percentualMG);
        resultadoOutros = String.format("\nSP: %.2f", percentualOutros);
        
        
        System.out.println("Total mensal: R$ " +  totalMensal);
        System.out.print("\nPercentual:");
        System.out.println(resultadoSP + "%" + resultadoRJ + "%" + resultadoMG + "%" + resultadoOutros + "%");

    }
}
