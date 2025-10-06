package File_39.BufferStream;

import java.io.*;
import java.util.Arrays;

/*
    字符缓冲流的特有功能：
        BufferedWriter:
            void newLine()：写一行行分隔符，行分隔符字符串由系统属性定义

        BufferedReader:
            public String redLine()：读一行文字。
            结果包含行的内容的字符串，不包括任何行终止字符，如果流的结尾已经到达，则为null
 */
public class BufferStreamDemo03 {
    public static void main(String[] args) throws IOException {
//        //创建字符缓冲输出流
//        BufferedWriter bw = new BufferedWriter(new FileWriter("Java_demo\\File\\bw.txt"));
//
//        //写数据
//        for (int i = 0;i<10;i++){
//            bw.write("hello"+i);
//            bw.newLine();
//            bw.flush();
//        }
//        //释放资源
//        bw.close();

        //创建字符缓冲输入流
        //public String redLine()：读一行文字。
        BufferedReader br = new BufferedReader(new FileReader("Java_demo\\File\\bw.txt"));

        //public String redLine()：读一行文字。
        String line;
        while ((line=br.readLine())!=null){
            System.out.println(line);
        }

        br.close();
    }
}

















