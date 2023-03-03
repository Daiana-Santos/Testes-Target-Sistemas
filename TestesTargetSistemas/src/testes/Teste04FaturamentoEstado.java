
package testes;


public class Teste04FaturamentoEstado {
    
    public static void main(String[] args) {
        
        double[] centoFaturamento = new double[5];
        double[] faturamento = new double[5];
        faturamento[0] = 67836.43; // SP
        faturamento[1] = 36678.66; // RJ
        faturamento[2] = 29229.88; // MG
        faturamento[3] = 27165.48; // ES
        faturamento[4] = 19849.53; // OUTROS
        double Total = 0;

        for(int pos = 0; pos < faturamento.length; pos++){
                Total += faturamento[pos];
            }
        for(int pos =0; pos < faturamento.length; pos++){
                centoFaturamento[pos] = (faturamento[pos] * 100) / Total;
            }
            System.out.printf("Faturamento SP: %.2f" , centoFaturamento[0],"%");
            System.out.println();
            System.out.printf("Faturamento RJ: %.2f" , centoFaturamento[1],"%");
            System.out.println();
            System.out.printf("Faturamento MG: %.2f" , centoFaturamento[2],"%");
            System.out.println();
            System.out.printf("Faturamento ES: %.2f" , centoFaturamento[3],"%");
            System.out.println();
            System.out.printf("Faturamento OUTROS: %.2f" , centoFaturamento[4],"%");
            System.out.println();
    }
    
}
