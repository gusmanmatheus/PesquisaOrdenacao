package Registros;

import java.util.Calendar;

public class Registros {
	private Calendar venc;
	private String cpf,nome;
	private double valorDivida;
	private boolean paga;
        
	  Registros(Registros separaDados) {
        throw new UnsupportedOperationException("ERRO"); //To change body of generated methods, choose Tools | Templates.
    }


    public Registros(String nome, String cpf, double valor, Calendar venc, boolean paga) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
		this.nome = nome;
               this.cpf = cpf;
               this.venc=venc;
		this.paga = paga;
		this.valorDivida = valor;
		
    
    }

	public Calendar getData() {
		return venc;
	}
        public String getDataString() {
	String Data= venc.get(Calendar.YEAR)+""+
        (venc.get(Calendar.MONTH)+1)+""+
      venc.get(Calendar.DAY_OF_MONTH)  ;
	return Data;
                }
	public void setData(Calendar data) {
		this.venc = data;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getValorDivida() {
		return valorDivida;
	}
	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	public boolean getStatusDivida() {
		return paga;
	}
	public void setStatusDivida(boolean statusDivida) {
		this.paga = statusDivida;
	}

        
        
        
        
        
        
        
        
        
        
        
    @Override
    public String toString() {
        return "(Data: " + venc.get(Calendar.DAY_OF_MONTH)+" "+ (venc.get(Calendar.MONTH)+1)+" "+ venc.get(Calendar.YEAR)+", CPF: " + cpf + ", Nome: " + nome + ", ValorDivida: " + valorDivida +
                ", Paga: " + paga + ')';
    }




}
