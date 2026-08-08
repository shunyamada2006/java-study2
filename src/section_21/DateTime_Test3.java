package section_21;
import java.util.Date;
import java.text.SimpleDateFormat;
public class DateTime_Test3 {
    public static void main(String[]args){

        Date date =new Date();
        SimpleDateFormat format =new SimpleDateFormat();
        System.out.println(format.format(date));
    }
}
