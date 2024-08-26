import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTime {
    public static void getDate(){
        Date date = new Date();
        System.out.println(date);

        long time = date.getTime();
        System.out.println(time);
    }
    public static void dateFormat(){
        Date date =new Date();
        System.out.println(date);
        SimpleDateFormat form = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss aa");
        String formatter1 = form.format(date);
        System.out.println(formatter1);
    }
    public static void reverseDate() throws ParseException {
        String thatDay = "15-07-2020 01:30:30 PM";
        SimpleDateFormat formet = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss aa");
        try {
            Date date = formet.parse(thatDay);
            System.out.println(date);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
    public static void calender(){
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.YEAR, -1);
        calendar.add(Calendar.MONTH, 3);
        calendar.add(Calendar.DATE, 5);
        System.out.println(calendar.getTime());
    }
    public static void main(String[] args) throws ParseException {
        //getDate();
        calender();
//        dateFormat();
//        try {
//            reverseDate();
//        } catch (ParseException e) {
//            throw new RuntimeException(e);
//        }

    }
}
