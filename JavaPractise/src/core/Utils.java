package core;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by GV Sharma on 8/19/2016.
 */
public class Utils {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date1 = sdf.parse("2010-12-31");
            Date date2 = sdf.parse("2010-12-31");
            System.out.println(date1.compareTo(Calendar.getInstance().getTime()));
            System.out.println(sdf.format(Calendar.getInstance().getTime()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
