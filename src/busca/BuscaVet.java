/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busca;

/**
 *
 * @author lexus
 */
public class BuscaVet {

    private boolean verifica;
    
    
    void buscaVet(int[] vet, int busca){
        
        boolean testeBusca = false;
        int i =0;
        int indiceBuscado=0;
        while(i < vet.length && testeBusca == false) {
            
            if(vet[i] == busca){
                indiceBuscado = i;
                testeBusca = true;
            }
                       
            i++;
        }
        
        if(testeBusca)
            System.out.println("O valor do indice do vetor é: " + indiceBuscado);
        else
            System.out.println("Valor não encontrado");
        
    }
    
    boolean setVerifica(){
        return this.verifica;
    }
    
}
