import java.util.Calendar;
import java.util.Date;

public class DateComparator {


    public boolean isToday(Date bDay) {
        String dateStr = Calendar.getInstance().getTime().toString().substring(4,10);
        String bDayStr = bDay.toString().substring(4,10);


        if (bDayStr.equals(dateStr)) {
            return true;

        }
        return false;
    }
}
