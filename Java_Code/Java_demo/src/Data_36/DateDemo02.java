package Data_36;

import java.util.Date;

/*
    public long getTime()：获取的是日期对象从1970年1月1日， 00:00:00到现在的毫秒值
    public void setTime(long time)：设置时间，给的是毫秒值
 */
public class DateDemo02 {
    public static void main(String[] args) {
        //创建日期对象
        Date d1 = new Date();

        //public long getTime()：获取的是日期对象从1970年1月1日， 00:00:00到现在的毫秒值
        System.out.println(d1.getTime() * 1.0 / 1000 / 60 / 60 / 24 / 365 + "年");

        //public void setTime(long time)：设置时间，给的是毫秒值
        long time = System.currentTimeMillis();
        d1.setTime(time);
        System.out.println(d1);

    }
}




