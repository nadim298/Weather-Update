package error404.weatherupdate.Common;

import android.location.Location;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Common {
    public static final String APP_ID="76611717f7db8527cac5bff575966c83";
    public static Location current_location=null;

    public static String convertUnixToDate(long dt) {
        Date date=new Date(dt*1000L);
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("HH:mm EEE MM yyyy");
        String formatted=simpleDateFormat.format(date);
        return formatted;
    }

    public static String convertUnixToHour(long dt) {
        Date date=new Date(dt*1000L);
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("HH:mm");
        String formatted=simpleDateFormat.format(date);
        return formatted;
    }
}
