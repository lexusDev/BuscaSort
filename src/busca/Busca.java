package busca;

import java.util.Scanner;

public class Busca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BuscaVet buscaV = new BuscaVet();
        Ordenacao ordem = new Ordenacao();
        
        int vetor[] = {3, 2, 9, 10, 29, 4, 5};
        int vetorCresc[] = new int [7];
        int vetorDesc[] = new int [7];
        int maior = vetor[0] ;
        int menor = vetor[0];
        int busca = 0;
        int i1 = 0;
        int i2 = 0;
        boolean testeBusca = false;
        
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o numero da busca: ");
        busca = s.nextInt();
        
        buscaV.buscaVet(vetor, busca);
        
        vetorCresc = ordem.ordenaCres(vetor);
        buscaV.buscaVet(vetorCresc, busca);
       
        vetorDesc = ordem.ordenaDesc(vetor);
        buscaV.buscaVet(vetorDesc, busca);                
       
        for (int j = 0; j < vetor.length; j++) {
            if(vetor[j] > maior)
                maior = vetor[j];
            
            if(vetor[j] < menor)
                menor = vetor[j];
        }
        
        System.out.println("O maior valor do vetor é: " + maior);
        System.out.println("O menor valor do vetor é: " + menor);       
    }
    
}
