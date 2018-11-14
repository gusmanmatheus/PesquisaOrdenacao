package io;

import Registros.Registros;

public class CadPromissoria {
    
    Registros[] cadastro ;
    int Nelem;
    public CadPromissoria( int i) {
        this.cadastro = new Registros[i];
        this.Nelem=i;
    }
     public int getSize(){
     return Nelem;
     }
    public Registros getCadastro(int i) {
        
        return cadastro[i];
    }

    public void setCadastro(Registros registro,int posicao) {
        this.cadastro[posicao]= registro;
    }

    public String toString(int i ) {
        return cadastro[i].toString();
    }
    
    
    
    
    
}
