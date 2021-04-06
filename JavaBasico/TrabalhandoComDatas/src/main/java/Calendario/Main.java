package Calendario;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.text.DateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args){
        Calendar agora = Calendar.getInstance();
        Date data = new Date();

        String formato = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT).format(data);
        SimpleDateFormat simples = new SimpleDateFormat("dd/MM/yyyy");
        String dataSimples = simples.format(data);
        System.out.println(agora);
        System.out.println(formato);
        System.out.println(dataSimples);
    }
}
