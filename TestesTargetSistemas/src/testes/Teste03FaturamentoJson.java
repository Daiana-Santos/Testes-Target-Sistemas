
package testes;

public class Teste03FaturamentoJson {
    
    public static void main(String[] args) {
        
        double MenorFat = 0;
        double MaiorFat = 0;
     
        int dias [] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,
           23,24,25,26,27,28,29,30};
        
        double valor [] = {22174.1664,24537.6698,26139.6134,0.0,0.0,26742.6612,
                          0.0,42889.2258,46251.174,11191.4722,0.0,0.0,3847.4823,
                          373.7838,2659.7563,48924.2448,18419.2614,0.0,0.0,
                          35240.1826,43829.1667,18235.6852,4355.0662,13327.1025,
                          0.0,0.0,25681.8318,1718.1221,13220.495,8414.61};
       
        for (int pos=0; pos<valor.length;pos++){
            System.out.printf(" Faturamento " +dias[pos]+ " = %.2f",valor[pos]);
            System.out.println(); 
            if(valor[pos] > 1 && pos == 0){
               MenorFat = valor[pos];
               MaiorFat = valor[pos]; 
            }if (valor[pos] < MenorFat){
                    MenorFat = valor[pos];
            }else if (valor[pos] > MaiorFat){
                    MaiorFat = valor[pos];
            }
        }
        System.out.println("O menor valor de faturamento: " + MenorFat);    
        System.out.println("O maior valor de faturamento: " + MaiorFat); 
        double media = 0; 
        double soma = 0;
        int dia = 0;
        
        for(int pos = 0; pos < valor.length; pos++){
            if(valor[pos] != 0){
                soma += valor[pos];
            }
        }
        media = soma / dias.length;
        for(int pos=0; pos < dias.length; pos++){
            if(valor[pos] != 0){
            }if(valor[pos] > media){
                dia++;
            }              
        }
        System.out.println("O número de dias no mês em que o valor de faturamento"
                + " diário foi superior à média mensal foram " +dia+ " dias.");
        
        }
          
    }
 
            
      
    
/*for (int pos=0; pos<valor.length;pos++){
                soma = soma + valor[pos];
                media = soma /valor.length;
            if (media >valor[i]){ 
                System.out.println(valor[i]);*/
            
