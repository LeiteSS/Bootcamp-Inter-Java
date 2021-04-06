package Data;
import java.util.Date;
import java.time.Instant;

public class Main {
    public static void main(String[] args){
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println(currentTimeMillis);
        Date novaData = new Date(currentTimeMillis);
        System.out.println(novaData);

        Instant instant = novaData.toInstant();
        System.out.println(instant);

    }
}
