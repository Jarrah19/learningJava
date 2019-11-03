package banyuan.e01;
/**
 * @author 崔英俊
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class BornDateDemo {

    public static void main(String[] args) throws ParseException {

        String birth = "1992-11-19-0-0-0-0";
        SimpleDateFormat born = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss-SSS");
        Date birthday = born.parse(birth);

        long n1 = birthday.getTime();
        long n2 = new Date().getTime();

        long timePassed = n2 - n1;

        System.out.println((timePassed/((long)1000*3600*24*365)) + "年" +
                ( ((timePassed) % ((long)1000*3600*24*365)) / ((long)1000*3600*24) )+ "天"
               );


    }

}
