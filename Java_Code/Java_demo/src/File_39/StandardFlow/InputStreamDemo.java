package File_39.StandardFlow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
    public static final InputStream in：标准输入流，通常该流对应于键盘输入或由主机环境或用户指定的另一个输入源
 */
public class InputStreamDemo {
    public static void main(String[] args) throws IOException {
        //public static final InputStream in：标准输入流
//        InputStream is = System.in;
//
//        int by;
//        while((by=is.read())!=-1){
//            System.out.print((char)by);
//        }

        //如何把字节流转换为字符流？用转换流
//        InputStreamReader isr = new InputStreamReader(is);
        //使用字符流能不能实现-次读取一行数据？可以
        //但是，一次读取一行数据的方法是字符缓冲输入流的特有方法
//        BufferedReader br = new BufferedReader(isr);

        /*简写*/
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入内容：");
        String line = br.readLine();
        System.out.println("你输入的内容是：" + line);

        System.out.println("请输入一个整数：");
        int i = Integer.parseInt(br.readLine());
        System.out.println("你输入的整数是：" + i);

        //写起来太麻烦，Java就提供了一个类实现键盘录入
        Scanner sc = new Scanner(System.in);
    }
}
