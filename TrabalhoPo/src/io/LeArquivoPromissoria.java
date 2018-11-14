package io;

import Registros.RegistroSoData;
import Registros.Registros;
import java.io.*;
import java.util.*;
public class LeArquivoPromissoria {
private Scanner entrada;
// objeto do tipo Scanner para realizar a leitura dos dados
// do arquivo.
/**
 * Construtor
 * @param nome => Nome do arquivo que sera aberto para leitura
 * @throws FileNotFoundException => Excecao se nao encontrar o arquivo
 */
public LeArquivoPromissoria(String nome) throws FileNotFoundException{
try{
this.entrada = new Scanner (new File (nome));
//Instanciamento do objeto do tipo Scanner, tendo como argumento

// File que será o arquivo que será lido
}
catch (FileNotFoundException e){
throw new FileNotFoundException ("ARQUIVO NAO ENCONTRADO");
}
}
/**
 * Metodo para ler os dados contidos no arquivo
 * @param alunos => Vetor de alunos que sera preenchido durante a
 * leitura do arquivo
 * @throws IllegalStateException => Excecao se houver erro ao ler o
 * arquivo
 */



public Metodos leArquivo(int tam)throws NoSuchElementException,
ArrayIndexOutOfBoundsException{
Metodos cadastro = new Metodos(tam);
String linha;
int i=0;
try{
while (this.entrada.hasNext()){
// A função hasNext() indica se ainda existe uma String
// para ser lida.
linha = this.entrada.nextLine();
// A função nextLine() devolve a próxima linha como
// uma String.
Registros registro = separaDados(linha);

cadastro.setRegistros(registro,i);
i++;
}
return cadastro;
}
catch (ArrayIndexOutOfBoundsException e){
throw new ArrayIndexOutOfBoundsException("Arquivo corrompido");
}
}
 





//public CadPromissoria leArquivo(int tam)throws NoSuchElementException,
//ArrayIndexOutOfBoundsException{
//CadPromissoria cadastro = new CadPromissoria(tam);
//String linha;
//try{
//while (this.entrada.hasNext()){
//// A função hasNext() indica se ainda existe uma String
//// para ser lida.
//linha = this.entrada.nextLine();
//// A função nextLine() devolve a próxima linha como
//// uma String.
//cadastro.insere(separaDados(linha));
//}
//return cadastro;
//}
//catch (ArrayIndexOutOfBoundsException e){
//throw new ArrayIndexOutOfBoundsException("Arquivo corrompido");
//}
//}
/**
 * Metodo para transformar uma linha do arquivo em um objeto
 * do tipo Promissoria
 * @param linha => String contendo a linha do arquivo que sera
transformada
 * @return => a promissoria criada a partir do linha passada
 * @throws NoSuchElementException => Excecao causada por elementos
 * insuficientes na String, durante a transformacao
 */
public  Registros separaDados(String linha)throws
NoSuchElementException{
String[] dados;
String nome, cpf, aux;
Calendar venc;
double valor;
boolean paga;
try{
dados = linha.split(";");
// O método split quebra uma String em várias substrings a partir
// do caracter definido como argumento,nesse caso ";", cria
// um vetor de String e armazena cada substring em um posicao
aux = dados[0];
venc = montaData(aux);
nome = dados[1];
cpf = dados[2];
valor = Double.parseDouble(dados[3]);
paga = Boolean.parseBoolean(dados[4]);
return( new Registros(nome, cpf, valor, venc, paga));
}
catch (NoSuchElementException erro){
throw new NoSuchElementException ("ARQUIVO DIFERENTE DO REGISTRO");
}
}
/**
 * Metodo para separar o dia, mes e o ano de uma data.
 * Eles estao separados por / de cria uma data com
 * esses inteiros.
 * @param str => String contendo dd/mm/aa
 * @return um objeto do tipo Calendar com a data.
 */
public static Calendar montaData (String str){
int dia, mes, ano;
String[] aux;
Calendar data = Calendar.getInstance();
aux = str.split("/");
dia = Integer.parseInt(aux[0]);
mes = Integer.parseInt(aux[1])-1;
ano = Integer.parseInt(aux[2]);
data.set(ano, mes, dia);
return data;
}

   
/**
 * Metodo para fechar o arquivo de leitura
 * @throws IllegalStateException => Excecao causada se nao conseguir
 * fechar o arquivo.
 */
public void fechaArquivo ()throws IllegalStateException{
try{
this.entrada.close();
}
catch (IllegalStateException e){
throw new IllegalStateException ("ERRO AO FECHAR O ARQUIVO");
}
}
}

//public  Calendar montaData (String str){
//int dia, mes, ano;
//String[] aux;
//Calendar data = Calendar.getInstance();
//aux = str.split("/");
//dia = Integer.parseInt(aux[0]);
//mes = Integer.parseInt(aux[1])-1;
//ano = Integer.parseInt(aux[2]);
//data.set(ano, mes, dia);
//return data;
//}