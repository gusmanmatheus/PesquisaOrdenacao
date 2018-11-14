
package io;
import Registros.RegistroSoData;
import Registros.Registros;
import java.util.Calendar;

public class Metodos {
   private Registros registros[];
   private RegistroSoData registrosodata[];
   private int nElem;
    public Metodos() {
    }

    public Metodos(Registros registros[],int nElem) {
        this.nElem=nElem;
      this.registros = registros;
    }
     public Metodos(int nElem) {
        this.nElem=nElem;
      this.registros = new Registros[nElem];
    }
        

    public Metodos(RegistroSoData registrosodata[],int nElem) {
        this.registrosodata = registrosodata;
        this.nElem=nElem;

    }
    
    
    
    
    public int getSize(){
    return nElem;
    
            }
    public Registros getRegistros(int posicao) {
        return registros[posicao];
        
    }

    public void setRegistros(Registros registros,int posicao) {
        this.registros[posicao] =  registros;
    }

    public String toStringSodata(int i) {
        return registrosodata[i].toString();
    }
public String toString(int i) {
        return registros[i].toString();
    }
    
    //HEAPSORT --------------------------------
 public void heapSort (){
 int dir = nElem-1;
 int esq = (dir-1)/2;
 Registros temp;

 while (esq >= 0){
 refazHeap (esq, this.nElem-1);
esq--;
}
 while (dir > 0){
 temp = this.registros[0];
 this.registros [0] = this.registros [dir];
 this.registros[dir] = temp;
dir--;
 refazHeap(0, dir);
 }
}  
  public void refazHeap (int esq, int dir){
int i = esq;
 int mF = 2*i+1; // maior filho
 Registros raiz = this.registros[i];
 boolean heap = false;

 while ((mF <= dir) && (!heap)){
 if ( mF < dir)
 if (this.registros[mF].getValorDivida()< this.registros[mF+1].getValorDivida())
 mF ++;
   //  System.out.println(raiz.getValorDivida()+"  e" +this.registros[mF].getValorDivida());
 if (raiz.getValorDivida()< this.registros[mF].getValorDivida()) {
 this.registros[i] = this.registros[mF];
 i = mF;
 mF = 2*i+1;
 }
 else
 heap = true;
}
 this.registros[i] = raiz;
   //-----heapsortDATA
}
  public void heapSortData(){
 int dir = nElem-1;
 int esq = (dir-1)/2;
 Registros temp;

 while (esq >= 0){
 refazHeapData(esq, this.nElem-1);
esq--;
}
 while (dir > 0){
 temp = this.registros[0];
 this.registros [0] = this.registros [dir];
 this.registros[dir] = temp;
dir--;
 refazHeapData(0, dir);
 }
}  
  public void refazHeapData (int esq, int dir){
int i = esq;
 int mF = 2*i+1; // maior filho
 Registros raiz = this.registros[i];
 boolean heap = false;

 while ((mF <= dir) && (!heap)){
 if ( mF < dir)
 if (dataComparable(this.registros[mF].getDataString(), this.registros[mF+1].getDataString()))
 mF ++;
  //   System.out.println(raiz.getValorDivida()+"  e" +this.registros[mF].getValorDivida());
 if (dataComparable(raiz.getDataString(), this.registros[mF].getDataString())) {
 this.registros[i] = this.registros[mF];
 i = mF;
 mF = 2*i+1;
 }
 else
 heap = true;
}
 this.registros[i] = raiz;
   
}
  private boolean dataComparable(String d1,String d2){
    int data1 = Integer.valueOf(d1);
    int data2 = Integer.valueOf(d2);
   if(data1<data2){
   
   return true;
   }
      
      
      return false;
  }
  
  
  //FIM

//--------------------------------------------------------------------

//Pesquisa binaria

  public void PesqBinaria (String chave){
      
        
      fazPesqBinaria(Integer.parseInt(chave));
  }
  
public int fazPesqBinaria (int chave){
int meio, esq, dir;
esq = 0;
dir = this.nElem-1;
while (esq <= dir){
meio = (esq + dir)/2;
if (chave == Integer.parseInt(this.registrosodata[meio].getDataString()))
return meio;
else{
if (chave < Integer.parseInt(this.registrosodata[meio].getDataString()))
dir = meio - 1;
else
esq = meio + 1;
}
}
return -1;
}

}