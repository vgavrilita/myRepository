import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDate {




    public String getdateTime() {


            Date currentDate = new Date( );
            SimpleDateFormat myDateFormat = new SimpleDateFormat("yyyyMMd hh:mm:ss");
            String getCurrentDate = myDateFormat.format(currentDate);

            return getCurrentDate;}

    }



