package Data_36.Calendar;

import java.util.Calendar;

/*
    Calendar 为某一刻和一组字段之间的转换提供了一些方法，并为操作日历字段提供了一些方法

    Calendar 提供了一个类方法 getInstance 用于获取 Calendar 对象，其日历字段已使用当前日期和时间初始化
        Calendar rightNow = Calendar.getInstance();
 */


/*
    public abstract void add (int field, int amount)：根据日历的规则，将指定的时间量添加或减去给定的日历字段
    public final void set (int year,int month,int date)：设置当前日历的年月日
 */
public class CalendarDemo {
    public static void main(String[] args) {
        //获取对象
        Calendar c = Calendar.getInstance(); //多态的形式
        System.out.println(c);

        //public int get (int field)
//        int year = c.get(Calendar.YEAR);
//        int month = c.get(Calendar.MONTH) + 1;
//        int day = c.get(Calendar.DATE);
//        System.out.println(year + "年" + month + "月" + day + "日");

        //public abstract void add (int field, int amount)：根据日历的规则，将指定的时间量添加或减去给定的日历字段
        //需求1：3年前的5天后
//        c.add(Calendar.YEAR,-3);
//        c.add(Calendar.DATE,+5);
//        int year = c.get(Calendar.YEAR);
//        int month = c.get(Calendar.MONTH) + 1;
//        int day = c.get(Calendar.DATE);
//        System.out.println(year + "年" + month + "月" + day + "日");


        //public final void set (int year,int month,int date)：设置当前日历的年月日
        c.set(2045,9,1);
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int day = c.get(Calendar.DATE);
        System.out.println(year + "年" + month + "月" + day + "日");
    }
}



