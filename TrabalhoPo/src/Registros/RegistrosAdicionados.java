package Registros;
import io.Metodos;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import Gravar.GravaArquivo;
import io.*;

public class RegistrosAdicionados {

public static void main(String[] args) throws IOException {
    String dadosLinha ;
	    String nome="C:\\Users\\mathe\\Desktop\\TrabalhoPo\\src\\Arquivos\\promissoria1000inv.txt";
	    System.out.printf("\nConteudo do arquivo texto:\n");
            LeArquivoPromissoria  arquivo = new LeArquivoPromissoria(nome);
           
           String SalvarEmArquivoNovo ="C:\\Users\\mathe\\Desktop\\TrabalhoPo\\src\\Arquivos\\Teste.txt";
          GravaArquivo gravador = new GravaArquivo(SalvarEmArquivoNovo); 
          Metodos vetor = arquivo.leArquivo(1000);
           
  
            for (int i = 0; i < vetor.getSize(); i++) {
         System.out.println(vetor.toString(i));
         
            }
            
         vetor.heapSort();
                  
            for (int i = 0; i < vetor.getSize(); i++) {
                  System.out.println(vetor.toString(i));
                
                 gravador.gravaArquivo(vetor.getRegistros(i).getDataString()+";");
                 gravador.gravaArquivo(vetor.getRegistros(i).getNome()+";");
                 gravador.gravaArquivo(vetor.getRegistros(i).getCpf()+";");
                 gravador.gravaArquivo(String.valueOf(vetor.getRegistros(i).getValorDivida())+";");
                 gravador.gravaArquivo(String.valueOf(vetor.getRegistros(i).getStatusDivida())+";");
                 gravador.gravaArquivoLn();
    }
         
         
  
           gravador.fechaArquivo();
       
            

            
            

         


//	try {
//           GravaArquivo gravar =new GravaArquivo("Teste");

            
//	      FileReader arq = new FileReader(nome);     
//	      BufferedReader lerArq = new BufferedReader(arq);
//RegistroSoData[] registroSodata= new RegistroSoData[400];
//         Registros[] registros = new Registros[1000];
//	          String linha = lerArq.readLine(); // l a primeira linha
           
//	int i=0;
//	      while (i<1000) {
//	 
//	        linha = lerArq.readLine(); // l da segunda ate a ultima linha
//                String data =linha;
//              
// registrosodata[i]= new RegistroSoData( arquivo.montaData(data));
//                registrosodata[i].toString();
//System.out.println(registrosodata[i].toString());
//
//	        i++;
//              }            

//           while (i<999) {
//	 
//	        linha = lerArq.readLine(); // l da segunda ate a ultima linha
//                String data =linha;
//              
//registros[i]=  arquivo.separaDados(linha);
//registroSodata[i]= new RegistroSoData(arquivo.montaData(linha));
              //  registroSodata[i].toString();
//System.out.println(registros[i].toString());

//	        i++;
//              }
//             i=0;
  //     Metodos metodos =new Metodos(registros,999);
        //   metodos.heapSort();
//           System.out.println("oi");
                 // Metodos metodos =new Metodos(registroSodata,i );
                      
//           while(i<999){
//               System.out.println(metodos.getRegistros(i).toString());
//                             gravar.gravaArquivo(metodos.getRegistros(i).toString());
//
//           i++;
//           }
       
           
            System.out.println("esse:");
           // String dat ="26/10/2032";
            //RegistroSoData item = new RegistroSoData(arquivo.montaData(dat));

//            if(metodos.pesqBinaria(item.getDataString())<0){
//                System.out.println("nao achado");}
//            else{
//           registroSodata[metodos.pesqBinaria[26/10/2032].toString();
        //    }
//        try{
// arq.close();
//           }catch(IOException e){	     
//               System.err.printf("Erro ao fechar o arquivo: %s.\n",
//                 e.getMessage());
//               
//}
//           
//                           gravar.fechaArquivo();
//
//           
//	    } catch (IOException e) {
//	        System.err.printf("Erro na abertura do arquivo: %s.\n",
//	          e.getMessage());
//                
//                 
//	    }
//	 long currentTimeMillis = System.currentTimeMillis(); 
//         System.out.println(currentTimeMillis);
//	
//	   for (int i = 0; i < registrosodata.length; i++) {
//                        System.out.println(registrosodata[i].toString());
//
//    }

}
}