import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CalculateTPS {

    public static void calculateTPS(String startTestTime, String endtTestTime, int numberOfLoops){
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");

        Date start = null;
        Date end = null;
        try {
            start = format.parse(startTestTime);
            end = format.parse(endtTestTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        long timeDifference = end.getTime()-start.getTime() ;
        long timeDifferenceSeconds = timeDifference / 1000 % 60;

        System.out.println("Execution took ["+timeDifferenceSeconds+"] seconds");

        long tps = numberOfLoops/timeDifferenceSeconds  ;

        System.out.println("Transactions per second [ " + tps + " ]");
    }
}
