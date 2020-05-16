package busca;

public class Ordenacao {
    /**********************************InsertionSort*********************************/
    
    int[] ordenaCres(int vetor[]){
        int eleito;
        int vet[] = vetor;
        
        for (int i = 0; i < vet.length; i++) {
            eleito = vet[i];
            int j = i -1;
            
            while(j>=0 && vet[j] > eleito){
                vet[j+1] = vet[j];
                j--;
            }
            vet[j+1] = eleito;
        }
        
        return vet;
    }
    
    int[] ordenaDesc(int vetor[]){
        int eleito;
        int vet[] = vetor;
        
        for (int i = 0; i < vet.length; i++) {
            eleito = vet[i];
            int j = i -1;
            
            while(j>=0 && vet[j] < eleito){
                vet[j+1] = vet[j];
                j--;
            }
            vet[j+1] = eleito;
        }
        
        return vet;
    }
}
