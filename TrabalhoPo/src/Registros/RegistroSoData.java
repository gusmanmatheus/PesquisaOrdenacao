
package Registros;

import java.util.Calendar;

public class RegistroSoData {
    private Calendar data;

    public RegistroSoData() {
    }

    public RegistroSoData(Calendar data) {
        this.data = data;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }
    public String getDataString(){
    String Data= data.get(Calendar.YEAR)+""+
        (data.get(Calendar.MONTH)+1)+""+
      data.get(Calendar.DAY_OF_MONTH)  ;
	return Data;
    }
    
    @Override
    public String toString() {
        return  "Data=( Dia: " +data.get(Calendar.DAY_OF_MONTH) + " Mes: "+(data.get(Calendar.MONTH)+1)+" Ano: "+data.get(Calendar.YEAR)+')';
    }
}
 